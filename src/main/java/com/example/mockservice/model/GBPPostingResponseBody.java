package com.example.mockservice.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Jacksonized
public class GBPPostingResponseBody {
    String transactionIdentifier;
    String transactionStatusCode;
    DebitPostingServiceResponse debitPostingServiceResponse;
    CreditPostingServiceResponse creditPostingServiceResponse;
}
