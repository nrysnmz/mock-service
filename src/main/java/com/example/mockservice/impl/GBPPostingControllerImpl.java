package com.example.mockservice.impl;

import com.example.mockservice.gbpController.GBPPostingController;
import com.example.mockservice.model.GBPPostingRequestBody;
import jakarta.persistence.Entity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Objects;

public class GBPPostingControllerImpl implements GBPPostingController {

    private String SUCCESS = "SUCCESS";
    private String BAD_REQUEST = "BAD_REQUEST";

    private List<String> supportedResponseTypes = List.of(SUCCESS, BAD_REQUEST);
    private String requestedResponseType = SUCCESS;

    @Override
    public ResponseEntity<String> toogleResponse(String responseType){
        requestedResponseType = responseType.toUpperCase();
        return ResponseEntity.status(HttpStatus.OK).body("GBPPosting " + responseType + " supported response types " + supportedResponseTypes);
    }

//    @Override
    ResponseEntity<Objects> requestGBPPosting (GBPPostingRequestBody postingRequestBody, HttpHeaders httpHeaders) throws InterruptedException{

        return ResponseEntity.status(HttpStatus.OK).build();

    }
}
