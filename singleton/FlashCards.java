import java.util.ArrayList;
import java.util.Random;

/**
 * This file contains a static instance of a FlashCard object
 * @author Ian Kruger
 */
public class FlashCards {
    private Random rand;
    private static FlashCards flashCards;
    private ArrayList<Word> words;
    private Word currentWord;

    private FlashCards() {}

    /**
     * this function keeps one instance of the current object throughout the file by retrieving a saved instance within the object
     * if there is no instance it creates a new one
     * @return an instance of the current object
     */
    public static FlashCards getInstance() {
        if(flashCards == null) {
            flashCards = new FlashCards();
            flashCards.rand = new Random();
            flashCards.words = FileReader.getWords();
            flashCards.currentWord = flashCards.words.get(flashCards.rand.nextInt(flashCards.words.size()));
        }
        return FlashCards.flashCards;
    }

    /**
     * this function retrieves the current word of the flash card instance after accessing a new word within the list.
     * @return an object Word within the array word list
     */
    public Word getWord() {
        flashCards.currentWord = flashCards.words.get(flashCards.rand.nextInt(flashCards.words.size()));
        return this.currentWord;
    }
    
}
