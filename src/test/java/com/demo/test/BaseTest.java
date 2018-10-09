package com.demo.test;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//使用junit4进行测试
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })//加载配置文件

//https://bbs.csdn.net/topics/392282649  该基类没有继承TestCase好像低版本需要继承
public class BaseTest/* extends TestCase */{
    protected Logger logger = LoggerFactory.getLogger(getClass());

}