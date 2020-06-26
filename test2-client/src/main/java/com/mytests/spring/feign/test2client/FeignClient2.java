package com.mytests.spring.feign.test2client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "test22", url = "http://localhost:8081/test2/api")
@RequestMapping("/c2")
public interface FeignClient2 {

    String PREFIX2 = "/bye";
    String POSTFIX2 = "/{name}";
    String PATH = PREFIX2 + POSTFIX2;
    String C_2 = "/c2";

    @GetMapping("/hello/{name}")
    String hello(@PathVariable String name);

    @RequestMapping(path = PATH, method = RequestMethod.GET)
    String bye(@PathVariable String name);
}
