import java.util.Random;

/**
 *  An abstract class that defines a common Player on the team of a hockey game
 * @author Ian Kruger
 */

public abstract class Player {
    
    private String firstName;
    private String lastName;
    protected Random random;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;

    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        random = new Random();
        setDefenceBehavior();
        setOffenceBehavior();
    }

    /**
     * a function that calls for the private first name of a player
     * @return the private string of the players first name
     */
    public String getFirstName() {
        if (this.firstName != null) {
            return this.firstName;
        } else {
            return null;
        }
    }

    /**
     * A function that calls for the private last name of a player
     * @return the private string of the players last name
     */
    public String getLastName() {
        if (this.lastName != null) {
            return this.lastName;
        } else {
            return null;
        }
    }

    /**
     * a function that determines the play of the player based on their class and possession
     * @param possession determines which play stratagey to use, either defense or offense
     * @return a string describing the play strategy of the player
     */
    public String play(boolean possession) {
        if (possession) {
            setOffenceBehavior();
            if (offenceBehavior != null) {
                return offenceBehavior.play();
            }
        } else {
            setDefenceBehavior();
            if (defenceBehavior != null) {
                return defenceBehavior.play();
            }
        }
        return null;
    }

    /**
     * An abstract class that sets the defence behavior for each class of player. This determines the return String outputted for
     * the play method above.
     */
    public abstract void setDefenceBehavior();

    /**
     * An abstract class that sets the defence behavior for each class of player. This determines the return String outputted for
     * the play method above.
     */
    public abstract void setOffenceBehavior();

    /**
     * creates a string representation of the player
     * @return A string representation of the player
     */
    public String toString() {
        return firstName+" "+lastName;
    }


}
