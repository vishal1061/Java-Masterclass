package com.company;

public class Main {

    public static void main(String[] args) {

        int switchValue = 1;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char value = 'A';
        switch (value){

            case 'A':
                System.out.println("Value was A.");
                break;

            case 'B':
                System.out.println("Value was B.");
                break;
            case 'C':
                System.out.println("Value was C.");
                break;
            case 'D':
                System.out.println("Value was D.");
                break;
            case 'E':
                System.out.println("Value was E.");
                break;
            default:
                System.out.println("No value found");
                break;

        }
    }
}
