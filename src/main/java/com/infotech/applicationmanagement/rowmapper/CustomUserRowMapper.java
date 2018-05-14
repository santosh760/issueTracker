package com.infotech.applicationmanagement.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.infotech.applicationmanagement.domain.User;

/**
 * This class provide functionality to add User data from database using row mapper
 * @author Bhushan Medage
 *
 */

public class CustomUserRowMapper implements RowMapper<User> {

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		User user = new User();
	    user.setId(rs.getInt(1));
	    user.setName(rs.getString("name"));
	    user.setEmail(rs.getString("email"));
	    user.setContact(rs.getString("contact"));
	    user.setUserid("userid");    
	    user.setPassword(rs.getString("password"));
	   
		
		return user;
	}

}
