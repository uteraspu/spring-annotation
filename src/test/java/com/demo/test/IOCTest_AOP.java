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

public class IOCTest_AOP {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);

        //1、不要自己创建对象
//		MathCalculator mathCalculator = new MathCalculator();
//		mathCalculator.div(1, 1);
        MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);

        mathCalculator.div(1, 0);

        applicationContext.close();
    }

}
