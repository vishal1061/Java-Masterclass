package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        while (count < 11) {
            System.out.println("Enter number #" + count);
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){

                int number = scanner.nextInt();



                count++;
                sum+=number;
            }else{
                System.out.println("Invalid Number");

            }
            scanner.nextLine();



        }
        System.out.println("Sum of all the 10 numbers is = " + sum);

        scanner.close();
    }
}
