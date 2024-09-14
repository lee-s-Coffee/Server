package com.leesCoffee.cafe.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> getHello() {
        // "Hello, World!"라는 간단한 메시지를 반환
        System.out.println("컨트롤러 확인");
        return ResponseEntity.ok("Hello, World!");
    }
}
