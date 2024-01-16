/**
 * A subclassification of Player, this class defines the offensive and defensive plays of the Goalie
 * @author Ian Kruger
 */
public class Goalie extends Player {


    public Goalie(String firstName, String lastName) {
        super(firstName, lastName);
    }
    

    /**
     * This function defines the abstract method DefenceBehavior inherited from Player by initializing the 
     * defensive behavior to always block goal
     */
    public void setDefenceBehavior() {
        this.defenceBehavior = new BlockGoalBehavior();
    }


    /**
     * This function defines the abstract method DefenceBehavior inherited from Player by initializing the 
     * offensive behavior to always block goal
     */
    public void setOffenceBehavior() {
        this.defenceBehavior = new BlockGoalBehavior();
    }


    @Override
    public String toString() {
        return super.toString() +" plays the position: Goalie";
    }

    
}
