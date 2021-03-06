package com.mytests.spring.feign.test2client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ClientsController {

    @Autowired
    private FeignClient2 test22;
    @Autowired
    private FeignClient4 test24;
    @Autowired
    private FeignClient5 test25;

    @Autowired
    @Qualifier("client1")
    private FeignClient1 test21;
    @Resource(name = "client3")
    private FeignClient3 test23;


    @GetMapping("/client2/hello/{name}")
    public String hello(@PathVariable String name) {
        return test22.hello(name);
    }

    @GetMapping("/client1/bar")
    public String m1() {
        return test21.m1();
    }

    @GetMapping("/client3/boo")
    public String boo() {
        return test23.boo();
    }

    @GetMapping("/client4/boo")
    public String boo4() {
        return test24.boo();
    }

    @GetMapping("/client5/boo")
    public String client51() {
        return test25.boo();
    }

    @GetMapping("/client5/zoo")
    public String client52() {
        return test25.zoo();
    }

    @GetMapping("/client5/bar")
    public String client53() {
        return test25.bar();
    }
}
