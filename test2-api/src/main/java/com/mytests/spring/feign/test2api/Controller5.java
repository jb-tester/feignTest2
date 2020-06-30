package com.mytests.spring.feign.test2api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * *******************************
 * <p>Created by irina on 30.06.2020.</p>
 * <p>Project: feignTest2</p>
 * *******************************
 */

@RestController
public class Controller5 {

    @RequestMapping(path = "/c5/*/test0/", method = RequestMethod.GET)
    public String multiplePaths1() {

        return "multiple paths mapping1";
    }

    @RequestMapping("/c5/*/test1/{p1}")
    public String multiplePaths2(@PathVariable String p1) {

        return "multiple paths mapping2 with " + p1;
    }

    @RequestMapping("/c5/*/test2/*/foo/{p2}")
    public String multiplePaths3(@PathVariable String p2) {

        return "multiple paths mapping3 " + p2;
    }
}
