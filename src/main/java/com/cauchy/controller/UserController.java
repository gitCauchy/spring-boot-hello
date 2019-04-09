package com.cauchy.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cauchy.pojo.User;

@Controller
public class UserController {
	@RequestMapping("/showUser")
	public String showUser(Model model) {
		List<User>list = new ArrayList<User>();
		list.add(new User(1,"Cauchy",20));
		list.add(new User(2,"Lucy",20));
		model.addAttribute("list",list);
		return "userList";
	}
}
