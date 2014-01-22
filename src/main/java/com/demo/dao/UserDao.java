package com.demo.dao;

import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.domain.User;


@Repository
public class UserDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int getMatchCount(String userName, String password)
	{
		String sqlStr = " SELECT count(*) FROM t_user WHERE username=? and password =?";
		return jdbcTemplate.qureyForInt(sqlStr, new Object[] {userName, password});
	}
	
	public User findUserByUserName(final String userName)
	{
		String sqlStr = " SELECT userid,username FROM t_user WHERE username=?";
		User user = new User();
		jdbcTemplate.query(sqlStr, new Object[] {userName},
				new RowCallbackHandle()
		{
			public void processRow(ResultSet rs) throws SQLException
			{
				user.setUserId(rs.getInt("userid"));
				user.setUserName(userName);
			}
		});
		return user;
	}
	
	public void updateLoginInfo(User user)
	{
		String sqlStr = " UPDATE t_user SET lastlogdate=?,lastlogip=? WHERE userid=?";
		jdbcTemplate.update(sqlStr, new Object[] {user.getLastLogDate(), user.getLastLogIP(), user.getUserId());
	}
}

