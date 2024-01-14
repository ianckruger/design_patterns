/**
 * A class that implements the play function of defensive players for their chase puck behavior
 * @author Ian Kruger
 */
public class PassBehavior implements OffenceBehavior
{
    /**
     * This play method determines the string value displayed if a defence man decides to pass
     * @return a string that says the player passes the puck
     */
    public String play()
    {
        return "Passes to a forward";
    }
}
