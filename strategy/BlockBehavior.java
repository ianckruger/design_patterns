import java.util.Random;
/**
 * A class that implements the play function of defensive players for their block behavior
 * @author Ian Kruger
 */
public class BlockBehavior implements DefenceBehavior {

    /**
     * This Play function determines the defensive play of a player based on a 1/3 chance
     * @return a String describing the block play of the Player
     */
    public String play() {
        Random random = new Random();
        int choice = random.nextInt(3);
        if (choice == 0) {
            return "blocks player from passing";
        } else if(choice == 1) {
            return "blocks player from shooting";
        } else {
            return "checks player with puck";
        }
    }    
    
}
