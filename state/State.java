package state;
/**
 * This class defines the abstract state object that controls the state or grade of the spelling list
 * @author Ian Kruger
 */

import java.util.ArrayList;
import java.util.Random;

public abstract class State {

    protected SpellingList spellingList;
    protected ArrayList<String> words;
    private Random rand;

    /**
     * This method initializes the state by creating the random for the spelling list that it inherits to use
     * @param spellingList an object spelling list that has multiple states
     */
    public State(SpellingList spellingList) {
        this.spellingList = spellingList;
        this.rand = new Random();
    }

    /**
     * This method accesses the ArrayList of words for the spelling list based on the current state
     * @return a string word for the user to spell
     */
    public String getNextWord() {
        return words.get(rand.nextInt(words.size()-1));
    }

    /**
     * an abstract method that "increases the grade" or changes the state to the next highest state
     */
    public abstract void increaseGrade();
    /**
     * similar to the above method, this decrease the grade/state
     */
    public abstract void decreaseGrade();
    
}
