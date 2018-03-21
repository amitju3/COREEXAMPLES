package com.scp.controllers;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.scp.beans.UserBean;
import com.scp.service.UserService;
import com.scp.service.impl.UserServiceImpl;

@Controller
//@RequestMapping("/user")
public class EmployeeController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public ModelAndView appLandingPage(){
		//ModelAndView model = new ModelAndView();
		//model.addObject("userbean",new UserBean());
		return new ModelAndView("index");
	}

	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void saveUser(@ModelAttribute UserBean bean){
		userService.addUser(bean);
	}
	
	@RequestMapping(value="/deleteuser/{uid}",method=RequestMethod.GET)
	public void deleteUser(@PathVariable int userId){
		userService.deleteUser(userId);
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public void updateUser(@ModelAttribute UserBean bean){
		userService.updateUser(bean);
	}
	
	@RequestMapping(value="/getuser/{uid}",method=RequestMethod.GET)
	public void getUser(@PathVariable("uid") int id){
		userService.getUser(id);
	}
	
	@RequestMapping(value="/getlist",method=RequestMethod.GET)
	public void getListOfUsers(){
		userService.getUsers();
	}
	
	
	
	

}
