package com.example.mockservice.impl;

import com.example.mockservice.gbpController.GBPPostingController;
import com.example.mockservice.model.DebitPostingServiceResponse;
import com.example.mockservice.model.Error;
import com.example.mockservice.model.GBPPostingRequestBody;
import com.example.mockservice.model.GBPPostingResponseBody;
import jakarta.persistence.Entity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Objects;

public class GBPPostingControllerImpl implements GBPPostingController {

    private String SUCCESS = "SUCCESS";
    private String BAD_REQUEST = "BAD_REQUEST";
    private String TIMEOUT = "TIMEOUT";

    private List<String> supportedResponseTypes = List.of(SUCCESS, BAD_REQUEST);
    private String requestedResponseType = SUCCESS;

    @Override
    public ResponseEntity<String> toogleResponse(String responseType) {
        requestedResponseType = responseType.toUpperCase();
        return ResponseEntity.status(HttpStatus.OK).body("GBPPosting " + responseType + " supported response types " + supportedResponseTypes);
    }

    @Override
    ResponseEntity<Objects> requestGBPPosting(GBPPostingRequestBody postingRequestBody, HttpHeaders httpHeaders) throws InterruptedException {

        if (StringUtils.equalsAnyIgnoreCase(requestedResponseType, TIMEOUT)) {
            Thread.sleep(2000);
            return ResponseEntity.status(HttpStatus.GATEWAY_TIMEOUT).build();
        } else if (StringUtils.equalsAnyIgnoreCase(requestedResponseType, BAD_REQUEST)) {
            var errorResponse = Error.builder().statusCode(400).errorDescription("failed").build();
            return ResponseEntity.badRequest().body(errorResponse);
        } else {
            return ResponseEntity.ok(mockGBPPostingResponseBodyCompleted());
        }

        GBPPostingResponseBody mockGBPPostingResponseBody() {

            GBPPostingResponseBody gbpPostingResponseBodyBuilder =
                    GBPPostingResponseBody.builder().transactionIdentifier("3443").transactionStatusCode("TRANSACTION_RETRYABLE").build();

            return GBPPostingResponseBody.builder();

        }

        GBPPostingResponseBody mockGBPPostingResponseBodyCompleted(){

        }

    }
}
