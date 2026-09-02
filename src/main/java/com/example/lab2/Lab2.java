package com.example.lab2;

public class Lab2 {

    public static long one(long number) {//return 1 + 2 + 3 .... number
        if(number == 1) {
            return 1;
        }
        return number + one(number - 1);
    }
    public static double two(int number) {// return 1+ 1/2 + 1+ 3
        if(number == 0) {
            return 0;
        }
        return (1.00/number) + two(number-1);
    }
    public static double three(int number) {// 1/3 + 2/5 + 3/7 + ... + i/(2i + 1)
        if(number == 0) {
            return 0;
        }
        return (number+ 0.0)/(2 * (number +0.0) + 1) + three(number -1);
    }
    public static double four(int number) { //1/2 + 2/3 + 3/4 +... + i/(i+1)
        if(number == 0) {
            return 0;
        }

        return (number + 0.0)/(number + 1 + 0.0) + four(number  -1);
    }
    public static long fib(int n) {
        if(n <= 1) {
            return n;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }
    public static void reverseDisplay(int value) {
        if(value == 0) {
            return;
        }
        System.out.print(value % 10);
        reverseDisplay(value /10);

    }
    public static void reverseDisplay(String value) {
        if(value.isEmpty()) {
            return;
        }
        System.out.print(value.charAt(value.length()-1));
        reverseDisplay(value.substring(0, value.length()-1));
    }
    public static int count(String str, char a) { //count char a in String str
        if(str.isEmpty()) {
            return 0;
        }
        else if(str.charAt(str.length() - 1) == a) {
            return 1 + count(str.substring(0, str.length()-1), a);
        }
        return count(str.substring(0, str.length()-1), a);
    }
    public static int sumDigits(long n) {// sumDigits returns 3
        if(n == 0) {
            return 0;
        }
        return 1 +sumDigits(n/10);
    }
    public static void main(String[] args) {
        System.out.println(""one(11));
        System.out.println(two(6));
        System.out.println(three(4));
        System.out.println(four(2));

        reverseDisplay("abcdef");
        System.out.println("");
        reverseDisplay(123456);
        System.out.println(sumDigits(12345));
        System.out.println("count:" + count("bbbccadda", 'a'));

    }
}
