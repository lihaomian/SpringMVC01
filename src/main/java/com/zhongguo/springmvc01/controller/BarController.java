package com.zhongguo.springmvc01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BarController {
	@RequestMapping("/bar")
	public String index(Model model) {
		
		model.addAttribute("message", "这是通过注解定义的一个控制器中的Action");
		return "foo/index";
		
		
	}

}
