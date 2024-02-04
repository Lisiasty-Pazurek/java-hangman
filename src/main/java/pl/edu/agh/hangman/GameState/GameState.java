package pl.edu.agh.hangman.GameState;

public class GameState {

    public GameState (String wordToFind, int maxCount) {
        this.wordToFind = wordToFind;
        this.maxCount = maxCount;

    }
    private String wordToFind = "";

    private int count = 0;
    private int maxCount;
    private String currentWord;

    public String getWordToFind() {
        return this.wordToFind;
    }

    public void setWordToFind(String wordToFind) {
        wordToFind = wordToFind;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCurrentWord() {
        return currentWord;
    }

    public void setCurrentWord(String currentWord) {
        this.currentWord = currentWord;
    }
    public void nextMove() {
        this.count++;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }
}
