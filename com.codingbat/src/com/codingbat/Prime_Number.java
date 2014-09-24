package com.codingbat;

public class Prime_Number {

    public static boolean isPrime(long n) {
        if ((n > 2 && n % 2 == 0) || (n > 3 && n % 3 == 0) || (n > 5 && n % 5 == 0) || n == 0 || n == 1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        int prime = 0;
        while (prime <= 10001) {
            if (isPrime(count) == true) {
                prime++;
                if (prime == 10001) {
                    System.out.println(count + " is a prime number" + "(" + prime + ")");
                }
            }
            count++;
        }
    }
}