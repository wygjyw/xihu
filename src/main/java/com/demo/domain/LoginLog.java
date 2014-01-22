package com.demo.domain;

import java.io.Serializable;
import java.util.Date;

public class LoginLog implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int loginId;
	private int userId;
	private Date loginDate;
	private String loginIP;
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
	public String getLoginIP() {
		return loginIP;
	}
	public void setLoginIP(String loginIP) {
		this.loginIP = loginIP;
	}
}