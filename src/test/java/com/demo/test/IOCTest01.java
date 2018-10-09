package com.demo.test;

import com.demo.bean.Person;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 采用spring 跟junit整合的基类读取配置文件
 */
public class IOCTest01 extends BaseTest {

    @Autowired
    Person person;


    @Test
    public void test01(){

        System.out.println(person);

    }
}
