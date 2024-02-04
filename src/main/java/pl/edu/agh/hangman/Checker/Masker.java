package pl.edu.agh.hangman.Checker;

import java.util.ArrayList;

public class Masker {
    public String word;

    private void setMasking(String masking) {
        this.masking = masking;
    }

    public String masking;
    public String getMasking() {
        return masking;
    }
    public String getWord() {
        return masking;
    }

    private LetterChecker letterChecker;
    public Masker(String word, LetterChecker letterChecker) {
        this.letterChecker = letterChecker;
        this.masking = maskWord(word);
        this.word = word;
    }

    private String maskWord(String word) {
        ArrayList<String> letters = new ArrayList<>();
        for (String letter: word.toUpperCase().split("")) {
            char letterChar = letter.charAt(0);
            if (Character.isWhitespace(letterChar)) letters.add(" ");
            else letters.add("_");
        }
        return String.join("", letters);
    }

    public boolean unmaskWord(String letter){
        ArrayList<Integer> letterIndexes = letterChecker.checkForLetter(word, letter);
        if (letterIndexes.isEmpty()){
            System.out.println("miss");
            return true;
        }
        for (Integer index: letterIndexes) {
            char c = letter.charAt(0);

            StringBuilder newMask = new StringBuilder(getMasking());
            newMask.setCharAt(index, c);
            setMasking(newMask.toString());

        }
        return false;
    }
}
