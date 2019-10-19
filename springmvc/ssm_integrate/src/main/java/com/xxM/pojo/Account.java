package com.xxM.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Program: IntelliJ IDEA sm
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-17 10:55:41 周四
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Data
public class Account implements Serializable {
    private Integer id;
    private String name;
    private Double money;
}
