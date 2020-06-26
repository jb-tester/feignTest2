package com.mytests.spring.feign.test2client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "test24", url = "localhost:8081/test2/api")
interface FeignClient4 {

    @GetMapping(value = "/c4/boo")
    String boo();

    @RequestMapping(method = RequestMethod.GET, value = "/c4/zoo")
    String zoo();

}