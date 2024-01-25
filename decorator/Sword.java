package decorator;
/**
 * 
 * @author Ian Kruger
 */

import java.util.ArrayList;

public class Sword extends PlayerDecorator {

    public Sword(Player player) {
        super(player);
        integrateDecor(lines);
    }

    @Override
    protected void integrateDecor(ArrayList<String> decor) {
        ArrayList<String> sword = FileReader.getLines("sword.txt");
        for ()
    }
    
}
