package state;
/**
 * This class defines the first grade state by creating a list of words based on a first graders vocab, as well as
 * defining the states around it for increasing and decreasing
 * @author Ian Kruger
 */
public class FirstGradeState extends State {
    
    /**
     * This method initializes the first grade state by creating the word list from the file reader and text file "first"
     * @param spellingList an inheritied object to define the state of
     */
    public FirstGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("design_patterns/state/first.txt");
        
    }

    /**
     * an abstract method inherited from the state class, this lets the user change the state of the inherited object Spelling List
     * by increasing the grade level of the spelling list
     */
    @Override
    public void increaseGrade() {
        spellingList.setState(spellingList.getSecondGradeState());
        
    }

    /**
     * an abstract method inherited frmo the state class, this lets the user decrease the grade level by changing the state
     * and in turn provide an easier spelling list.
     * However, the first grade is the lowest so it in turn overrides the method and changes it to a print statement informing 
     * that this is the lowest level state
     */
    @Override
    public void decreaseGrade() {
        System.out.println("First grade is the lowest grade. Cannot go lower.");
    }
    
}
