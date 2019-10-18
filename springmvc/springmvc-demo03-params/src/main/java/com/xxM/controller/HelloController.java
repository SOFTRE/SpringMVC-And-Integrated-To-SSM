package com.xxM.controller;

import com.xxM.pojo.Account;
import com.xxM.pojo.User;
import com.xxM.pojo.User02;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * @Program: IntelliJ IDEA springmvc
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-13 22:06:34 周日
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Controller
@RequestMapping(value = {"/user"})
public class HelloController {
    /**
     * 基本类型参数(请求的参数名称必须和对应的对应的方法的形参名称一样)
     *
     * @param name name
     * @param age  age
     * @return String
     */
    @RequestMapping(path = {"/add"})
    public String map01(String name, Integer age) {
        System.out.println(":" + name + "---" + age);
        return "success";
    }

    /**
     * JavaBean
     * 1 简单JavaBean要求form标签里面的input标签的name属性值必须和对应的JavaBean的属性名称一致
     * 2 封装JavaBean要求form标签里面的input标签的name属性必须和相关属性对应的JavaBean中的属性名一致
     * @param account
     * @return
     */
    @RequestMapping(path = {"/account"}, method = {RequestMethod.POST})
    public String map02(Account account) {
        System.out.println("::" + account);
        return "success";
    }

    /**
     * JavaBean-List
     * 1.封装JavaBean，要求form标签内的input标签内的input标签的name属性写成'对应属性名'+'[索引]' +'相关属性对应的JavaBean中的属性名'account[0]
     * @param user user
     * @return String
     */
    @RequestMapping(path = {"/list"})
    public String map03(User user){
        System.out.println(":::"+user);
        return "success";
    }
    /**
     * JavaBean-Map
     * 1.封装JavaBean，要求form标签内的input标签内的input标签的name属性写成
     *   '对应属性名'+'[key]' +'相关属性对应的JavaBean中的属性名'accountMap['zs']
     * @param user02 user
     * @return String
     */
    @RequestMapping(path = {"/map"})
    public String map04(User02 user02){
        System.out.println("::::"+user02);
        return "success";
    }

    /**
     *
     * @param date
     * @return
     */
    @RequestMapping(path = {"/myParam"})
    public String map05(Date date, HttpServletRequest request, HttpServletResponse response, HttpSession session){
        String name=request.getParameter("name");
        System.out.println(date.toLocaleString()+"::::::"+name);
        return "success";
    }
}
