package com.sunspringboot.test.demo;

import com.sunspringboot.test.properties.GetPersoninfoProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GetPersoninfoPropertiesTest {

    @Autowired
    private GetPersoninfoProperties getPersoninfoProperties;

    @Test
    public void test() {
        System.out.println(getPersoninfoProperties.getName() + ":" + getPersoninfoProperties.getAge());
    }
}
