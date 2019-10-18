package com.xxM.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Program: IntelliJ IDEA springmvc
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-14 09:39:39 周一
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Data
public class Address implements Serializable {
    private String provinceName;
    private String cityName;
}
