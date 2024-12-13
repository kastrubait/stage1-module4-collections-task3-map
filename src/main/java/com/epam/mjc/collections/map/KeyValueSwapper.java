package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {

        Map<String, Integer> swapWord = new HashMap<>();

        for(Map.Entry<Integer, String> item : sourceMap.entrySet()) {
            if (swapWord.get(item.getValue()) != null) {
                int value =   swapWord.get(item.getValue()) > item.getKey()
                            ? item.getKey()
                            : swapWord.get(item.getValue());
                swapWord.replace(item.getValue(), value);
            } else {
                swapWord.putIfAbsent(item.getValue(), item.getKey());
            }
        }

        return swapWord;
    }
}
