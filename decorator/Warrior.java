package decorator;
/**
 * 
 * @author Ian Kruger
 */

public class Warrior extends Player{

    public Warrior(String name) {
        super(FileReader.getLines("design_patterns/decorator/warrior.txt"), name);
    }
}
