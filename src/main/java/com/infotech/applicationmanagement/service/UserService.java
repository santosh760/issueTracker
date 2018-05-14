
package com.infotech.applicationmanagement.service;

import java.util.List;

import com.infotech.applicationmanagement.domain.Application;
import com.infotech.applicationmanagement.domain.User;

/**
 * 
 * @author Bhushan Medage
 *
 */
public interface UserService {

	/**
	 * This method will register user in database ad return integer value
	 * @param user
	 * @return Integer 1-inserted,2-fail inserted
	 */
	public int registerUser(User user);
	
	/**
	 * This method will help user to login into application.
	 * @param loginType (BY- username)
	 * @return
	 */
	public User loginUser(String username);

	
	
	/**
	 * This method will add issue
	 * @param issue
	 * @return 
	 */
	
   public int addIssues(Application issue);
	
   
   
   /**
    * This method will list issue based on userid
    * @param userid
    * @return
    */
   public List<Application> listissue(Integer userid);
	
   
   
   /**
    * This Method will update issue according to the id and update given fields
    * @param id
    * @param issue
    * @return
    */
   public int updateissue(Integer id,Application issue);
	
   
   /**
    * This method will Delete issue based on id
    * @param userid
    * @return
    */
   public int Deleteissue(Integer  id);
	
   
   /**
    * This method will list issue based on Given date range
    * @param userid
    * @return
    */
   public List<Application> listissue(String startdate,String enddate,Integer userid);
}
