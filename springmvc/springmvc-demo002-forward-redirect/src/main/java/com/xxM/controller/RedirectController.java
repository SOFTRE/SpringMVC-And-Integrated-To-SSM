package com.xxM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Program: IntelliJ IDEA springmvc
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-14 22:36:02 周一
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Controller
@RequestMapping("/redirect")
public class RedirectController {
    /**
     * 重定向index1.jsp不能放在WEB-INF里面，否则访问不到
     * 也就是不支持重定向到受保护的页面上
     * @return
     */
    @RequestMapping("/redirectToOtherPage")
    public String redirectToOtherPage(){
        return "redirect:/index1.jsp";
    }
    @RequestMapping("/redirectToOtherController")
    public String redirectToOtherController(){
        return "redirect:/other/otherpage";
    }
}
