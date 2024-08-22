/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collectionfreamwork;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author PRANAY
 */
public class DataOperation {

    public static String RemoveSymbolList(String inputString) throws FileNotFoundException {
        ArrayList<Character> symbolsList = InputOperation.getSymbolsList("C:\\Users\\PRAAY\\Desktop\\collection\\Symbols.txt");
        ArrayList<Character> inputList = new ArrayList<>();
        char inputChar[] = inputString.toCharArray();

        for (char string : inputChar) {
            inputList.add(string);
        }
        inputList.removeAll(symbolsList);

        inputString = "";

        for (Character character : inputList) {
            inputString = inputString + String.valueOf(character);
        }
        return inputString;
    }

    public static ArrayList<String> RemoveStopWord(String inputString) throws FileNotFoundException {
        ArrayList<String> WordList = InputOperation.getWordList(inputString);
        ArrayList<String> inputList = InputOperation.getStopwordFile("C:\\Users\\PRAAY\\Desktop\\collection\\StopWord.txt");
        WordList.add(" ");//?????????????????????????????????????????????????????/
        inputList.removeAll(WordList);
        return inputList;
    }
}
