package pl.edu.agh.hangman.WordReader;

import java.util.ArrayList;
import java.util.List;


public class WordCompatibilityChecker {
    public static ArrayList<String> GetGameCompatibleWordList(ArrayList<String> wordList) {
        ArrayList<String> compatibleWordList = new ArrayList<>();
        for (String word : wordList) {
            boolean isOk = true;
            for (Character character : word.toCharArray()
            ) {
                if (!Character.isLetter(character) && !Character.isSpaceChar(character))
                    isOk = false;
            }
            if (isOk)
                compatibleWordList.add(word.trim().toUpperCase());
        }

        return compatibleWordList;
    }
}
