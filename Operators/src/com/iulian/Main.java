package com.iulian;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;   //1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult= " + previousResult);

        result = result - 1;    // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        result = result * 10;   // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;   // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; //the remainder  4 % 3 = 1
        System.out.println("4 % 3 = " + result);

        //result = result + 1
        result++;    // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        //result = result - 1
        result--;   // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result + 2
        result += 2;
        System.out.println("1 + 2 = " + result);

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if(topScore < 100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 60;
        if((topScore > secondTopScore) && (topScore < 100)) {        //and operator, both operands(conditions) have to be true
            System.out.println("Greater than second top score and less than 100");
        }

        //similar or operator ||, but only one condition has to be true

        boolean isCar = true;
        boolean wasCar = isCar ? true : false;            //Ternary operator
        if(wasCar) {
            System.out.println("wasCar equals true");
        }

        //CHALLENGE
        double myFirstDoubleVariable =  20.00d;
        double mySecondDoubleVariable = 80.00d;
        double myResult,remainder;
        myResult = (myFirstDoubleVariable + mySecondDoubleVariable) * 100.00;
        remainder = myResult % 40.00;
        boolean myBooleanVariable = (remainder == 0) ? true : false;
        System.out.println(myBooleanVariable);
        if(!myBooleanVariable)
            System.out.println("Got some remainder");
    }
}
