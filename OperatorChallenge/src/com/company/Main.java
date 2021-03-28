package com.company;

public class Main {

    public static void main(String[] args) {
	
        double firstVariable = 20d;
        double secondVariable = 80d;
        double thirdVariable = 100d * (firstVariable + secondVariable);
        double fourthVariable = thirdVariable % 40d;
        boolean fifthVariable = fourthVariable == 0 ? true : false ;
        System.out.println(fifthVariable);
        if (!fifthVariable){
            System.out.println("Got some remainder");
        }
    }
}
