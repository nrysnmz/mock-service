package com.example.mockservice.learning;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.slf4j.MDC;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpHeaders;
import java.util.UUID;


@Slf4j
@Mapper
public class Prim {

    public static void main(String[] args) {


        // MDC'ye bilgi eklemek
        MDC.put("userId", "Adam");

        // Log mesajını oluştururken MDC'yi kullanmak
        log.info("This is a log message {}", MDC.get("userId"));

        // MDC'yi temizlemek
        MDC.clear();

    }
}

