package com.company;

public class Main {

    public static void main(String[] args) {
        byte myNewByte = 90;
        short myNewShort = 30000;
        int myNewInt = 65000;

        long myNewLong = 50000L + 10L * (myNewByte + myNewInt + myNewShort);

        System.out.println("My New Long value = " + myNewLong);
    }
}
