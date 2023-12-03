package com.example.mockservice.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String firstName = read.nextLine();
        String secondName = read.nextLine();
        int age = read.nextInt();
        int roomNumber = read.nextInt();
        Customer customer = new Customer();
        //set customer's data to object here


        customer.saveCustomerInfo();
    }
}

class Customer {
    //add all necessary attributes here
    private String firstName;
    private static String num;
    private String secondName;
    private int age;
    private int roomNumber;
    public void setName() {
    }
    void a(String firstName){
        System.out.println(firstName);
    }
    public void saveCustomerInfo() {
        System.out.println("First name: " + firstName);
        System.out.println("Second name: " + secondName);
        System.out.println("Age: " + age);
        System.out.println("Room number: " + roomNumber);
    }
}