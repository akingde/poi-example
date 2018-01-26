package com.zzmx.example.dataimport.util.handler;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;

import java.lang.reflect.InvocationTargetException;

/**
 * ${DESCRIPTION}
 *
 * @CreateUser Kevin.Zhou
 * @CreateTime 2018/1/26 20:21
 * @ModifyUser Kevin.Zhou
 * @ModifiedTime 2018/1/26 20:21
 * @Version 1.0
 */
public class DefaultPropertyWriteWriteHandler<T> implements PropertyWriteHandler<T> {

    @Override
    public void writeValue(Cell cell, T bean, String fieldName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Object value = PropertyUtils.getProperty(bean, fieldName);
        if (value instanceof Boolean) {
            cell.setCellType(CellType.BOOLEAN);
        }
        if (value instanceof Integer || value instanceof Double || value instanceof Float) {
            cell.setCellType(CellType.NUMERIC);
        }
        if (value instanceof String) {
            cell.setCellType(CellType.STRING);
        }
        String strValue = "";
        if (value != null) {
            strValue = value.toString();
        }

        cell.setCellValue(strValue);
    }
}