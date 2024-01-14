/**
 * A class that implements the play function of forward players for their shoot puck behavior
 * @author Ian Kruger
 */
public class ShootBehavior implements OffenceBehavior
{

    /**
     * This play method determines the string value displayed if a forward decides to shoot
     * @return a string that says the player shot the puck
     */
    public String play()
    {
        return "Shoots at the goal";
    }
}
