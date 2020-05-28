package com.mytests.spring.feign.test2api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * *******************************
 * Created by irina on 3/17/2020.
 * Project: feignTest2
 * *******************************
 */
@RestController
@RequestMapping("/c2")
public class Controller2 {

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        
        return "hello "+name;
    }
    @RequestMapping("/bye/{name}")
    public String bye(@PathVariable String name) {

        return "bye "+name;
    }
}
