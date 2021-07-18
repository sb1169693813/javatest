package com.sunspringboot.test.demo;

import com.sunspringboot.test.properties.GetPropertiesInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GetPropertiesInfoTest {
    @Autowired
    private GetPropertiesInfo getPropertiesInfo;

    @Test
    public void getName() {
        System.out.println(getPropertiesInfo.getName());
    }

    @Test
    public void getAge() {
        System.out.println(getPropertiesInfo.getAge());
    }

    @Test
    public void getAddress() {
        System.out.println(getPropertiesInfo.getAddress());
    }
}
