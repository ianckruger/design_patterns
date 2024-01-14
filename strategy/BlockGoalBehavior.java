import java.util.Random;
/**
 * A class that implements the play function of goalie players for their block goal behavior
 * @author Ian Kruger
 */
public class BlockGoalBehavior implements OffenceBehavior, DefenceBehavior {
    
    /**
     * This function determines the return string for a Goalie no matter what position hes in based on a 1/4 chance
     * @return a string that determines the play of the goalie when blocking a puck
     */
    public String play() {
        Random random = new Random();
        int choice = random.nextInt(4);
        if (choice == 0) {
            return "hand blocks the puck";
        } else if(choice == 1) {
            return "catches the puck";
        } else if(choice==2) {
            return "blocks puck with knee pads";
        } else {
            return "blocks puck with stick";
        }
    } 
    
}
