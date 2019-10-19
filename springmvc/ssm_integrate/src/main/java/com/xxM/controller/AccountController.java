package com.xxM.controller;

import com.xxM.exception.InputException;
import com.xxM.pojo.Account;
import com.xxM.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Program: IntelliJ IDEA sm
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-17 10:54:33 周四
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping(method = RequestMethod.POST)
    public String save(Account account) {
        if (account==null){
            throw new InputException(100001,"account参数不能为空");
        }
        System.out.println("AccountController-->save()");
        accountService.save(account);
        return "success";
    }

    @RequestMapping(path = "/{id}",method = RequestMethod.DELETE)
    public String deleteById(@PathVariable Integer id) {
        System.out.println("AccountController-->deleteById()");
        accountService.delete(id);
        return "success";
    }

    @RequestMapping(path = "/{id}",method = RequestMethod.GET)
    public String findById(@PathVariable Integer id) {
        System.out.println("AccountController-->findById()");
        return "success";
    }
    @RequestMapping(method = RequestMethod.PUT)
    public String update(Account account) {
        System.out.println("AccountController-->update()");
        return "success";
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView findAll() {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("list",accountService.findAll());
        System.out.println("AccountController-->findAll()");
        modelAndView.setViewName("account/list");
        return modelAndView;
    }
}
