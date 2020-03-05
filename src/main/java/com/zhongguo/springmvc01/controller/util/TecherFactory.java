package com.zhongguo.springmvc01.controller.util;

public class TecherFactory {
	
	public static Teacher creatTeacher() {
		Teacher teacher = new Teacher("LaoZhang", 23);
		
		return teacher;
	}

}
