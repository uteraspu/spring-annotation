package com.demo.test;

import com.demo.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCTest {

    @Test
    public void test01() {
        //ApplicationContext context = new FileSystemXmlApplicationContext("WebRoot/WEB-INF/applicationContext.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");// 从classpath中加载
        //new FileSystemXmlApplicationContext("classpath:地址");// 没有classpath表示当前

        Person person = (Person) context.getBean("person");
        System.out.println(person);

        Person person1 = context.getBean(Person.class);
        System.out.println(person == person1);//默认为单实例的所以返回true


    }
}
