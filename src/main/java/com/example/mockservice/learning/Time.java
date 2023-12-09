package com.example.mockservice.learning;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Time {


        public static void main(String[] args) {
            // Get the system's default time zone
            ZoneId userTimeZone = ZoneId.systemDefault();

            // Get the current date and time in the system's default time zone
            LocalDateTime localDateTime = LocalDateTime.now(userTimeZone);

            // Format the date and time in the first format "yyyy-MM-dd HH:mm:ss"
            DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime1 = localDateTime.format(dateTimeFormatter1);

            // Format the date and time in the second format "yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'"
            DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'");
            String formattedDateTime2 = localDateTime.format(dateTimeFormatter2);

            System.out.println("Formatted Date and Time 1: " + formattedDateTime1);
            System.out.println("Formatted Date and Time 2: " + formattedDateTime2);
        }

}
