package com.chocksaway;

import java.util.Arrays;
import java.util.List;

public class Calendar {
    private String content;
    private List<String> strings;

    public Calendar(String content) {
        this.content = content;
    }


    public String getContent() {
        return content;
    }

    public List<String> getStrings() {
        return Arrays.asList("This is", "a", "test");
    }
}