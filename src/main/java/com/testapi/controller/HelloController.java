package com.testapi.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name="hello controller", description="описывает методы приветствия")
@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    @Operation(
            summary = "Приветствие мира",
            description = "приветствует мир"
    )
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("hello world!");
    }

    @GetMapping("/hello/{name}")
    @Operation(
            summary = "приветствие пользователя",
            description = "Позволяет поприветствовать пользователя"
    )
    public ResponseEntity<String> hello(
            @PathVariable("name") @Parameter(description = "имя пользователя") String name
    ) {
        return ResponseEntity.ok("hello " + name);
    }

    @PostMapping("/id")
    @Operation(
            summary = "Возвращает идентификатора пользователя"
    )
    public ResponseEntity<String> getId(@RequestBody UserDto userDto) {
        return ResponseEntity.ok(userDto.getId());
    }
}
