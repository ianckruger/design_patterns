package decorator;
/**
 * This class defines the constructor for a warrior wrap of the player parent
 * @author Ian Kruger
 */

public class Warrior extends Player{

    //this constructor only takes a name, and uses the FileReader to create the player outline for a warrior specifically
    public Warrior(String name) {
        super(FileReader.getLines("design_patterns/decorator/warrior.txt"), name);
    }
}
