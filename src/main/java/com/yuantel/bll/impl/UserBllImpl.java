/**
 * 
 */
package com.yuantel.bll.impl;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import com.yuantel.vo.UserVo;
import com.yuantel.bll.IUserBll;
import com.yuantel.entity.User;
import com.yuantel.service.IUserService;


/**
 * @author Administrator
 *
 */
public class UserBllImpl implements IUserBll {
	@Autowired
	private IUserService userService;
/* (非 Javadoc) 
* <p>Title: getUserList</p> 
* <p>Description: </p> 
* @return 
* @see com.yuantel.bll.IUserBll#getUserList() 
*/
@Override
public List<UserVo> getUserList() {
	// TODO Auto-generated method stub
	List<User> users = userService.getUserList();
	List<UserVo> userVo = new ArrayList<UserVo>();
	for(User user : users)
	{
		userVo.add(new UserVo(user.getId(),
							  user.getUsername(),
							  user.getPassword()));
	}
	return userVo;
}
}
