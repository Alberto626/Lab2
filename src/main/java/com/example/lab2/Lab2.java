package com.example.lab2;

public class Lab2 {

    public static long one(long number) {//return 1 + 2 + 3 .... number
        if(number == 1) {
            return 1;
        }
        return number + one(number - 1);
    }
    public static double two(int number) {// return 1+ 1/2 + 1+ 3
        if(number == 1) {
            return 1.0;
        }
        return (1.00/number) + two(number-1);
    }
    public static double three(int number) {
        if(number == 1) {
            return 1.0/3.0;
        }
        return (number+ 0.0)/(2 * (number +0.0) + 1) + three(number -1);
    }
    public static double four(int number) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(one(11));
        System.out.println(two(6));
        System.out.println(three(4));
    }
}
