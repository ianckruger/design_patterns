/**
 * A class that implements the play function of defenceman players for their slap shot puck behavior
 * @author Ian Kruger
 */
public class SlapShotBehavior implements OffenceBehavior 
{

    /**
     * This play method determines the string value displayed if a defenceman decides to shoot
     * @return a string that says the player slap shot the puck
     */
    public String play()
    {
        return "Shoots the puck from the blue line";
    }
}
