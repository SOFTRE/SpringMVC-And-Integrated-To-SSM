package com.xxM.controller;

import com.xxM.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Program: IntelliJ IDEA springmvc
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-14 23:09:24 周一
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Controller
@RequestMapping("/response")
public class ResponseBodyController {
    @RequestMapping("/testJson")
    public @ResponseBody User testJson(User user){
        System.out.println("收到了请求..."+user);
        user.setName("李四");
        return  user;
    }
}
