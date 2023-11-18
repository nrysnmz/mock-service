package com.example.mockservice.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Data
@ToString
@Getter
@Builder
public class BuilderLearn {
    private String firstName;
    private String lastName;

//    private BuilderLearn (){
//
//    }
//    public BuilderLearn(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }

    public static void main(String[] args) {
        BuilderLearn obj = new BuilderLearn("Nuri","KOr");
        BuilderLearn obj1 = BuilderLearn.builder().lastName("K").build();
        System.out.println(obj);
        System.out.println(obj1);
    }
}
