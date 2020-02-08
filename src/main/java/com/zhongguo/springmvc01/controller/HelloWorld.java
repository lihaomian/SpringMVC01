package com.zhongguo.springmvc01.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Hello")
public class HelloWorld {
	//String a;
	@RequestMapping("/Sayhi")
	public String SayHi(Model model) {
		model.addAttribute("message", "Hello, You have to take good care of yourself !");
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        return "sayhi";
	}
}
