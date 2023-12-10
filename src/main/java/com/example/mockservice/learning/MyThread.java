package com.example.mockservice.learning;

public class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 15; i++) {
            System.out.println(Thread.currentThread().getId() + " Sayı: " + i);
        }
    }

    public static void main(String args[]) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start(); // İlk iş parçacığını başlat
        thread2.start(); // İkinci iş parçacığını başlat
    }
}

