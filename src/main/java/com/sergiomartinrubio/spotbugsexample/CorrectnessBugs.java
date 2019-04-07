package com.sergiomartinrubio.spotbugsexample;

import java.util.Optional;

public class CorrectnessBugs {

    public Optional<Object> returnNull() {
        return null;
    }

    public void test() {
        String string;
    }

}
