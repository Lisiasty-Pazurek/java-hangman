package pl.edu.agh.hangman;
import pl.edu.agh.hangman.GameState.GameState;
import pl.edu.agh.hangman.gprinter.GamePrinter;

public class BestGameExe {
    public static void main(String[] args) {
        GameState gameState = new GameState("test", 6);
        GamePrinter.refreshBoard(gameState);
    }
}
