package com.zzmx.example.dataimport.test;

import com.google.common.collect.Lists;
import com.zzmx.example.dataimport.test.dto.MaterialDTO;
import com.zzmx.example.dataimport.util.ExcelUtils;
import com.zzmx.example.dataimport.util.handler.CellReadHandler;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.text.MessageFormat;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * ${DESCRIPTION}
 *
 * @CreateUser Kevin.Zhou
 * @CreateTime 2018/1/26 20:33
 * @ModifyUser Kevin.Zhou
 * @ModifiedTime 2018/1/26 20:33
 * @Version 1.0
 */
public class ImportTest {

    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();

        InputStream is = new FileInputStream("C:\\Users\\Super-Admin\\Desktop\\export.xls");


        final List<String> colums = Lists.newArrayList("", "material", "materialName", "materialPicNum", "materialDesc", "materialSpec", "unitCode");

        final LinkedBlockingQueue<MaterialDTO> dataList = new LinkedBlockingQueue();

        AtomicBoolean readCompleted = new AtomicBoolean(false);

        Thread readThread = new Thread(() -> {
            try {
                ExcelUtils.readExcelWithTitle(is, 0, MaterialDTO.class, colums, dataList, new CellReadHandler<MaterialDTO>() {
                    @Override
                    public void readValue(Cell cell, MaterialDTO bean, String fieldName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
                        PropertyUtils.setProperty(bean,fieldName,cell.getStringCellValue());
                    }

                    @Override
                    public void onReaded(Cell cell, MaterialDTO bean, String fieldName) {
                        Sheet sheet = cell.getSheet();
                        int lastRowNum = sheet.getLastRowNum();

                        int rowIndex = cell.getRowIndex();

                        if (lastRowNum == rowIndex) {
                            readCompleted.compareAndSet(false, true);
                        }
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        readThread.start();


        ExecutorService executorService = Executors.newFixedThreadPool(1);

        int count = 0;
        while (!readCompleted.get()) {
            MaterialDTO dto = dataList.poll();
            if(dto != null) {
//                executorService.execute(() -> System.out.println(dto));
                count++;
            }
        }
        MaterialDTO dto = null;
        while ((dto = dataList.poll()) != null){
            count++;
        }


        readThread.join();
        executorService.shutdown();
        System.out.println(MessageFormat.format("导入完毕。共导入{0}条记录，耗时：{1}", count, (System.currentTimeMillis() - startTime)));

        is.close();
    }
}
