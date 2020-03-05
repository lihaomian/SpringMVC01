package com.zhongguo.springmvc01.controller.util;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    private String name;
    private int age;
    @Autowired
    private Teacher teacher;
 
    public Student() {
        this.name = "张三";
        this.age = 18;
    }
 
    public Student(String name, int age, Teacher teacher) {
        this.name = name;
        this.age = age;
        this.teacher = teacher;
    }


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", teacher=" + teacher + "]";
	}
 
    /*getter setter toString*/
    
}
