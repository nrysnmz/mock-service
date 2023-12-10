package com.example.mockservice.gbpController;

import org.springframework.http.ResponseEntity;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping
public class Controller {

    @PostMapping("/test")
    public String getExample(@RequestHeader(value = "Accept") String acceptHeader) {


        return "hi";
    }

    @GetMapping("/test")
    public String getExample1(@RequestHeader(value = "Accept") String acceptHeader) {


        return "Hi Nuraycim";
    }
}
