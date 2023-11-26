package com.example.mockservice.learning;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Jsonlearning {

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        Person person = new Person("adfgfd","3sedfds",new int[]{2,4,5});
        String json = objectMapper.writeValueAsString(person);
        System.out.println(json);
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Person{
    String a;
    String b;
    int [] num;

}

class Example {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        // JSON verisini oluştur
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\",\"isStudent\":false,\"grades\":[85,90,78]}";

        // JSON verisini Java nesnesine çevir (deserileştir)
        Person person = objectMapper.readValue(json, Person.class);

        System.out.println(person);
    }
}
