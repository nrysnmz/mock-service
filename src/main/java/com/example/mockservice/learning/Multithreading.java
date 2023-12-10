package com.example.mockservice.learning;

public class Multithreading {

    public static void main(String[] args) {

        int age =3;

        if(age<18){
            System.out.println("free ticket");
        }else {
            System.out.println("you can not enter");
        }


        if(age>65){
            System.out.println("can not enter");
        }else {
            System.out.println("you can not retire");
        }
    }


}
