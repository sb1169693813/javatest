package com.sunspringboot.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld2Controller {

    @RequestMapping("/hello2")
    @ResponseBody
    public String helloWorld() throws Exception {
        return "hello Controller + ResponseBody";
    }
}
