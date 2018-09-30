/**
 * 
 */
package com.zl.mongodb;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author	zhanglei
 * @date	2018年8月23日
 * @Description	
 */
@Document(collection="moob")
public class User {

	private String username;
	private String password;
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
