package com.example.mockservice.learning;

import lombok.Builder;

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
