package state;
/**
 * This class defines the third grade state by creating a list of words based on a third graders vocab, as well as
 * defining the states around it for increasing and decreasing
 * @author Ian Kruger
 */
public class ThirdGradeState extends State {
    
    /**
     * This method initializes the third grade state by creating the word list from the file reader and text file "third"
     * @param spellingList an inheritied object to define the state of
     */
    public ThirdGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("design_patterns/state/third.txt");
    }

    /**
     * an abstract method inherited from the state class, this lets the user change the state of the inherited object Spelling List
     * by increasing the grade level of the spelling list
     * However, the third grade is the highest so it in turn overrides the method and changes it to a print statement informing 
     * that this is the highest level state
     */
    @Override
    public void increaseGrade() {
        System.out.println("Third grade is the highest grade. Cannot go higher.");
    }

    /**
     * an abstract method inherited frmo the state class, this lets the user decrease the grade level by changing the state
     * and in turn provide an easier spelling list
     */
    @Override
    public void decreaseGrade() {
        spellingList.setState(spellingList.getSecondGradeState());
    }
    
}
