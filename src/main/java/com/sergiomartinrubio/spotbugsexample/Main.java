package com.sergiomartinrubio.spotbugsexample;

public class Main {

    public static void main(String[] args) {

        StringConcatenation concatenationBug = new StringConcatenation();
        concatenationBug.runConcatenation();

    }
}
