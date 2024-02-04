package pl.edu.agh.hangman.Checker;

import java.util.ArrayList;
import java.util.Arrays;

public class LetterChecker {
    public static ArrayList<Integer> checkForLetter(String word, String letter) {
        letter = letter.trim().toUpperCase();
        word = word.toUpperCase();
        ArrayList<Integer> letterPositions = new ArrayList<>();

        if (letter.isEmpty()){
            return  letterPositions;
        }

        int index = word.indexOf(letter);
        while(index >= 0) {
            System.out.println(index);
            index = word.indexOf(letter, index+1);
            letterPositions.add(index);
        }
        return letterPositions;
    }
}