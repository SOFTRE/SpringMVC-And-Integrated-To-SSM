package com.xxM.controller;

import com.xxM.pojo.User;
import com.xxM.utils.UploadUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

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
@RequestMapping("/fileupload")
public class FileUpLoadController {
    @RequestMapping(value = "/file",method = RequestMethod.POST)
    public String file(HttpServletRequest request,MultipartFile fileupload) throws IOException {
        int i=1/0;
        String name=fileupload.getOriginalFilename();
        String name1=UUID.randomUUID().toString()+".jpg";
        String name2=UploadUtils.getUUIDName(name);
        String contentType=fileupload.getContentType();
        String basePath = request.getSession().getServletContext().getRealPath("fileupload");
        System.out.println(name+"--->"+contentType+"--->"+basePath);
        String path=basePath+"/"+ UploadUtils.getDir();
        File file=new File(path);
        file.mkdirs();
        fileupload.transferTo(new File(path+"/"+name2));
        return  "success";
    }
}
