package com.zhongguo.springmvc01.controller.util;

public class Teacher {
    private String name;
    private int age;
 
    public Teacher() {
        this.name = "张老师";
        this.age = 34;
    }
 
    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
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

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + "]";
	}
 
    /*getter setter toString*/
	
	
    
}
 


