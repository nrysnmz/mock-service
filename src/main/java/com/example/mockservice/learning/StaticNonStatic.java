package com.example.mockservice.learning;

public class StaticNonStatic {
    static int num1=9;
    int num2=12;
    public int add(){

        StaticNonStatic obj = new StaticNonStatic();
        obj.num2/=3;
        obj.num2++;

        num2/=3;
        num2++;

        return obj.num2;
    }
    public int add1(){

        StaticNonStatic obj = new StaticNonStatic();
        obj.num1/=3;
        obj.num1++;

//        num1/=3;
//        num1++;

        return obj.num1;
    }

    public static void main(String[] args) {

        StaticNonStatic obj= new StaticNonStatic();
        System.out.println(obj.num1);
        System.out.println(obj.add1());
        System.out.println(obj.num1);
    }



}

