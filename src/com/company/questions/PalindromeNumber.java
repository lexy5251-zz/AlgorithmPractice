package com.company.questions;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int newNum = getNewNumber(Math.abs(x));
        return x == newNum;
    }
    private static int getNewNumber(int x) {
        int mod = 0;
        int newNumber = 0;
        while(x != 0){
            mod = x % 10;
            newNumber = newNumber*10 + mod;
            x /= 10;
        }
        return newNumber;
    }
}
