package com.demo.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int userId;
	private String userName;
	private String password;
	private Date lastLogDate;
	private String lastLogIP;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getLastLogDate() {
		return lastLogDate;
	}
	public void setLastLogDate(Date lastLogDate) {
		this.lastLogDate = lastLogDate;
	}
	public String getLastLogIP() {
		return lastLogIP;
	}
	public void setLastLogIP(String lastLogIP) {
		this.lastLogIP = lastLogIP;
	}
}

