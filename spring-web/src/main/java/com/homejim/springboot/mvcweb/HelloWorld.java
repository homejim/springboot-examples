package com.homejim.springboot.mvcweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloWorld {
    @RequestMapping("spring")
    public String hello() {
        return "hello springboot";
    }
}
