package state;
/**
 * This class defines the second grade state by creating a list of words based on a second graders vocab, as well as
 * defining the states around it for increasing and decreasing
 * @author Ian Kruger
 */
public class SecondGradeState extends State{

    /**
     * This method initializes the second grade state by creating the word list from the file reader and text file "second"
     * @param spellingList an inheritied object to define the state of
     */
    public SecondGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("design_patterns/state/second.txt");
    }

    /**
     * an abstract method inherited from the state class, this lets the user change the state of the inherited object Spelling List
     * by increasing the grade level of the spelling list
     */
    @Override
    public void increaseGrade() {
        spellingList.setState(spellingList.getThirdGradeState());
    }

    /**
     * an abstract method inherited frmo the state class, this lets the user decrease the grade level by changing the state
     * and in turn provide an easier spelling list
     */
    @Override
    public void decreaseGrade() {
        spellingList.setState(spellingList.getFirstGradeState());
    }
    
}
