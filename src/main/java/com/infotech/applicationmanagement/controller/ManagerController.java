package com.infotech.applicationmanagement.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*import javax.validation.Valid;*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.infotech.applicationmanagement.dao.UserDao;
import com.infotech.applicationmanagement.daoimpl.UserDaoImpl;
import com.infotech.applicationmanagement.domain.Application;
import com.infotech.applicationmanagement.domain.User;
import com.infotech.applicationmanagement.rowmapper.CustomApplicationRowMapper;
import com.infotech.applicationmanagement.service.UserService;



@Controller
@RequestMapping("/user")
public class ManagerController {
	@Autowired
	UserService service;
	HttpSession session;
	
	/*@Autowired
    TaskService taskservice;*/
	
	@RequestMapping(value="/home.htm", method=RequestMethod.GET)
	 public ModelAndView showHomePage(){
		 ModelAndView model=new ModelAndView("home");
		 return model;
	  }
	
	 
	 @RequestMapping(value="/logoutProcess.htm", method=RequestMethod.GET)
	  public ModelAndView showlogoutPage(){
		
		 ModelAndView model=new ModelAndView("login");
		 return model;
	  }
	 
	 @RequestMapping(value="/login.htm", method=RequestMethod.GET)
	  public ModelAndView showloginPage(){
		
		 ModelAndView model=new ModelAndView("login");
		 return model;
	  }
	 
	 

	 
	 @RequestMapping(value="/userRegister.htm", method=RequestMethod.GET)
	  public ModelAndView showRegisterPage(){
		
		 ModelAndView model=new ModelAndView("userRegistration");
		 return model;
	  }
	 
	 @RequestMapping(value="/submitUserRegister.htm", method=RequestMethod.POST)
	  public ModelAndView submitUserRegisterPage( User user){
		 
		 String name=user.getName();
		 String email=user.getEmail();
		 String contact=user.getContact();		 
		 String username=user.getUserid();
		 service.registerUser(user);
		 ModelAndView model=new ModelAndView("userRegisterSuccess");
		 model.addObject("name",name);
		 model.addObject("email",email);
		 model.addObject("contact",contact);
		  model.addObject("username",username);
		 return model;
	  }
	 
	 
	 
	 
	 @RequestMapping(value="/logincheck.htm", method=RequestMethod.POST)
    public ModelAndView showUser(HttpServletRequest request,HttpServletResponse response,@RequestParam("username")String username,@RequestParam("password")String password){
		 User user;
		 try{
		  user=service.loginUser(username);
		 }
		 catch(Exception e){
			 ModelAndView model=new ModelAndView("login");
			 model.addObject("msg","Wrong username or Password...!!");
			 return model;
		 }
		 if(user.getPassword().equals(password)){
			  session=request.getSession();
			 session.setAttribute("userid", user.getId());
			 session.setAttribute("name", user.getName());
			 session.setAttribute("username", user.getUserid());
		 ModelAndView model=new ModelAndView("loginsuccess");
		 model.addObject("msg",session.getAttribute("name"));
		 return model;
		 }
		 else {
			 
			 ModelAndView model=new ModelAndView("login");
			 model.addObject("msg","Wrong username or Password...!!");
			 return model;
		 }
		 

	 }
	 
	 
	 
	 
	 @RequestMapping(value="/addIssue.htm", method=RequestMethod.GET)
	  public ModelAndView showAddTaskPage(){
		
		 ModelAndView model=new ModelAndView("addIssue");
		 return model;
	  }
	 
	 
	 
	 @RequestMapping(value="/submitIsuues.htm", method=RequestMethod.POST)
	  public ModelAndView submitTaskRegisterPage(HttpServletRequest request,HttpServletResponse response ,@ModelAttribute("app") Application issue ){
		 
		 HttpSession session=request.getSession();
		 
		 
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));
		   
		   String dt=dtf.format(now);
		   
		 issue.setCreatedDateTime(dt);
		 
		 Integer id=(Integer) session.getAttribute("userid");
		 issue.setId(id);
		 
		 String usrname= (String) session.getAttribute("name");
		 issue.setCreatedBy(usrname);
		 
		 service.addIssues(issue);
		 ModelAndView model=new ModelAndView("IssueInsertSuccess");
		 model.addObject("issuename",issue.getIssuename());
		 model.addObject("id",id);
		 model.addObject("createdby",usrname);
		 model.addObject("createddate",dt);
		
		 return model;
	  }
	 
	 
	/* @RequestMapping(value="/listByTitle.htm", method=RequestMethod.GET)
	  public ModelAndView showSerachTaskPage(){
		
		 ModelAndView model=new ModelAndView("listByTitle");
		 return model;
	  }
	 */
	 
	 @RequestMapping(value="/editIsuue.htm")
	  public ModelAndView showSerach(@RequestParam("issueid")Integer issueid ){
		
		  ModelAndView model= new ModelAndView("editIsuue");
		 // ((Model) model).addAttribute("issueid",issueid); 
		  model.addObject("issueid",issueid);
		 return model;
	  }
	 
	 
	 @RequestMapping(value="/showBydate.htm")
	  public ModelAndView showDate(){
		
		  ModelAndView model= new ModelAndView("getByDate");
		 // ((Model) model).addAttribute("issueid",issueid); 
		 // model.addObject("issueid",issueid);
		 return model;
	  }
	 
	 
	 
	 
	 @Autowired
		private JdbcTemplate jdbcTemplate;

		public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}
	 
	 @RequestMapping(value="/listAll.htm")
		protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
			
			ModelAndView model = new ModelAndView("showListByID");
			Integer userid=(Integer) session.getAttribute("userid");
			
		
			List<Application> issue = new ArrayList<Application>();
			//String sql = "select * from tasks where userid="+userid;
			issue = service.listissue(userid);
			
			
			for (Application u : issue) {
				System.out.println(u);
			}
			
			model.addObject("issuelist", issue);
			return model;
		}
	 
	 
	 	 
	 @RequestMapping(value="/updateIssue.htm")
		protected ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
			
			ModelAndView model = new ModelAndView("updateIssue");
			Integer userid=(Integer) session.getAttribute("userid");
			
		
			List<Application> issue = new ArrayList<Application>();
			//String sql = "select * from tasks where userid="+userid;
			issue = service.listissue(userid);
			
			
			for (Application u : issue) {
				System.out.println(u);
			}
			
			model.addObject("issuelist", issue);
			return model;
		}

	 
	 
	 
	 
	 @RequestMapping(value="/updateIssuelink.htm", method=RequestMethod.POST)
	  public ModelAndView updateIssue(HttpServletRequest request,HttpServletResponse response ,@ModelAttribute("app") Application issue ,@RequestParam("issueid") int id){
		 
		 HttpSession session=request.getSession();
		 
		 
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));
		   
		   String dt=dtf.format(now);
		   
		 //issue.setLastModifiedDateTime(dt);
		 
		 Integer uid=(Integer) session.getAttribute("userid");
		 issue.setId(uid);
		 
		 String usrname= (String) session.getAttribute("name");
		 issue.setLastModifiedBy(usrname);
		 
		 issue.setLastModifiedDateTime(dt);
		 
		 System.out.println("mod byyyyyyyyy::"+usrname);
		 service.updateissue(id,issue);
		 
		 ModelAndView model=new ModelAndView("updateIssue");
		 model.addObject("issuename",issue.getIssuename());
		 model.addObject("id",id);
		 model.addObject("lastModifiedBy",usrname);
		 model.addObject("lastModifiedDateTime",dt);
		 

			List<Application> user = new ArrayList<Application>();
			String sql = "select * from issue_application where userid=?";
			user = jdbcTemplate.query(sql, new CustomApplicationRowMapper(),uid);
			for (Application u : user) {
				System.out.println(u);
			}
			//model.addObject("welcomemassage", "welcome");
			model.addObject("issuelist", user);
			return model;
		
		 
		
	     
		 
	 }
	 
	 
	 @RequestMapping(value="/deleteIssuelink.htm")
	  public ModelAndView DeleteIssue(HttpServletRequest request,HttpServletResponse response ,@ModelAttribute("app") Application issue ,@RequestParam("issueid") int id){
		 
		 HttpSession session=request.getSession();
		 
		 Integer userid=(Integer) session.getAttribute("userid");
		 service.Deleteissue(id);
		 ModelAndView model=new ModelAndView("updateIssue");
		 
		 List<Application> issue1 = new ArrayList<Application>();
			
			issue1 = service.listissue(userid);
			
			
			for (Application u : issue1) {
				System.out.println(u);
			}
			
			model.addObject("issuelist", issue1);
			return model;
		
	     }
	///////////////////////////////////////////////////////////////////////////////////////////////////	
	 
	 @RequestMapping(value="/showbydatelist.htm")
		protected ModelAndView searchByDate(HttpServletRequest request, HttpServletResponse response,@RequestParam("startdate") String startdate,@RequestParam("enddate") String enddate) throws Exception {
			
	
			ModelAndView model = new ModelAndView("showByDate");
			Integer userid=(Integer) session.getAttribute("userid");
			
		
			List<Application> issue = new ArrayList<Application>();
			//String sql = "select * from tasks where userid="+userid;
			issue = service.listissue(startdate,enddate,userid);
			
			
			for (Application u : issue) {
				System.out.println(u);
			}
			
			model.addObject("issuelist", issue);
			return model;
		}
	 
	 
}
