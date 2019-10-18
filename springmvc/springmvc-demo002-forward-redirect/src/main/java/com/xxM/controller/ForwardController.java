package com.xxM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

/**
 * @Program: IntelliJ IDEA springmvc
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-14 20:50:08 周一
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Controller
@RequestMapping("/forward")
public class ForwardController {
    @RequestMapping(path = "/forwardToOtherPage",method = RequestMethod.GET)
    public String forwardToOtherPage(){
        return "forward:/WEB-INF/pages/otherpage.jsp";
    }
    @RequestMapping(path = "/forwardToOtherController",method = RequestMethod.GET)
    public String forwardToOtherController(){
        return "forward:/other/otherpage";
    }

}
