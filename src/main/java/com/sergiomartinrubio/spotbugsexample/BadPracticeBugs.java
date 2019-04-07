package com.sergiomartinrubio.spotbugsexample;

import java.util.Arrays;
import java.util.List;

public class BadPracticeBugs {

    public void removeAllFromCollection() {
        List<String> list = Arrays.asList("hello", "world", "!");
        List<String> list2 = list;
        list.removeAll(list2);
    }

    public void NamingConvention() {

    }
}
