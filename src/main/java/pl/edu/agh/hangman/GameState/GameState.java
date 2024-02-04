package pl.edu.agh.hangman.GameState;

public class GameState {
    private String wordToFind = "";
    private int count = 0;
    private String currentWord;

    public String getWordToFind() {
        return wordToFind;
    }

    public void setWordToFind(String wordToFind) {
        this.wordToFind = wordToFind;
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
        this.count = count++;
    }

}
