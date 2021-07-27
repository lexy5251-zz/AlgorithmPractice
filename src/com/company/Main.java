package com.company;

import com.company.questions.PalindromeNumber;
import com.company.questions.TwoSum;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr1 = {2,7,11,15};
        int target = 9;
        int a = 121;
        TwoSum.twoSum(arr1, target);
        PalindromeNumber.isPalindrome(a);
    }
}
