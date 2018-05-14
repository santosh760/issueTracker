package com.infotech.applicationmanagement.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.infotech.applicationmanagement.dao.UserDao;
import com.infotech.applicationmanagement.domain.Application;
import com.infotech.applicationmanagement.domain.User;
import com.infotech.applicationmanagement.rowmapper.CustomApplicationRowMapper;
import com.infotech.applicationmanagement.rowmapper.CustomUserRowMapper;



/**
 * This Class will provide implementation method of UserDao interface using DbUtil Class of database.
 * @author Bhushan Medage
 *
 */
@Repository("dao")
public class UserDaoImpl implements UserDao {

	Connection con = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	/**
	 * This method is implementation of registerUser
	 * It will register user into database
	 */
	public int registerUser(User user) {
		String sql = "insert into users(name,contact,email,userid,password,isActive,createdDateTime,lastModifiedDateTime,createdBy,LastModifiedBy) values(?,?,?,?,?,?,?,?,?,?)";
		System.out.println(user.getName());
		
		int i = jdbcTemplate.update(sql, new Object[] {user.getName(),user.getContact(),user.getEmail(),user.getUserid(),user.getPassword(),user.getIsActive(),user.getCreatedDateTime(),user.getLastModifiedDateTime(),user.getCreatedBy(),user.getLastModifiedDateTime()});
		if(i>0) {
			return i;
		}
		return 0;
	}

	/**
	 * This method is implementation of login user
	 * It will allow user to use the application
	 */
	


	public User loginUser( String username) {
		String sql=null;
		User user = null;
		
			
				sql = "select * from users where userid = ? ";
				user = new User();
				user=jdbcTemplate.queryForObject(sql, new CustomUserRowMapper(), username);
			
			return user;
	}


	public int addIssues(Application issue) {
		String sql = "insert into issue_application(name,userid,cratedDateTime,createdBy) values(?,?,?,?)";
		int i = jdbcTemplate.update(sql, new Object[] {issue.getIssuename(),issue.getId(),issue.getCreatedDateTime(),issue.getCreatedBy()});
		if(i>0) {
			return i;
		}
		return 0;
	}


	public List<Application> listissue(Integer userid) {
		
			
			String sql="select * from issue_application where userid=?";
			
			List<Application> issuelist=new ArrayList<Application>();
			issuelist=jdbcTemplate.query(sql, new CustomApplicationRowMapper(),userid);
			
			return issuelist;
		
	}


	public int updateissue(Integer id ,Application issue) {
		
		System.out.println("Idddddddddddd"+id);
		String sqlUpdate = "UPDATE issue_application set name=?,lastModifiedDateTime=?,lastModifiedBy=? where id=?";
        int i=jdbcTemplate.update(sqlUpdate,new Object[] {issue.getIssuename(),issue.getLastModifiedDateTime(),issue.getLastModifiedBy(),id});
		if(i>0){
			return i;
		}
        return 0;
	}


	public int Deleteissue(Integer id) {
		
		String DELETE = " DELETE FROM issue_application WHERE id=?";
	    int i=jdbcTemplate.update(DELETE, id);
		if(i>0) {
			return i;
		}
		return 0;
	}


	public List<Application> listissue(String startdate, String enddate , Integer userid) {
		
		String sqlsubstrin="SELECT SUBSTRING(CustomerName, 2, 5) AS ExtractString FROM Customers";
			
		System.out.println("Stsrt Dateeeeeee"+startdate);
		System.out.println("Endd Dateeeeeee"+enddate);
		
		String sql="select * from issue_application where date(cratedDateTime ) >=?   && date(cratedDateTime ) <=? && userid=?";
		
		List<Application> issuelist=new ArrayList<Application>();
		issuelist=jdbcTemplate.query(sql, new CustomApplicationRowMapper(),startdate,enddate,userid);
		
		return issuelist;
	}


	
	
}
