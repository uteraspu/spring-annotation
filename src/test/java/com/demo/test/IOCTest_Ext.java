package com.demo.test;

import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.aop.MathCalculator;
import com.demo.bean.Boss;
import com.demo.bean.Car;
import com.demo.bean.Color;
import com.demo.bean.Red;
import com.demo.config.MainConfigOfAOP;
import com.demo.config.MainConifgOfAutowired;
import com.demo.dao.BookDao;
import com.demo.ext.ExtConfig;
import com.demo.service.BookService;

public class IOCTest_Ext {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExtConfig.class);


        //发布事件；
        applicationContext.publishEvent(new ApplicationEvent(new String("我发布的时间")) {
        });

        applicationContext.close();
    }

}
