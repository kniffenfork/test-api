package com.testapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello") // GET localhost:8080/api/hello
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("hello world!");
    }

    @GetMapping("/{name}") // GET localhost:8080/api/vasya || localhost:8080/api/Petya
    public ResponseEntity<String> hello(@PathVariable("name") String name) {
        return ResponseEntity.ok("hello " + name);
    }

    @PostMapping("/id") // POST { "id": "test", "name": "vasya" } -->> test & 200 OK
    public ResponseEntity<String> getId(@RequestBody TestDto testDto) {
        return ResponseEntity.ok(testDto.getId());
    }
}
