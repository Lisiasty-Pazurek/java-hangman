package pl.edu.agh.hangman.WordReader;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class WordReaderFromFile {
    String filename;

    public WordReaderFromFile(String filename) {
        this.filename = filename;
    }

    public ArrayList<String> GetWordList() {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
           ArrayList<String> words = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                words.add(line);
            }
            return words;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return new ArrayList<>();
        }
    }

}
