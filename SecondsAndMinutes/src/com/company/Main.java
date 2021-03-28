package com.company;

public class Main {

    public static void main(String[] args) {

        getDurationString(80,50);
        getDurationString(100);
    }
    public static void getDurationString (int minutes, int seconds){
        if (minutes < 0 || seconds < 0 || seconds >59){
            System.out.println("Invalid value");

        } else {

            int hours = minutes / 60 ;
            minutes = minutes%60;
            System.out.println(hours + "h " + minutes + "m " + seconds + "s");
        }
    }
    public static void getDurationString (int seconds){

        if (seconds< 0){
            System.out.println("Invalid value");

        }else {
            getDurationString((seconds/60),(seconds%60));
        }
    }
}
