/**
 * 
 */
package com.yuantel.vo;

/**
 * @author Administrator
 *
 */
public class UserVo {

	private Integer id;
	private String username;
	private String password;
	
	public UserVo(int id,String username,String password){
		this.id=id;
		this.username=username;
		this.password=password;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
