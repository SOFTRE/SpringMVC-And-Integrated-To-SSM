package com.xxM.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Program: IntelliJ IDEA springmvc
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-14 09:23:53 周一
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Data
public class Account implements Serializable {
    private Integer id;
    private String name;
    private double money;

    private Address address;
}
