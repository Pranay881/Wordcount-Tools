/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collectionfreamwork;

import java.io.FileNotFoundException;
import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author PRANAY
 */
public class UserOperations1 {

    public static void printAll(Collection<String> list) {
        for (String string : list) {
            System.out.println(string);
        }
    }

    public static void printAll(Map<String, Integer> count) {
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "  " + value);

        }
    }

    public static ArrayList<String> getWordList(String filePath) throws FileNotFoundException {
        String input = InputOperation.getInputFile(filePath);
        input = DataOperation.RemoveSymbolList(input);
        ArrayList<String> list = DataOperation.RemoveStopWord(input);
        return list;
    }

    public static TreeSet<String> getUniqueWordList(ArrayList<String> wordList) {
        return new TreeSet<>(wordList);
    }

    public static Map<String, Integer> getWordCount(ArrayList<String> wordList, TreeSet<String> uniqueWordList) {

        Map<String, Integer> wordCount = new TreeMap<>();
        for (String word : uniqueWordList) {
            int count = Collections.frequency(wordList, word);
            String countString = String.valueOf(count);
            wordCount.put(word, count);
        }

        return wordCount;
 
    }
            
        

    
}
