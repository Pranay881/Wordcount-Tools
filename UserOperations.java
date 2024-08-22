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
public class UserOperations {
public static ArrayList<String> getWordList(String filePath) throws FileNotFoundException {
        String input = InputOperation.getInputFile(filePath);
        input = DataOperation.RemoveSymbolList(input);
        ArrayList<String> list = DataOperation.RemoveStopWord(input);
        return list;
    }

    public static void printAll(Collection<String> collection) {
        for (String item : collection) {
            System.out.println(item);
        }
    }

    public static TreeSet<String> getSpecialWordSet(ArrayList<String> wordList) {//???????????????????????????????????????????????????????
        return new TreeSet<>(wordList);
    }

    public static String[][] getWordCount(ArrayList<String> wordList, TreeSet<String> specialWordSet) {
        String[][] wordCount = new String[specialWordSet.size()][2];
        int row = 0;
        for (String word : specialWordSet) {
            int count = Collections.frequency(wordList, word);
            String countString = String.valueOf(count);
            wordCount[row][0] = word;
            wordCount[row][1] = countString;
            row++;
        }
        return wordCount;
    }

    public static void printAll(String[][] list) {
        for (String[] strings : list) {
            System.out.println(strings[0] + " " + strings[1]);
        }
    }

    public static String[][] getTop10WordList(String wordCount[][]) {
        String top10[][] = new String[10][2];

        for (int i = 0; i < wordCount.length; i++) {
            for (int j = i; j < wordCount.length; j++) {
                int iCount = Integer.parseInt(wordCount[i][1]);//Integer.parseInt///////?
                int jCount = Integer.parseInt(wordCount[j][1]);
                if (iCount < jCount) {
                    //swap word
                    String temp = wordCount[i][0];
                    wordCount[i][0] = wordCount[j][0];
                    wordCount[j][0] = temp;
                    //swap count
                    temp = wordCount[i][1];
                    wordCount[i][1] = wordCount[j][1];
                    wordCount[j][1] = temp;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            top10[i][0] = wordCount[i][0];
            top10[i][1] = wordCount[i][1];
        }
        return top10;
    }

    public static String[][] getBottom10WordList(String wordCount[][]) {
        String bottom10[][] = new String[10][2];

        for (int i = 0; i < wordCount.length; i++) {
            for (int j = i; j < wordCount.length; j++) {
                int iCount = Integer.parseInt(wordCount[i][1]);
                int jCount = Integer.parseInt(wordCount[j][1]);
                if (iCount > jCount) {
                    //swap word
                    String temp = wordCount[i][0];
                    wordCount[i][0] = wordCount[j][0];
                    wordCount[j][0] = temp;
                    //swap count
                    temp = wordCount[i][1];
                    wordCount[i][1] = wordCount[j][1];
                    wordCount[j][1] = temp;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            bottom10[i][0] = wordCount[i][0];
            bottom10[i][1] = wordCount[i][1];
        }
        return bottom10;
    }

    public static String[][] getCharCount(ArrayList<String> wordList) {

        String input = "";

        for (String string : wordList) {
            input = input + string + " ";
        }

        char inputCharArray[] = input.toCharArray();

        String alphabetArray[] = new String[26];
        int index = 0;
        for (int i = 97; i <= 122; i++) {
            char unicodeAlphabet = (char) i;
            alphabetArray[index] = String.valueOf(unicodeAlphabet);
            index++;
        }
        ArrayList<String> inputStringList = new ArrayList<>();
        for (char c : inputCharArray) {
            inputStringList.add(String.valueOf(c));
        }

        String charCount[][] = new String[alphabetArray.length][2];
        int row = 0;
        for (String alphabet : alphabetArray) {
            int count = Collections.frequency(inputStringList, alphabet);
            String countString = String.valueOf(count);
            charCount[row][0] = alphabet;
            charCount[row][1] = countString;
            row++;
        }
        return charCount;
    }

    public static String[][] getTop10CharList(String charCount[][]) {
        String top10[][] = new String[10][2];

        for (int i = 0; i < charCount.length; i++) {
            for (int j = i; j < charCount.length; j++) {
                int iCount = Integer.parseInt(charCount[i][1]);
                int jCount = Integer.parseInt(charCount[j][1]);
                if (iCount < jCount) {
                    //swap word
                    String temp = charCount[i][0];
                    charCount[i][0] = charCount[j][0];
                    charCount[j][0] = temp;
                    //swap count
                    temp = charCount[i][1];
                    charCount[i][1] = charCount[j][1];
                    charCount[j][1] = temp;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            top10[i][0] = charCount[i][0];
            top10[i][1] = charCount[i][1];
        }
        return top10;
    }

    public static String[][] getBottom10CharList(String charCount[][]) {
        String bottom10[][] = new String[10][2];

        for (int i = 0; i < charCount.length; i++) {
            for (int j = i; j < charCount.length; j++) {
                int iCount = Integer.parseInt(charCount[i][1]);
                int jCount = Integer.parseInt(charCount[j][1]);
                if (iCount > jCount) {
                    //swap word
                    String temp = charCount[i][0];
                    charCount[i][0] = charCount[j][0];
                    charCount[j][0] = temp;
                    //swap count
                    temp = charCount[i][1];
                    charCount[i][1] = charCount[j][1];
                    charCount[j][1] = temp;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            bottom10[i][0] = charCount[i][0];
            bottom10[i][1] = charCount[i][1];
        }
        return bottom10;
    }

}
