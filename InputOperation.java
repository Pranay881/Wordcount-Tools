/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collectionfreamwork;

import java.util.*;
import java.io.*;

/**
 *
 * @author PRANAY
 */
public class InputOperation {

      public static String getInputFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        String inputString = "";

        while (sc.hasNext()) {
            inputString = inputString + sc.next() + " ";
        }
        return inputString.toLowerCase();
    }

    public static ArrayList<String> getStopwordFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        ArrayList<String> inputList = new ArrayList<>();

        while (sc.hasNext()) {
            inputList.add(sc.next());
        }
        return inputList;
    }

    public static ArrayList<Character> getSymbolsList(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        ArrayList<Character> symbolList = new ArrayList<>();

        while (sc.hasNext()) {
            symbolList.add(sc.next().charAt(0));
        }
        return symbolList;
    }

    public static ArrayList<String> getWordList(String input) {
        String inputString[] = input.split(" ");
        ArrayList<String> inputList = new ArrayList<>();
        for (String string : inputString) {
            inputList.add(string);
        }
        return inputList;
    }

}
