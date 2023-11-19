package com.example.mockservice.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Jacksonized
public class Error {
    @JsonProperty("errorCode")
    String errorCode;

    @JsonProperty("errorDescription")
    String errorDescription;

    @JsonProperty("statusCode")
    Integer statusCode;
}
