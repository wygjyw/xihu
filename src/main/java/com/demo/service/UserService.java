package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.LoginLogDao;
import com.demo.dao.UserDao;
import com.demo.domain.LoginLog;
import com.demo.domain.User;


@Service
public class UserService
{
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private LoginLogDao loginLogDao;
	
	public boolean hasMatchUser(String userName, String password)
	{
		int matchCount = userDao.getMatchCount(userName, password);
		return matchCount > 0;
	}
	
	public User findUserByUserName(String userName)
	{
		return userDao.findUserByUserName(userName);
	}
	
	public void loginSuccess(User user)
	{
		LoginLog loginLog = new LoginLog();
		loginLog.setUserId(user.getUserId());
		loginLog.setLoginDate(user.getLastLogDate());
		loginLog.setLoginIP(user.getLastLogIP());
		loginLogDao.insertLoginInfo(loginLog);
	}
}


