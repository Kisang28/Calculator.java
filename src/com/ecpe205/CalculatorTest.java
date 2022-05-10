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

//https://github.com/Kisang28/ecpe205-unit-test.git