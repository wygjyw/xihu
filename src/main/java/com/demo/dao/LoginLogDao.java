package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class LoginLogDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int getMatchCount(String userName, String password)
	{
		String sqlStr = " SELECT count(*) FROM t_user WHERE username=? and password =?";
		return jdbcTemplate.qureyForInt(sqlStr, new Object[] {userName, password});
	}
}

