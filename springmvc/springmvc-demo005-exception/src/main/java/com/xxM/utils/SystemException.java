package com.xxM.utils;

import lombok.Data;

/**
 * @Program: IntelliJ IDEA springmvc
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-15 13:03:35 周二
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Data
public class SystemException extends Exception {
    private Integer code;
    private String msg;

    public SystemException() {
    }

    public SystemException(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public SystemException(String message, Integer code, String msg) {
        super(message);
        this.code = code;
        this.msg = msg;
    }

    public SystemException(String message, Throwable cause, Integer code, String msg) {
        super(message, cause);
        this.code = code;
        this.msg = msg;
    }

    public SystemException(Throwable cause, Integer code, String msg) {
        super(cause);
        this.code = code;
        this.msg = msg;
    }

    public SystemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Integer code, String msg) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
