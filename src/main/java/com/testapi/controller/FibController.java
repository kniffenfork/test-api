package com.testapi.controller;

import com.testapi.service.FibService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FibController {
    private final FibService fibService;

    public FibController(FibService fibService) {
        this.fibService = fibService;
    }

    @GetMapping("/fib/{num}")
    public ResponseEntity<List<Long>> fib(@PathVariable("num") Integer num) {
        return ResponseEntity.ok(fibService.fib(num));
    }
}
