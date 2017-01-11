package com.pc.ssm.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pc.ssm.pojo.User;
import com.pc.ssm.service.UserService;

/**
 * 用户控制器
 * 
 * @author Switch
 * @data 2017年1月11日
 * @version V1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {
	// 注入用户Service
	@Autowired
	private UserService userService;

	@RequestMapping("/list")
	public String list(Model model) throws Exception {
		List<User> users = userService.findAllUser();
		model.addAttribute("users", users);
		return "list";
	}

	@RequestMapping("/showEdit")
	public String showEdit(@RequestParam(value = "id") String id, Model model) throws Exception {
		User user = userService.findById(Integer.parseInt(id));
		model.addAttribute("user", user);
		return "edit";
	}

	@RequestMapping("/edit")
	public String edit(User user) throws Exception {
		userService.update(user);
		return "success";
	}
}
