package com.example.mockservice.learning;

public interface InterfaceDefault {

    void run();
    default void talk(){
        System.out.println("I am talking");
    }
}

class Animal implements InterfaceDefault{


    @Override
    public void run() {

    }
}

class Life{
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.talk();
        obj.run();
    }
}
