package com.sunspringboot.test.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "com.example")
@Data
public class GetPropertiesInfo {
    private String name;
    private int age;
    private List<String> address;
}
