package com.xxM.exception;

import lombok.Data;

import java.io.InputStream;

/**
 * @Program: IntelliJ IDEA sm
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-17 13:43:34 周四
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Data
public class InputException extends RuntimeException {
    private Integer code;
    private String msg;
    public InputException(Integer code,String msg){
        this.code=code;
        this.msg=msg;
    }
}
