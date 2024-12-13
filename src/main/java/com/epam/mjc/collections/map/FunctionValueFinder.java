package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);

        return functionMap.containsValue(requiredValue);
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {

        Map<Integer, Integer> functionMap = new HashMap<>();

        for (Integer num : sourceList) {
            functionMap.putIfAbsent(num, 5 * num + 2);
        }

        return functionMap;
    }
}
