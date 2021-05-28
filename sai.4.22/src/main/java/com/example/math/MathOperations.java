package com.example.math;


//casting to an int
public class MathOperations implements MathProperties {
    public int getSquare(int a) {
        //casting to an int 
        return (int) Math.pow(a, 2);        
    }

    public int getSquareRoot(int a) {
        //casting to an int
        return (int) Math.sqrt(a);
    }

    public int largestInteger(int a, int b){

        if(a > b){
            return a;
        }else{
            return b;
        }
    }

    // public int add(int[] numbers){
    //     int sum = 0;

    //     return sum;
    // }
}

// Create an interface, that has methods:
//     a) getSquare - takes in an integer as a parameter and returns the square of that number.
//     b) getSquareRoot - takes in an integer as a paramter and returns the square root of that number.
//     c) largestInteger - takes in two integers as a parameters, compares the two integers and returns the largest of the two.



//     3. Implement the interface in step 2 using a class "MathOperations".
// 4. Use the interface and perform the operations in a "Main.java" class.

//instance variables are non-static variables and are unique to the instance of a class
//class variables are static fields and are declared with static modifier. there can only be one copy of the class variable.
//parameters are variables that provide extra info to a method.