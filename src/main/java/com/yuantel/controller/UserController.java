/**
 * 
 */
package com.yuantel.controller;

import java.util.List;

import org.apache.logging.log4j.core.pattern.ConverterKeys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yuantel.bll.IUserBll;
import com.yuantel.vo.UserVo;

/**
 * @author Administrator
 *
 */
@Controller
public class UserController extends BaseController {

	@Autowired
	private IUserBll userBll;
	/** 
	* @Title: getUserList 
	* @Description: TODO
	* @param @return    设定文件 
	* @return List<UserVo>    返回类型 
	* @throws 
	*/
	@RequestMapping(value="/user/get")
	public @ResponseBody List<UserVo> getUserList(){
		
		return userBll.getUserList();
	}
	
}
