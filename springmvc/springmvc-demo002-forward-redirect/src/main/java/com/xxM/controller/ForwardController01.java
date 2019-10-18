package com.xxM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Program: IntelliJ IDEA springmvc
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-15 20:06:06 周二
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Controller
public class ForwardController01 {
    @RequestMapping("/forward01")
    public String forwardToOtherPage(){
        return "forward:index1.jsp";
    }
}
