/**
 * A class that implements the play function of defensive players for their chase puck behavior
 * @author Ian Kruger
 */
public class ChasePuckBehavior implements DefenceBehavior {

    /**
     * This play method determines the string value displayed if a player decides to chase a puck
     * @return a string that says the player chases the puck
     */
    public String play() {
        return "Chases the puck";
    }
    
}
