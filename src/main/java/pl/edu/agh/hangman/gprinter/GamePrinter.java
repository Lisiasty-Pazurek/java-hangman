package pl.edu.agh.hangman.gprinter;

import pl.edu.agh.hangman.Hangman;

public class GamePrinter {

    private static String[] linesToPrint;


    public static void printGameBoard(int state)
    {
//        linesToPrint = Hangman.HANGMANPICS;
//        for (String line : linesToPrint)
//        {
//            System.out.println(line);
//        }
        System.out.println(Hangman.HANGMANPICS[state]);
    }


}
