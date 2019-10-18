package com.xxM.exception;

import com.xxM.utils.SystemException;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Program: IntelliJ IDEA springmvc
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-15 13:07:40 周二
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Component
public class HandlerExceptionResolver implements org.springframework.web.servlet.HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        SystemException systemException=new SystemException();
        systemException.setCode(500);
        systemException.setMsg(ex.getMessage());
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("errmsg",systemException);
        modelAndView.setViewName("errmsg");
        return modelAndView;
    }
}
