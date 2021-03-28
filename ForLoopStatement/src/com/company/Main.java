package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 2; i<9;i++){
            System.out.println("10,000 at " + i + "% " + "interest = " + calculateInterest(10000.0,i));
        }


        System.out.println("*****************************************");

        for (int i = 8; i>1;i--){
            System.out.println("10,000 at " + i + "% " + "interest = " + calculateInterest(10000.0,i));
        }
        System.out.println("**********************************************************");
        int count = 0;
        for (int i = 1; i< 10;i++){

            if (isPrime(i)){
                count ++;
                System.out.println("Prime Number = " + i);

                if (count==3){
                    break;
                }
            }
        }


    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount *(interestRate/100));
    }

    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }else{
            int count = 0;
            for (int i = 2 ; i <=n ; i++){
                if (n % i == 0){
                    count++;
                }
            }
            if (count>1){
                return false;

            }else{
                return true;
            }
        }
    }



}
