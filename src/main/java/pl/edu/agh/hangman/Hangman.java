package pl.edu.agh.hangman;

import pl.edu.agh.hangman.Checker.LetterChecker;
import pl.edu.agh.hangman.Checker.WordChecker;
import pl.edu.agh.hangman.WordReader.WordCompatibilityChecker;
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

        String word = wordList.get(4);
        System.out.println(word);


        String s = "ffdsfsf   fdfdf";
        WordChecker wordChecker = new WordChecker();
        String mask = wordChecker.MaskWord(s);
        System.out.println(mask);

//        ArrayList<Integer> letterIndexes = LetterChecker.checkForLetter(word, "");
//        for (Integer i: letterIndexes ){
//            System.out.println(i);
//        }

    }
}
