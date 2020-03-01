package com.iulian;

public class Main {

    public static void main(String[] args) {

        //String is a datatype in Java, which is not a primitive type
        //it's actually a Class

        String myString = "This is a string";
        System.out.println("My string = " + myString);

        myString = myString + ", and this is more";
        System.out.println(("My string = " + myString));

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);

        //Strings in Java are immutable
    }
}
