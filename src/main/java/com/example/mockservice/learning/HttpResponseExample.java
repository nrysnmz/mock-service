package com.example.mockservice.learning;

import org.springframework.http.HttpStatus;
        import org.springframework.http.ResponseEntity;
        import org.springframework.util.StringUtils;

class HttpResponseExample {

    public ResponseEntity<Object> handleHttpResponse(String responseType) {
        if (StringUtils.equalsIgnoreCase(responseType, "200")) {
            return ResponseEntity.ok("OK - Expected response to a valid request");
        } else if (StringUtils.equalsIgnoreCase(responseType, "201")) {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body("Created - The request has been fulfilled and resulted in a new resource being created.");
        } else if (StringUtils.equalsIgnoreCase(responseType, "400")) {
            return ResponseEntity.badRequest()
                    .body("Bad Request - Request is invalid, either required data is missing or data is not consistent.");
        } else if (StringUtils.equalsIgnoreCase(responseType, "401")) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body("Unauthorized - Authorization failure. Customer token does not match. Customer will need to re-do the OAuth.");
        } else if (StringUtils.equalsIgnoreCase(responseType, "403")) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN)
                    .body("Forbidden - Accessing the resource you were trying to reach is forbidden.");
        } else if (StringUtils.equalsIgnoreCase(responseType, "404")) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Not Found - If the {resourceId} being requested is not found.");
        } else if (StringUtils.equalsIgnoreCase(responseType, "405")) {
            return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED)
                    .body("Method Not Allowed - Operation/method not allowed.");
        } else if (StringUtils.equalsIgnoreCase(responseType, "500")) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Internal Server Error - Something went wrong on the server.");
        } else if (StringUtils.equalsIgnoreCase(responseType, "501")) {
            return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED)
                    .body("Not Implemented - The server does not support the functionality required to fulfill the request.");
        } else if (StringUtils.equalsIgnoreCase(responseType, "503")) {
            return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
                    .body("Service Unavailable - The server is currently unable to handle the request due to temporary overloading or maintenance of the server.");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Invalid response type");
        }
    }
}

