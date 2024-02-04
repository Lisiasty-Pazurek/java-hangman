package pl.edu.agh.hangman.WordReader;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
public class WordRandomizer {
    public static String GetRandowWord(ArrayList<String> wordList)
    {
        int randomNumber = ThreadLocalRandom.current().nextInt(0, wordList.size());
        return wordList.get(randomNumber);
    }
}
