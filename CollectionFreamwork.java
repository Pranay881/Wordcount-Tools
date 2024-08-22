/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.collectionfreamwork;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author PRANAY
 */
public class CollectionFreamwork {

    public static void main(String[] args) throws FileNotFoundException {

        String filePath = "C:\\Users\\PRAAY\\Desktop\\collection\\input.txt";
        ArrayList<String> wordList = UserOperations.getWordList(filePath);
        System.out.println("\n ********** Word List **********\n");
        UserOperations.printAll(wordList);
        System.out.println("Total Words :" + wordList.size());

        System.out.println("\n ********** Speical Word List **********\n");
        TreeSet<String> uniqueWordList = UserOperations.getSpecialWordSet(wordList);
        UserOperations.printAll(uniqueWordList);
        System.out.println("Total Words :" + uniqueWordList.size());

        System.out.println("\n ********** Word Count **********\n");
        String[][] wordCount = UserOperations.getWordCount(wordList, uniqueWordList);
        UserOperations.printAll(wordCount);
        System.out.println("Total Words :" + wordCount.length);

        System.out.println("\n ********** Top10 Word Count **********\n");

        String top10[][] = UserOperations.getTop10WordList(wordCount);
        UserOperations.printAll(top10);
        System.out.println("Total Words :" + top10.length);

        System.out.println("\n ********** Bottom 10 Word Count **********\n");
        String bottom10[][] = UserOperations.getBottom10WordList(wordCount);
        UserOperations.printAll(bottom10);
        System.out.println("Total Words :" + bottom10.length);

        System.out.println("\n ********** Character Count **********\n");
        String charCount[][] = UserOperations.getCharCount(wordList);
        UserOperations.printAll(charCount);
        System.out.println("Total Character :" + charCount.length);

        System.out.println("\n ********** Top10 Char Count **********\n");
        String top10Char[][] = UserOperations.getTop10CharList(charCount);
        UserOperations.printAll(top10Char);
        System.out.println("Total Words :" + top10Char.length);

        System.out.println("\n ********** Bottom 10 Word Count **********\n");
        String bottom10Char[][] = UserOperations.getBottom10CharList(charCount);
        UserOperations.printAll(bottom10Char);
        System.out.println("Total Words :" + bottom10Char.length);

    }
}
