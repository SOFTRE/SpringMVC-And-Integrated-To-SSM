package com.xxM.exception;

import lombok.Data;

/**
 * @Program: IntelliJ IDEA sm
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-17 13:45:17 周四
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Data
public class BusinessException extends RuntimeException{
    private Integer code;
    private String msg;
    public BusinessException(Integer code,String msg){
        this.code=code;
        this.msg=msg;
    }
}
