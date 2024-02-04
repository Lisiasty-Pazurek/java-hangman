package pl.edu.agh.hangman.gprinter;

import pl.edu.agh.hangman.GameState.GameState;
import pl.edu.agh.hangman.Hangman;

public class GamePrinter {

    public static void printGameBoard(String[] imagePool, int count)
    {
        System.out.println(imagePool[count]);
    }

    public static void printGameWord(String word)
    {
        System.out.println(word);
    }

    public static void refreshBoard(GameState gameState)
    {

        System.out.println(Hangman.HANGMANPICS[gameState.getCount()]);
        System.out.println(gameState.getCurrentWord());
    }


}
