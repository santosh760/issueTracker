package com.infotech.applicationmanagement.domain;

/*import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
*/
/**
 * This class is a POJO class for user
 * @author Santosh Pandey
 *
 */
public class User {

	/**
	 * User ID of user
	 * This is auto-genrated in database
	 */
	private int id;
	
	/**
	 * User's  Name
	 */
	private String name;
	
	/**
	 * User's contact
	 */
	
	private String contact;
	
	/**
	 * User's email
	 */
	private String email;
	
	
	/**
	 * User's userid
	 */
	private String userid;
	
	/**
	 * User's password
	 */
	private String password;
	
	/**
	 * User's Status
	 * 1-active(Default),2-In-active
	 */
	private int isActive;
	
	
	
	
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public String getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(String createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getLastModifiedDateTime() {
		return lastModifiedDateTime;
	}

	public void setLastModifiedDateTime(String lastModifiedDateTime) {
		this.lastModifiedDateTime = lastModifiedDateTime;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	/**
	 * User's created Date and Time
	 */
	private String createdDateTime;
	
	
	/**
	 * User's last Modified Date and Time
	 */
	private String lastModifiedDateTime;
	
	
	/**
	 * Application created By
	 */
	private String createdBy;
	
	
	/**
	 * Application Last Modified By
	 */
	private String lastModifiedBy;
	
	/**
	 * This method is the User constructor method
	 * @author Bhushan Medage
	 */
	public User() {
		
	}

	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
