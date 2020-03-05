package com.zhongguo.springmvc01.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zhongguo.springmvc01.controller.util.Product;

@Controller
public class FirstController {
	
	@RequestMapping("/Action0")
	public String Action0(Model model,int id,String Name) {
		model.addAttribute("message", "id = "+id+" name = "+Name);
		return "foo/index";
	}
	
	@RequestMapping("/aAction11")
	public String Action11(Model model,@RequestParam("") List<Integer> ids) {
		model.addAttribute("message", Arrays.deepToString(ids.toArray()));
		return "foo/index";
	}
	
	@RequestMapping("/action21")
	public void Action21(@RequestBody List<Product> product,HttpServletResponse response) throws IOException{
		//response.setContentType("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		System.out.println(Arrays.deepToString(product.toArray()));
		response.getWriter().write("添加成功");
	}
	
	@RequestMapping("/action22")
	@ResponseBody
	public List<Product> Action22(@RequestBody List<Product> product) {
		return product;
	}
	
	@RequestMapping("/Employee")
	public void action33() {
		
	}
	
	@RequestMapping("/action44")
	public ModelAndView action44() {
		
		return new ModelAndView("/MyForm");
	}
	
    @RequestMapping("/newaction11")
    public String action11(Model model){
        //向模型中添加一个名为product的对象，用于渲染视图
        model.addAttribute("product", new Product("Meizu note1", 999));
        return "newaction11";
    }

}
