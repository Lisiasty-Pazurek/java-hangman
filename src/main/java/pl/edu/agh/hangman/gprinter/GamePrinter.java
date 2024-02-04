package pl.edu.agh.hangman.gprinter;

import pl.edu.agh.hangman.Hangman;

public class GamePrinter {


    public static void printGameBoard(int state)
    {
        System.out.println(Hangman.HANGMANPICS[state]);
    }

    public static void printGameWord(String word)
    {
        System.out.println(word);
    }


}
