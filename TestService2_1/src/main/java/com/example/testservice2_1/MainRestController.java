package com.example.testservice2_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {
    @GetMapping ("/")
    public String Hello() {
        return "Hello Server 2.1";
    }
}
