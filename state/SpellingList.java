package state;
/**
 * This class defines the spelling list object that is the subject of the state modification. It creates each possible state
 * then defines the methods that can affect the current state
 * @author Ian Kruger
 */
public class SpellingList {
    
    private State state;
    private FirstGradeState firstGradeState;
    private SecondGradeState secondGradeState;
    private ThirdGradeState thirdGradeState;


    /**
     * This method initializes each possible state that the list can be in, then sets the state to the first one by default.
     */
    public SpellingList() {
        firstGradeState = new FirstGradeState(this);
        secondGradeState = new SecondGradeState(this);
        thirdGradeState = new ThirdGradeState(this);
        setState(firstGradeState);
    }

    /**
     * this method calls upon the current state to retrieve a word from the list
     * @return a String of a word from the states ArrayList of words
     */
    public String getNextWord(){
        return state.getNextWord();
    }

    /**
     * this method changes the current state, calling upon the current state to increase the grade level for a harder word list
     */
    public void increaseGrade() {
        state.increaseGrade();
    }

    /**
     * this method changes the current state, calling upon the current state to decrease the grade level for a easier word list
     */
    public void decreaseGrade() {
        state.decreaseGrade();
    }

    /**
     * this method calls upong the saved first grade state of this class to avoid creating new ones
     * @return the object first grade state stored in the above attributes
     */
    public State getFirstGradeState() {
        return this.firstGradeState;
    }

    /**
     * this method calls upong the saved second grade state of this class to avoid creating new ones
     * @return the object second grade state stored in the above attributes
     */
    public State getSecondGradeState() {
        return this.secondGradeState;
    }

    /**
     * this method calls upong the saved third grade state of this class to avoid creating new ones
     * @return the object third grade state stored in the above attributes
     */
    public State getThirdGradeState() {
        return this.thirdGradeState;
    }

    /**
     * This method changes the current state of the list using the given parameter
     * @param state an object state that defines the grade level of the spelling list
     */
    public void setState(State state) {
        this.state = state;
    }
}
