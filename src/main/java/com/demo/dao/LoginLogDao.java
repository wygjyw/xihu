package com.demo.dao;

import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.domain.LoginLog;

@Repository
public class LoginLogDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	public void updateLoginInfo(LoginLog loginLog)
	{
		String sqlStr = " INSERT INTO t_loginlog(userid, logdate, logip) VALUES(?, ?, ?)";
		jdbcTemplate.update(sqlStr, new Object[] {loginLog.getUserId(), loginLog.getLoginDate(), loginLog.getLoginIP());
	}
}

