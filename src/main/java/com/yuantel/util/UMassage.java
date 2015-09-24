package com.yuantel.util;


public class UMassage {

	private SystemEnum code;
	private String message;
	public Integer getCode() {
		return code.value();
	}
	public void setCode(SystemEnum code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public UMassage(SystemEnum code, String message) {
		this.code = code;
		this.message = message;
	}
	public UMassage() {
	}
	@Override
	public String toString() {
		return "UMassage [code=" + code.value() + ", message=" + message + "]";
	}
	
	
}
