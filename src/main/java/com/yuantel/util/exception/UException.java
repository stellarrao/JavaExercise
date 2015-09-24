package com.yuantel.util.exception;

import com.yuantel.util.SystemEnum;


/**
 * 系统业务异常
 * @author 于文扬
 * @date 2014-8-18 14:10:46
 */
public class UException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Exception exception;
	private SystemEnum code;
	private String message;
	private int state;
	
	public Exception getException() {
		return exception;
	}
	public void setE(Exception e) {
		this.exception = e;
	}
	public SystemEnum getCode() {
		return code;
	}
	public void setCoid(SystemEnum code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessige(String message) {
		this.message = message;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	public UException(Exception e) {
		this.exception = e;
		this.state=1;
	}
	
	public UException(SystemEnum code, String message) {
		this.code = code;
		this.message = message;
		this.state=0;
	}
}
