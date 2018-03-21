package com.scp.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.scp.beans.UserBean;
import com.scp.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	public UserController() {
		super();
		System.out.println("Inside Controller..!");
	}

	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView appLandingPage(){
		System.out.println("Inside appLandingPage()");
		List<UserBean> listOfusers = userService.getUsers();
		ModelAndView model = new ModelAndView();
		model.addObject("userslist", listOfusers);
		model.setViewName("homepage");
		return model;
	}
	
	
	@RequestMapping(value = "/navigatetoreg", method = RequestMethod.GET)
	public ModelAndView navigationToRegistrationPage() {
		System.out.println("Inside navigationToRegistrationPage()");
		ModelAndView model = new ModelAndView();
		model.addObject("userbean", new UserBean());
		model.setViewName("registration");
		return model;
	}

	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute UserBean userBean){
		System.out.println("Inside saveUser()");
		if (userBean.getUserId()== 0) { 
			userService.addUser(userBean);
		} else {
			userService.updateUser(userBean);
		}
		return new ModelAndView("redirect:/user/");
		
	}
	
	@RequestMapping(value="/deleteuser",method=RequestMethod.GET)
	public ModelAndView deleteUser(HttpServletRequest request){
		int userid = Integer.parseInt(request.getParameter("id"));
		System.out.println("Inside deleteUser()");
		userService.deleteUser(userid);
		return new ModelAndView("redirect:/user/");
	}
	
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public ModelAndView updateUser(HttpServletRequest request){
		int userid = Integer.parseInt(request.getParameter("id"));
		System.out.println("Inside updateUser()");
		UserBean userBean = userService.getUser(userid);
		//UserBean userBean1=userService.updateUser(userBean.class,userid);
		ModelAndView model = new ModelAndView("EmployeeForm");
		model.addObject("userbean", userBean);
		model.setViewName("registration");
		return model;
	}
	
	@RequestMapping(value="/getuser/{uid}",method=RequestMethod.GET)
	public void getUser(HttpServletRequest request){
		int userid = Integer.parseInt(request.getParameter("id"));
		System.out.println("Inside getUser()");
		userService.getUser(userid);
	}
	
	@RequestMapping(value="/getlist",method=RequestMethod.GET)
	public ModelAndView getListOfUsers(){
		System.out.println("Inside listOfusers()");
		userService.getUsers();
		return new ModelAndView("redirect:/user/");
	}
	
	
	
	

}
