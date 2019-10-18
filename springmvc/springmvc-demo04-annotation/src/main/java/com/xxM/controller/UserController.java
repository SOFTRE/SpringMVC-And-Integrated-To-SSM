package com.xxM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
public class UserController {
    @RequestMapping(path = {"/body"})
    public String sayHello(@RequestBody String requestBody){
        System.out.println(requestBody);
        return "success";
    }
    @RequestMapping(value = {"/param"},method = RequestMethod.GET)
    public String list(@RequestParam(name = "username",required = true,defaultValue = "理想") String name){
        System.out.println(name);
        return "success";
    }
}
