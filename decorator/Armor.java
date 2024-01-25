package decorator;

import java.util.ArrayList;

/**
 * 
 * @author Ian Kruger
 */

public class Armor extends PlayerDecorator {
    

    public Armor(Player player) {
        super(player);
    }

    @Override
    protected void integrateDecor(ArrayList<String> decor) {
        
    }

    @Override
    public String getName() {
        return this.name;
    }

}
