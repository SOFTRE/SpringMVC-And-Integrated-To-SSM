package com.xxM.converters;


import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Program: IntelliJ IDEA springmvc
 * @Description: Converter<String,Date>
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-14 10:56:06 周一
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
public class DateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String source) {
        try {
            if (StringUtils.isEmpty(source)){
                throw new RuntimeException("字符串不能为空！");
            }
            return new SimpleDateFormat("yyyy-MM-dd").parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
