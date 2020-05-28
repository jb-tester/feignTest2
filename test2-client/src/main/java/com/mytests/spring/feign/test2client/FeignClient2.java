package com.mytests.spring.feign.test2client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "test22", url="http://localhost:8081/test2/api")
@RequestMapping("/c2")
public interface FeignClient2 {

    @GetMapping("/hello/{name}")
    String hello(@PathVariable String name);

    @GetMapping("/bye/{name}")
    String bye(@PathVariable String name);
}
