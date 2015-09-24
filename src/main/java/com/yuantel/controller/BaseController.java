package com.yuantel.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yuantel.util.SystemEnum;
import com.yuantel.util.UMassage;
import com.yuantel.util.USystem;
import com.yuantel.util.exception.UException;

@Controller
public class BaseController {
	
	/** 基于@ExceptionHandler异常处理 
	 * @return 消息通知类*/
	
	private static Logger logger = LogManager.getLogger(BaseController.class);
	
	@Autowired
	private	UMassage umassage;
	@Autowired
	private USystem uSystem;
	
	
	@ExceptionHandler(UException.class)
	public @ResponseBody String exp( HttpServletRequest request, UException uException) {
		
		if(Boolean.valueOf(uSystem.getLogStatus())){
			uException.getException().printStackTrace();
		}
	
		switch (uException.getState()) {
		case 0:
			umassage.setCode(uException.getCode());
			String massage=uException.getMessage();
			umassage.setMessage(massage);
			break;
		case 1:
		Exception e=uException.getException();
		Throwable th=e.getCause();
			if(th instanceof PersistenceException){
				umassage.setCode(SystemEnum.SERVER_REFUSED);
				umassage.setMessage("数据库连接失败");
				break;
			}else if(th instanceof NoSuchAlgorithmException){
				umassage.setCode(SystemEnum.EN_CODE_MD5_EXCEPTION);
				umassage.setMessage("加密错误");
				break;
			}else if(th instanceof UnsupportedEncodingException){
				umassage.setCode(SystemEnum.CODING_EXCEPTION);
				umassage.setMessage("编码错误");
				break;
			}else if(th instanceof IOException){
				umassage.setCode(SystemEnum.FILE_READ_WRITE_EXCEPTION);
				umassage.setMessage("文件读写错误");
				break;
			}
			else{
				umassage.setCode(SystemEnum.UNKNOW_EXCEPTION);
				umassage.setMessage("未知异常,请与管理员联系");
				break;
			}		
		}
		return umassage.toString();		
	}
}