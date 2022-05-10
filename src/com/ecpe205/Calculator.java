package com.ecpe205;

import java.util.Locale;

public class Calculator {


    //exponent
    public double sum (double a, double b){
        return Math.pow(a,b);
    }


    //factorial

    public double sum (double a, double b){
        for(int i = 1; i <= b; ++i)
        {
            a *= i;
        }
        return a;
    }


    public String Palindrome (String x){
        String ascStr = "";
        int ascLength = x.length();

        for(int i = (ascLength -1); i>=0; --i){
            ascStr = ascStr + x.charAt(i);
        }
        return ascStr.toLowerCase();
    }


}

//create a method that computes base x power of y
//use parameterizedTest methodsource - 5 sets to test

//create a method that computes for the factorial of a value
//use parameterizedTest- 5 values to test

//create a method that checks if a given string is a palindrome
//use parameterizedTest - 5 values to test

//create a method that accepts an array of integer values, the method then sorts the value in ascending order
//** you may choose whatever sort data structure (bubble sort, shell sort,...)
//use parameterizedTest methodSource
}
