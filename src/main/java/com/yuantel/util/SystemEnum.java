package com.yuantel.util;

/**
 * @author 李凯
 * @date 2014-10-13 16:14
 * @version 1.0
 * 系统操作
 */
public enum SystemEnum {
	/**
	 * 登录成功
	 */
	LOGIN_SUCCESS(1000),
	/**
	 * 用户名或密码错误
	 */
	USER_PASSWORD_VAILD_FAILURE(1001),
	/**
	 * 用户不存在  
	 */
	USER_NOT_EXISTS(1002),

	 /**
	 * 密码过期请修改密码
	 */
	PASSWORD_EXPIRE(1003),
	 /**
	 * 用户被停用请与管理员联系
	 */
	USER_DISABLED(1004),
	 /**
	 * 用户超过使用时间已被删除
	 */
	USER_EXPIRE(1005),
	 
	 /**
	 * 添加成功
	 */
	ADD_SUCCESS(2000),
	 /**
	 * 添加失败
	 */
	ADD_FAILURE(2001),
	 /**
	 * 业务已存在
	 */
	ADD_ALREADY_EXISTS(2002),
	 
	 /**
	 * 删除成功
	 */
	DELETE_SUCCESS(3000),
	 /**
	 * 删除失败
	 */
	DELETE_FAILURE(3001),
	 
	 /**
	 * 查询失败
	 */
	QUERY_FAILURE(4000),
	 
	 /**
	 * 更新成功
	 */
	UPDATE_SUCCESS(5000),
	 /**
	 * 更新失败
	 */
	UPDATE_FAILURE(5001),
	 /**
	 * 重置密码成功
	 */
	UPDATE_PASSWORD_SUCCESS(5002),
	 /**
	 * 重置密码失败
	 */
	UPDATE_PASSWORD_FAILURE(5003),
	
	/**
	 * 服务器连接失败
	 */
	SERVER_REFUSED(6000),
	/**
	 * 加密异常
	 */
	EN_CODE_MD5_EXCEPTION(7000),
	/**
	 * 编码异常
	 */
	CODING_EXCEPTION(8000),
	/**
	 * 文件读写异常
	 */
	FILE_READ_WRITE_EXCEPTION(9000),
	/**
	 * 未知错误
	 */
	UNKNOW_EXCEPTION(10000),
	/**
	 * 没有权限
	 */
	No_AUTHORIZATION(6001);
	
	 private final Integer value;  
	    
	  /**
	 * @param value
	 */
	private SystemEnum(Integer value){  
	      this.value=value;  
	  }  
	    
	  /**
	 * @return
	 */
	public Integer value(){  
	      return value;  
	  }  
}
