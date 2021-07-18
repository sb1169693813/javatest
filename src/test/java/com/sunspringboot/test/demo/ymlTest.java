package com.sunspringboot.test.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ymlTest {
    //获取配置文件中的age
    @Value("${age}")
    private int age;

    //获取配置文件中的name
    @Value("${name}")
    private String name;

    //该注解表示一个测试方法
    @Test
    public void getAge() {
        System.out.println(age);
    }

    @Test
    public void getName() {
        System.out.println(name);
    }
}
