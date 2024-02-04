package pl.edu.agh.hangman.Checker;

import java.util.ArrayList;

public class WordChecker {

    public String word;
    public String masking;
    public String getMasking() {
        return masking;
    }
    public void setMasking(String masking) {
        this.masking = masking;
    }
    public WordChecker() {
    }

    public String MaskWord(String word) {
        ArrayList<String> letters = new ArrayList<>();
        for (String letter: word.toUpperCase().split("")) {
            char letterChar = letter.charAt(0);
            if (Character.isWhitespace(letterChar)) letters.add(" ");
            else letters.add("_");
        }
        return String.join("", letters);
    }


}
