package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        while (count !=6){
            System.out.println("Count value is " + count);
            count++;
        }
        // Similar for loop.
        System.out.println("************************************************************");
        System.out.println("************************************************************");
        for (count = 1; count!=6;count++){

            System.out.println("Count value is " + count);
        }
        System.out.println("************************************************************");
        System.out.println("************************************************************");

   count =1;
        do{
            System.out.println("Count vale is " + count );
            count ++;
        }while (count!=6);


        System.out.println(isEvenNumber(101));

        int number = 4;
        count = 0;
        int finishNumber = 20;
        while (number<=finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            count++;
            if(count==5){
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number){
        if (number%2==0){
            return true;
        }else  {
            return false;
        }
    }
}
