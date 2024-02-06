import java.io.File;
import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * @author Ian Kruger
 */
public class FlashCards {
    private Random rand;
    private static FlashCards flashCards;
    private ArrayList<Word> words;
    private Word currentWord;

    private FlashCards() {}

    public static FlashCards getInstance() {
        if(flashCards == null) {
            flashCards = new FlashCards();
            flashCards.rand = new Random();
            flashCards.words = FileReader.getWords();
            flashCards.currentWord = flashCards.words.get(flashCards.rand.nextInt(flashCards.words.size()));
        }
        return FlashCards.flashCards;
    }

    public Word getWord() {
        flashCards.currentWord = flashCards.words.get(flashCards.rand.nextInt(flashCards.words.size()));
        return this.currentWord;
    }
    
}
