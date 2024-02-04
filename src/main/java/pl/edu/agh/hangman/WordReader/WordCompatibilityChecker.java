package pl.edu.agh.hangman.WordReader;

import java.util.ArrayList;
import java.util.List;

public class WordCompatibilityChecker {
    static ArrayList<String> GetGameCompatibleWordList(ArrayList<String> wordList)
    {
        ArrayList<String> compatibleWordList = new ArrayList<>();
        for (String word: wordList              ) {
            //TODO usuwanie spacji i znaków innych niż litery
            compatibleWordList.add(word.trim().toUpperCase());
        }

        return compatibleWordList;
    }
}
