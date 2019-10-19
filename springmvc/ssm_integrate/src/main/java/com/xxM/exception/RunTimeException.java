package com.xxM.exception;

import lombok.Data;

/**
 * @Program: IntelliJ IDEA sm
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-17 13:57:55 周四
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Data
public class RunTimeException extends RuntimeException {
    private Integer code;
    private String msg;
    public RunTimeException(Integer code,String msg){
        this.code=code;
        this.msg=msg;
    }
}
