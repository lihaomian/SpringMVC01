package com.zhongguo.springmvc01.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	//String a;
	@RequestMapping("/Form")
	public String SayHi(Model model) {
		model.addAttribute("message", "Hello, You have to take good care of yourself !");
        return "MyForm";
	}
}
