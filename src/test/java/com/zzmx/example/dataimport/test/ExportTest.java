package com.zzmx.example.dataimport.test;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.zzmx.example.dataimport.test.dto.MaterialDTO;
import com.zzmx.example.dataimport.util.ExcelUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @CreateUser Kevin.Zhou
 * @CreateTime 2018/1/26 20:24
 * @ModifyUser Kevin.Zhou
 * @ModifiedTime 2018/1/26 20:24
 * @Version 1.0
 */
public class ExportTest {


    public static void main(String[] args) throws IOException {

        OutputStream os = new FileOutputStream("C:\\Users\\Super-Admin\\Desktop\\export.xls");


        final LinkedHashMap headers = Maps.newLinkedHashMap();
        headers.put("material", "物料编码");
        headers.put("materialName", "物料名称");
        headers.put("materialPicNum", "型号");
        headers.put("materialDesc", "物料描述");
        headers.put("materialSpec", "物料规格");
        headers.put("unitCode", "单位编码");


        List<MaterialDTO> list = Lists.newArrayList();

        MaterialDTO dto = null;
        for (int i = 0; i < 10000; i++) {
            dto = new MaterialDTO();
            dto.setMaterial("物料编码 " + i);
            dto.setMaterialName("物料名称：" + i);
            dto.setMaterialPicNum("物料型号：" + i);
            dto.setMaterialDesc("物料描述：" + i);
            dto.setMaterialSpec("物料规格：" + i);
            dto.setUnitCode("001");

            list.add(dto);
        }

        ExcelUtils.exportExcel("物料信息", headers, list, os);


        os.close();
    }
}
