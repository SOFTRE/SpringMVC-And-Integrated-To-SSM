package com.xxM.utils;

import java.util.Random;
import java.util.UUID;

public class UploadUtils {
	
	/**
	 * 获取随机名称
	 * @param
	 * @return uuid 随机名称
	 */
	public static String getUUIDName(String fileName){
		//realname  eg: 1.jpg  
		//获取后缀名
		int index = fileName.lastIndexOf(".");
		if(index==-1){
			return UUID.randomUUID().toString().replace("-", "").toUpperCase();
		}else{
			return UUID.randomUUID().toString().replace("-", "").toUpperCase()+fileName.substring(index);
		}
	}
	/**
	 * 获取文件目录,可以获取256个随机目录
	 * @return 随机目录
	 */
	public static String getDir(){
		String s="0123456789ABCDEF";
		Random r = new Random();
		return "/"+s.charAt(r.nextInt(16))+"/"+s.charAt(r.nextInt(16));
	}

}
