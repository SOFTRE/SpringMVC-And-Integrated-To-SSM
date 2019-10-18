package com.xxM.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Program: IntelliJ IDEA SpringMVC
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-13 20:18:32 周日
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello(){
        return "success";
    }
}
