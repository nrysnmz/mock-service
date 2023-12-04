package com.example.mockservice.gbpController;

import org.springframework.http.ResponseEntity;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
public class Controller {

    @GetMapping("/test")
    public ResponseEntity<String> add() {

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("be careful");
    }

}
