package decorator;

import java.util.ArrayList;

public abstract class Player {

    protected String name;
    protected ArrayList<String> lines;

    public Player(ArrayList<String> lines, String name) {
        this.name = name;
        this.lines = lines;
    }

    public String getName() {
        if (this.name != null) {
            return this.name;
        } else {
            return "none";
        }
    }

    public String toString() {
        return "";
    }

}
