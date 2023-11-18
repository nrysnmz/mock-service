package com.example.mockservice.gbpController;

import com.example.mockservice.model.GBPPostingRequestBody;
import jakarta.validation.Valid;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/pay-in-four/v1/gpb-posting")
public interface GBPPostingController {


//    @PostMapping
//    default ResponseEntity<Object> requestGBPPosting(@Valid @RequestBody GBPPostingRequestBody gbpPostingRequestBody,
//                                                     @Valid @CcbHttpHeaders @RequestHeader HttpHeaders httpHeaders) throws InterruptedException{
//        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
//    }


    @GetMapping
    default ResponseEntity<String> toogleResponse(@RequestParam(name = "responseType",defaultValue = "N0_VALUE") String responseType){
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
