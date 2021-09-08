package com.alfabank.work3;

import java.util.HashMap;
import java.util.Map;

public class MyTranslator {
    Map<String, String> map = new HashMap<>();

    public void addWords(String key, String value) {
        map.put(key, value);
    }

    public String translate(String text) {
        StringBuilder fraza = new StringBuilder();
        String[] words = text.split(" ");
        for (String elem : words) {
            String token = map.get(elem);
            if (token != null) {
                fraza.append(token);
            } else {
                fraza.append(elem);
            }
            fraza.append(" ");
        }
        return fraza.toString().trim();
    }
}