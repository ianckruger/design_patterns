package decorator;
/**
 * 
 * @author Ian Kruger
 */

import java.util.ArrayList;

public class Sword extends PlayerDecorator {

    public Sword(Player player) {
        super(player);
        integrateDecor(FileReader.getLines("design_patterns/decorator/sword.txt"));
    }

    /**
     * 
     * @param decor is the lines of the sword fileZ
     */
    @Override
    protected void integrateDecor(ArrayList<String> decor) {
        for (int i =0; i < this.lines.size(); i++) {
            System.out.println(decor.get(i));
        }
    }

    @Override
    public String getName() {
        return this.name;
    }
    
}
