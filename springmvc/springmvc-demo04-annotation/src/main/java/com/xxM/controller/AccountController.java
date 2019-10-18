package com.xxM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Program: IntelliJ IDEA springmvc
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-14 14:05:28 周一
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @RequestMapping(method = RequestMethod.POST)
    public String add() {
        System.out.println("AccountController---->add");
        return "success";
    }

    @RequestMapping(method = RequestMethod.PUT)
    public String update() {
        System.out.println("AccountController---->update");
        return "success";
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public String delete() {
        System.out.println("AccountController---->delete");
        return "success";
    }

    @RequestMapping(path = "/{id}",method = RequestMethod.GET)
    public String findById(@PathVariable(name = "id") Integer id1) {
        System.out.println("AccountController---->findById");
        System.out.println("============"+id1);
        return "success";
    }

}
