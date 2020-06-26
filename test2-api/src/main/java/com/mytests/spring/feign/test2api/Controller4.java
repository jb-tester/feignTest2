package com.mytests.spring.feign.test2api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * *******************************
 * Created by irina on 3/17/2020.
 * Project: feignTest2
 * *******************************
 */
@RestController
public class Controller4 {

    @RequestMapping("/c4/boo")
    public String boo() {

        return "boo";
    }

    @RequestMapping("/c4/zoo")
    public String zoo() {

        return "zoo";
    }
}
