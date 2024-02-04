package pl.edu.agh.hangman.GameState;

public class GameState {
    private static String wordToFind = "";
    private static int count = 0;
    private static String currentWord;

    public static String getWordToFind() {
        return wordToFind;
    }

    public static void setWordToFind(String wordToFind) {
        wordToFind = wordToFind;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        count = count;
    }

    public static String getCurrentWord() {
        return currentWord;
    }

    public static void setCurrentWord(String currentWord) {
        currentWord = currentWord;
    }
    public void nextMove() {
        this.count = count++;
    }

}
