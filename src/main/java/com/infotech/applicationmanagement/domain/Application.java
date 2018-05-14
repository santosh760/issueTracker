package com.infotech.applicationmanagement.domain;

public class Application {

	private int id;
	private String issuename;
	private String userid;
	private int isActive;
    private String createdDateTime;
   
	
	/**
	 * User's last Modified Date and Time
	 */
	private String lastModifiedDateTime;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getIssuename() {
		return issuename;
	}


	public void setIssuename(String issuename) {
		this.issuename = issuename;
	}


	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
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
	 * Application created By
	 */
	private String createdBy;
	
	
	/**
	 * Application Last Modified By
	 */
	private String lastModifiedBy;
	
	
}
