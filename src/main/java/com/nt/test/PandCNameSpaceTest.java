package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Emp;

public class PandCNameSpaceTest {

	public static void main(String[] args) {
		// create ioc container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		@SuppressWarnings("deprecation")
		//BeanFactory factory=new ClassPathXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//Get Bean
		Emp emp=ctx.getBean("emp",Emp.class);
		System.out.println(emp);
	}//main
}//class
