package com.mytests.spring.feign.test2client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * *******************************
 * Created by irina on 3/17/2020.
 * Project: feignTest2
 * *******************************
 */
@FeignClient(name = "test2", url = "http://localhost:8081/test2/api")
public interface FeignClient1 {
    
    @GetMapping("c1/bar")
    String m1();
    
    
}
