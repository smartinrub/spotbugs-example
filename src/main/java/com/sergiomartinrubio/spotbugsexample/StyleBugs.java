package com.sergiomartinrubio.spotbugsexample;

public class StyleBugs {

    private Object object;

    void uselessControlFlow() {
        object = null;

        if (object != null) {
            // do something

        }
    }
}
