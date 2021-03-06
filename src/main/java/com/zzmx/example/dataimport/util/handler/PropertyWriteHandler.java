package com.zzmx.example.dataimport.util.handler;

import org.apache.poi.ss.usermodel.Cell;

import java.lang.reflect.InvocationTargetException;

/**
 * ${DESCRIPTION}
 *
 * @CreateUser Kevin.Zhou
 * @CreateTime 2018/1/26 20:20
 * @ModifyUser Kevin.Zhou
 * @ModifiedTime 2018/1/26 20:20
 * @Version 1.0
 */
public interface PropertyWriteHandler<T> {

    default boolean support(String fieldName){
        return true;
    }

    void writeValue(Cell cell, T bean, String fieldName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException;

}