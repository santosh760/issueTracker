package com.infotech.applicationmanagement.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.infotech.applicationmanagement.domain.Application;
import com.infotech.applicationmanagement.domain.User;
/**
 * This class provide functionality to add issue data from database using row mapper
 * @author Bhushan Medage
 *
 */
public class CustomApplicationRowMapper implements RowMapper<Application> {

	public Application mapRow(ResultSet rs, int i) throws SQLException {
		Application  issue = new Application();
		issue.setId(rs.getInt(1));
		issue.setIssuename(rs.getString("name"));
		issue.setUserid("userid");
		issue.setIsActive(1);
		issue.setCreatedDateTime(rs.getString("cratedDateTime"));		
		issue.setLastModifiedDateTime(rs.getString("lastModifiedDateTime"));
		issue.setCreatedBy(rs.getString("createdBy")); 
		issue.setLastModifiedBy(rs.getString("lastModifiedBy"));
		
		return issue;
	}

}
