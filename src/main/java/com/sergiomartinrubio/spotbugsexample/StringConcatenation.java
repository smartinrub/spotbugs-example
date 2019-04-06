package com.sergiomartinrubio.spotbugsexample;

public class StringConcatenation {

    public void runConcatenation() {
        String string = "example";

        String newString = "";

        for (int i = 0; i < string.length(); i++) {
            newString += string.charAt(i);
        }

        System.out.println(newString);
    }
}
