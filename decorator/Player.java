package decorator;
/**
 * This file defines the parent class Player with a name and a string depicition of the player
 * @author Ian Kruger
 */
import java.util.ArrayList;

public abstract class Player {

    protected String name;
    protected ArrayList<String> lines;

    public Player(ArrayList<String> lines, String name) {
        this.lines = lines;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        String ret = "";
        for (String line : lines) {
            ret += line + "\n";
        }
        return ret;
    }

}
