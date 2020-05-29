package com.mytests.spring.feign.test2client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
@FeignClient(value = "test23", url = "http://localhost:8081/test2/api")
public interface FeignClient3 extends BaseClient {
    @RequestMapping("/c3/zoo")
    String zoo();
}
