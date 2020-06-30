package com.mytests.spring.feign.test2client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "test25", url = "http://localhost:8081/test2/api/c5/")
interface FeignClient5 {

    @GetMapping(value = "/boo/test0")
    String boo();

    @RequestMapping(method = RequestMethod.GET, value = "/zoo/test1/foo")
    String zoo();

    @RequestMapping(method = RequestMethod.GET, value = "/*/test2/*/foo/ppp")
    String bar();
}