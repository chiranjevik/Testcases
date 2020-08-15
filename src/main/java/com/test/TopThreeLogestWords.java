package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TopThreeLogestWords {

    public static void getHashTags(String inputsentence) {
        String first = "";
        String two = "";
        String three = "";

        String inputs[] = inputsentence.split(" ");
        for (String input : inputs) {

            if (first.equalsIgnoreCase("") || first.length() < input.length()) {
                three = two;
                two = first;
                first = input;
            } else if (two.equalsIgnoreCase("") || two.length() < input.length()) {
                three = two;
                two = input;
            } else if (two.equalsIgnoreCase("") || three.length() < input.length()) {
                three = input;
            }
        }

        String[] output = { first, two, three };
        printLarge3valuesArray(output);

    }

    private static void printLarge3valuesArray(String[] values) {
        List<String> out = new ArrayList<String>(0);
        for (String string : values) {
            if(!string.equalsIgnoreCase("")) {
                out.add("#"+string);
            }
        }
        System.out.println("Logest Words : " + out.toString());
    }

    public static void main(String[] args) {
        getHashTags("I have tried to reduce ");
    }

}