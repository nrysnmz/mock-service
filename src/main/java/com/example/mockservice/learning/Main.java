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
        customer.setName(firstName);
        customer.setSecondName(secondName);
        customer.setAge(age);
        customer.setRoomNumber(roomNumber);

        customer.saveCustomerInfo();
    }
}

class Customer {
    //add all necessary attributes here
    private String firstName;
    private String secondName;
    private int age;
    private int roomNumber;

    public void setName(String firstName) {
        this.firstName = firstName;

    }

    public String getName() {
        return firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }


    public void saveCustomerInfo() {
        System.out.println("First name: " + firstName);
        System.out.println("Second name: " + secondName);
        System.out.println("Age: " + age);
        System.out.println("Room number: " + roomNumber);
    }
}