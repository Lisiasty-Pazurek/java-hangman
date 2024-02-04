package pl.edu.agh.hangman;
import pl.edu.agh.hangman.Checker.LetterChecker;
import pl.edu.agh.hangman.GameState.GameState;
import pl.edu.agh.hangman.WordReader.WordCompatibilityChecker;
import pl.edu.agh.hangman.WordReader.WordRandomizer;
import pl.edu.agh.hangman.WordReader.WordReaderFromFile;
import pl.edu.agh.hangman.gprinter.GamePrinter;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class BestGameExe {
    public static void main(String[] args) {
        WordReaderFromFile reader = new WordReaderFromFile("src/main/resources/slowa.txt");
        ArrayList<String> wordList = reader.GetWordList();
        wordList = WordCompatibilityChecker.GetGameCompatibleWordList(wordList);

        GameState gameState = new GameState(WordRandomizer.GetRandowWord(wordList), 6);
        // TODO: mask word for display
        Scanner scanner = new Scanner(System.in);
        while (true) {

            GamePrinter.refreshBoard(gameState);

            Character letter = scanner.next().charAt(0);
            LetterChecker.checkForLetter(gameState.getWordToFind(), letter.toString());

            //TODO: Unmask checked letters, increment gameState count by 1,

            
        }

    }
}
