package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextUtils {
	private static ApplicationContext ctx;
	private ApplicationContextUtils(){}
	public static ApplicationContext getApplicationContext(){
		if(ctx == null){
			ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		}
		return ctx;
	}
}
