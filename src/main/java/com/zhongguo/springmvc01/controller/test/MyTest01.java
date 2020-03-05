package com.zhongguo.springmvc01.controller.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhongguo.springmvc01.controller.util.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"/ApplicationContext.xml"})
public class MyTest01 {

	@Autowired
	Student student;

	@Test
    public void test(){
        System.out.println(student);
        
	}
	

}
