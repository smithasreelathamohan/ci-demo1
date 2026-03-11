package com.example.cidemo1;

public class Calculator {

    // Method to add two numbers
    public double addition(double a, double b) {
        return a + b;
    }

    // Method to subtract two numbers
    public int subtraction(int a, int b) {
        return a - b;
    }

    // Method to multiply two numbers
    public int multiplication(int a, int b) {
        return a * b;
    }

    // Method to divide two numbers
    public double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero not possible");
        }
        else {
            return a / b;
        }

    }
     public int square(int a)
     {
         return a*a;
     }
    public double power(double a, int exponent)
    {
        double result =1;
        int newexponent;
        if (exponent<0)
        {
            newexponent=-exponent;
        }
        else
        {
            newexponent=exponent;
        }
        for(int i=1;i<=newexponent;i++)
        {
            result= result * a;
        }
        if (exponent<0)
        {
            result=1/result;
        }
        return result;
        // check test run on commit
    }
}