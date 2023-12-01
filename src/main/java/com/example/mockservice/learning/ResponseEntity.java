package com.example.mockservice.learning;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseEntity {

    public static void main(String[] args) {

        ResponseEntity a = new  ResponseEntity();
        a.toString();

        System.out.println(a);

    }
}
