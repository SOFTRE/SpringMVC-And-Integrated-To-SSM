package com.xxM.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @Program: IntelliJ IDEA sm
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-17 13:41:21 周四
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Component
public class CustomException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("errmsg");
        if (ex instanceof InputException) {
            InputException inputException = (InputException) ex;
            modelAndView.addObject("msg", inputException);
            return modelAndView;
        }
        if (ex instanceof BusinessException) {
            BusinessException businessException = (BusinessException) ex;
            modelAndView.addObject("msg", businessException);
            return modelAndView;
        }
        RunTimeException runTimeException = new RunTimeException(500, ex.getMessage());
        modelAndView.addObject("msg", runTimeException);
//        String msg=ex.getMessage();
//        String msgMd5=null;
//        Map<String,Integer> map=new HashMap<>();
//        map.put(msgMd5,1);
//        //开始发邮件
//        if (map.get(msgMd5)>1){
//            //不需要发邮件
//        }
        return modelAndView;
//        try {
//            InputException inputException=(InputException)ex;
//            modelAndView.addObject("msg",inputException);
//        } catch (Exception e) {
//            try {
//                BusinessException businessException=(BusinessException)ex;
//                modelAndView.addObject("msg",businessException);
//            } catch (Exception exc) {
//                RunTimeException runTimeException=new RunTimeException(500,ex.getMessage());
        // modelAndView.addObject("msg",runTimeException);
//            }
//        }
//        return modelAndView;
    }
}
