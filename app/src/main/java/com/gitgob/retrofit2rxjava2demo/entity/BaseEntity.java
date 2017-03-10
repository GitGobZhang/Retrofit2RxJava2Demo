package com.gitgob.retrofit2rxjava2demo.entity;

import java.io.Serializable;

/**
 * @version V1.0 <描述当前版本功能>
 * @FileName:BaseEntity.java
 * @author: Zch
 * @date: 2017-03-10 13:25
 */
public class BaseEntity<E> implements Serializable {
    private int code;
    private String message;
    private E data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
