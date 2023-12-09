package com.example.mockservice.learning;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int a = read.nextInt();

        Pupil pupil = new Pupil();
        pupil.setAge(a);
    }

    static class Pupil{
        private int age;

        //complete setter method
        public void  setAge(int a){
            this.age=a;
            if(age>6){

                System.out.println("Welcome");

            }else{
                System.out.println("Sorry");
            }

        }

        public int getAge(){
            return age;
        }
    }
}
//public class SystemTimeZoneExample {
//    public static void main(String[] args) {
//        // Get the system's default time zone
//        ZoneId systemTimeZone = ZoneId.systemDefault();
//
//        // Get the current date and time in the system's default time zone
//        LocalDateTime localDateTime = LocalDateTime.now(systemTimeZone);
//
//        // Format the date and time
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String systemLocalDateTimeString = localDateTime.format(formatter);
//
//        System.out.println("System's Local Date and Time: " + systemLocalDateTimeString);
//    }
//}


//public class SystemTimeZoneExample {
//    public static void main(String[] args) {
//        // Get the system's default time zone
//        ZoneId userTimeZone = ZoneId.systemDefault();
//
//        // Get the current date and time in the system's default time zone
//        LocalDateTime localDateTime = LocalDateTime.now(userTimeZone);
//
//        // Format the date and time
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String systemLocalDateTime = localDateTime.format(dateTimeFormatter);
//
//        System.out.println("System's Local Date and Time: " + systemLocalDateTime);
//    }
//}




