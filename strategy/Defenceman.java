/**
 * A subclassification of Player, this class defines the offensive and defensive plays of the Defenceman
 * @author Ian Kruger
 */
public class Defenceman extends Player {
    

    public Defenceman(String firstName, String lastName) {
        super(firstName, lastName);
    }

    /**
     * This function defines the abstract method DefenceBehavior inherited from Player by initializing the 
     * defensive behavior based on a 50/50 chance
     */
    public void setDefenceBehavior() {
        int rand = random.nextInt(2);
        if (rand==1) {
            this.defenceBehavior = new ChasePuckBehavior();
        } else {
            this.defenceBehavior = new BlockBehavior();
        }
    }

    /**
     * This function defines the abstract method DefenceBehavior inherited from Player by initializing the 
     * defensive behavior to pass 90% of the time, with the other 10% intializing a slap shot
     */
    public void setOffenceBehavior() {
        int rand = random.nextInt(10);
        if (rand==1) {
            this.offenceBehavior = new PassBehavior();
        } else {
            this.offenceBehavior = new SlapShotBehavior();
        }
    }

    @Override
    public String toString() {
        return getFirstName()+" "+getLastName()+" plays the position Defenceman";
    }

    
}
