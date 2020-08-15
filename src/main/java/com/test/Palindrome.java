package com.test;



public class Palindrome {
    public static boolean isPalindrome(long inputNumber) {
        String input = String.valueOf(inputNumber);
        String reverse = getReverseString(input);
        return input.equals(reverse);
    }


    public static long getInputChild(long childInput) {
        String input = String.valueOf(childInput);
        char chars[] = input.toCharArray();
        int a = 0;
        int b = 0;
        int i = 0;
        StringBuilder child = new StringBuilder();
        for (char value :chars) {
            i++;
            if (i % 2 == 0) {
                b = Character.getNumericValue(value);
                child.append(a + b);
                a = 0;
                b = 0;
            } else {
                a =  Character.getNumericValue(value);
            }
        }

        System.out.println(child.toString());
        return Long.parseLong(child.toString());
    }

    public static boolean isNumAndChildNumPalindrome(long inputNumber) {
        boolean isPalindrome = false;
        isPalindrome = isPalindrome(inputNumber);
        while (inputNumber > 9 && !isPalindrome && String.valueOf(inputNumber).length() % 2 == 0) {
            inputNumber = getInputChild(inputNumber);
            isPalindrome = isPalindrome(inputNumber);
        }
        return isPalindrome;
    }


    public static String getReverseString(String input) {
        char[] chars = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            sb.insert(0, chars[i]);
        }
        return sb.toString();
    }

    public static void main(String[] s) {
        System.out.println(isNumAndChildNumPalindrome(23336014));

    }
}
