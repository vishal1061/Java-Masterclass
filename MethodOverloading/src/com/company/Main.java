package com.company;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Vishal", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(100,5);
        calcFeetAndInchesToCentimeters(50);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore( int score){
        System.out.println("Unnamed "  + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters (double feet , double inches){
        if (feet>= 0 && (inches >=0 && inches <= 12)){

            double totalCentimeters = (feet*12 + inches) * 2.54;
            System.out.println("Total Centimeters are = " + totalCentimeters);
            return totalCentimeters;
        } else{
            return -1;

        }


    }


    public static double calcFeetAndInchesToCentimeters (double inches){
        if (inches >=0){

           double feet = (int) inches /12;
           double inch = (int) inches % 12;


           return calcFeetAndInchesToCentimeters(feet,inch);

        } else{
            return -1;

        }


    }
}
