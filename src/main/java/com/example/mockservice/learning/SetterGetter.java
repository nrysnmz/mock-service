package com.example.mockservice.learning;

public class SetterGetter {
    private String name;

    void setName(String name1){
        this.name= name1;
    }
    String getName(){
        return name;
    }
    public static void main(String[] args) {
        SetterGetter obj = new SetterGetter();

        System.out.println(obj.getName());
        obj.setName("Nuray");



    }

}
