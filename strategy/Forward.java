/**
 * A subclassification of Player, this class defines the offensive and defensive plays of the Forward
 * @author Ian Kruger
 */
public class Forward extends Player {
    

    public Forward(String firstName, String lastName) {
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
     * This function defines the abstract method OffenceBehavior inherited from Player by intializing the
     * offensive behavior based on a 50/50 chance
     */
    public void setOffenceBehavior() {
        int rand = random.nextInt(2);
        if (rand==1) {
            this.offenceBehavior = new PassBehavior();
        } else {
            this.offenceBehavior = new ShootBehavior();
        }
    }


    @Override
    public String toString() {
        return super.toString()+" plays the position Forward";
    }

    
}
