package com.sergiomartinrubio.spotbugsexample;

public class PerformanceBugs {

    private Integer field;

    public void stringContatenation() {
        String string = "example";

        String newString = "";

        for (int i = 0; i < string.length(); i++) {
            newString += string.charAt(i);
        }

        System.out.println(newString);
    }

    public String stringConstructor() {
        String string = new String("string");
        return string;
    }
}
