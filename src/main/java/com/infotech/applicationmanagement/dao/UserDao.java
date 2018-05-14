package com.infotech.applicationmanagement.dao;

import java.util.List;

import com.infotech.applicationmanagement.domain.Application;
import com.infotech.applicationmanagement.domain.User;


/**
 * This interface provide User data access object method 
 * @author Bhushan Medage
 *
 */
public interface UserDao {

	/**
	 * This method will register user in database ad return integer value
	 * @param user
	 * @return Integer 1-inserted,2-fail inserted
	 */
	public int registerUser(User user);
	
	/**
	 * This method will help user to login into application.
	 * @param loginType (BY- username or email-id)
	 * @return
	 */
	public User loginUser(String username);
	
	 
	/**
	 * This method will add issue
	 * @param issue
	 * @return 
	 */
	int addIssues(Application issue);
	
	
	  /**
	    * This method will list issue based on userid
	    * @param userid
	    * @return
	    */	
	List<Application> listissue(Integer userid);
	
	
	 /**
	    * This Method will update issue according to the id and update given fields
	    * @param id
	    * @param issue
	    * @return
	    */
	int updateissue(Integer id,Application issue);
	
	
	/**
	    * This method will Delete issue based on id
	    * @param userid
	    * @return
	    */
	int Deleteissue(Integer id);
	
	
	/**
	    * This method will list issue based on Given date range
	    * @param userid
	    * @return
	    */
	public List<Application> listissue(String startdate, String enddate,Integer userid);
	
}
