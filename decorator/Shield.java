package decorator;

import java.util.ArrayList;

/**
 * 
 * @author Ian Kruger
 */

public class Shield extends PlayerDecorator {

    FileReader fileReader;

    public Shield(Player player) {
        super(player);
    }

    @Override
    protected void integrateDecor(ArrayList<String> decor) {
        
    }
}
