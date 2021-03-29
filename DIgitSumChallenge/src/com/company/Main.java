package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(5000));

        
    }

    public static int sumDigits(int number){
        int sum = 0;
        int remainder;
        if (number<10){
            return -1;
        } else{
            while (number !=0){
                remainder = number % 10;
                sum += remainder;
                number = number /10;

            }
            return sum;

        }
    }
}
