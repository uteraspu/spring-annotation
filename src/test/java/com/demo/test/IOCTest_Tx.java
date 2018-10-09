package com.demo.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.aop.MathCalculator;
import com.demo.bean.Boss;
import com.demo.bean.Car;
import com.demo.bean.Color;
import com.demo.bean.Red;
import com.demo.config.MainConfigOfAOP;
import com.demo.config.MainConifgOfAutowired;
import com.demo.dao.BookDao;
import com.demo.service.BookService;
import com.demo.tx.TxConfig;
import com.demo.tx.UserService;

public class IOCTest_Tx {
	
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(TxConfig.class);
	
		UserService userService = applicationContext.getBean(UserService.class);
		
		userService.insertUser();
		applicationContext.close();
	}

}
