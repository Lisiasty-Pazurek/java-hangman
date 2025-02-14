package pl.edu.agh.hangman;

import pl.edu.agh.hangman.Checker.LetterChecker;
import pl.edu.agh.hangman.Checker.Masker;
import pl.edu.agh.hangman.WordReader.WordCompatibilityChecker;
import pl.edu.agh.hangman.WordReader.WordRandomizer;
import pl.edu.agh.hangman.WordReader.WordReaderFromFile;

import java.util.ArrayList;

public class Hangman {

    public static final String[] HANGMANPICS = new String[]{
            "  +---+\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "========"
    };

    //komentarz
    public static void main(String[] args) {
        WordReaderFromFile reader = new WordReaderFromFile("src/main/resources/slowa.txt");
        ArrayList<String> wordList = reader.GetWordList();
        wordList = WordCompatibilityChecker.GetGameCompatibleWordList(wordList);
        String word = WordRandomizer.GetRandowWord(wordList);
        LetterChecker letterChecker = new LetterChecker();
        Masker masker = new Masker(word, letterChecker);

        System.out.println(word);
        System.out.println(masker.getMasking());

        masker.unmaskWord("A");

        System.out.println(masker.getMasking());


//        ArrayList<Integer> letterIndexes = LetterChecker.checkForLetter(word, "");
//        for (Integer i: letterIndexes ){
//            System.out.println(i);
//        }

    }
}
