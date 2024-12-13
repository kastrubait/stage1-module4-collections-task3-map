package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        String[] words = sentence.split("\\s+|\\.|,|\\?|:|;");

        Map<String, Integer> wordCountTable = new HashMap<>();

        for (String word : words)
        {
            String uniqueWord = word.toLowerCase();
            if (!uniqueWord.isEmpty()) {
                if (wordCountTable.containsKey(uniqueWord)) {
                    wordCountTable.replace(uniqueWord, wordCountTable.get(uniqueWord),
                            wordCountTable.get(uniqueWord) + 1);
                } else {
                    wordCountTable.put(uniqueWord, 1);
                }
            }

        }
        return  wordCountTable;
    }
}
