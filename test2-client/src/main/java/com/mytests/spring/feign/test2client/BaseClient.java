package com.mytests.spring.feign.test2client;

import org.springframework.web.bind.annotation.RequestMapping;

public interface BaseClient {
    @RequestMapping("/c3/boo")
    String boo();
}
