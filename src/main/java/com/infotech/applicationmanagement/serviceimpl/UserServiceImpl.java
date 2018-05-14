package com.infotech.applicationmanagement.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.applicationmanagement.dao.UserDao;
import com.infotech.applicationmanagement.domain.Application;
import com.infotech.applicationmanagement.domain.User;
import com.infotech.applicationmanagement.service.UserService;


@Service ("service")
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao dao;

	public int registerUser(User user) {
		
		return dao.registerUser(user);
	}	

	public User loginUser( String username) {
		
		return dao.loginUser( username);
	}

	public int addIssues(Application issue) {
		return dao.addIssues(issue);
	}

	public int updateissue(Integer id,Application issue) {
		return dao.updateissue(id,issue);
	}

	public int Deleteissue(Integer id) {
		return dao.Deleteissue(id);
	}

	public List<Application> listissue(Integer userid) {
		return dao.listissue(userid);
	}
	
	public List<Application> listissue(String startdate,String enddate,Integer userid) {
		return dao.listissue(startdate,enddate,userid);
	}

	

}
