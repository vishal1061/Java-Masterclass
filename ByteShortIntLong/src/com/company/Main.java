package com.company;

public class Main {

    public static void main(String[] args) {
	    int myValue = 1000;
	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = "+ myMinIntValue);
        System.out.println("Integer Maximum Value = "+ myMaxIntValue);
        System.out.println("Busted Minimum Value = "+ (myMinIntValue -1));
        System.out.println("Busted Maximum Value = "+ (myMaxIntValue + 1));


        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = "+ myMinByteValue);
        System.out.println("Byte Maximum Value = "+ myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = "+ myMinShortValue);
        System.out.println("Short Maximum Value = "+ myMaxShortValue);


        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum Value = "+ myMinLongValue);
        System.out.println("Long Maximum Value = "+ myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_648L;
        System.out.println(bigLongLiteralValue);

        byte myNewByte = 90;
        short myNewShort = 30000;
        int myNewInt = 65000;

        long myNewLong = 50000 + 10*(myNewByte + myNewInt + myNewShort);

        System.out.println("My New Long value = " + myNewLong);
    }
}
