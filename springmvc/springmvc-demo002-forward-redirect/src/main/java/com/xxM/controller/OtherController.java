package com.xxM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Program: IntelliJ IDEA springmvc
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-14 22:24:53 周一
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Controller
@RequestMapping("/other")
public class OtherController {
    @RequestMapping("/otherpage")
    public String otherpage(){
        return "otherpage";
    }
}
