package decorator;

import java.util.ArrayList;

/**
 * 
 * @author Ian Kruger
 */

public abstract class PlayerDecorator extends Player{

    private Player player;

    public PlayerDecorator(Player player) {
        this.player = player;
    }

    protected void integrateDecor(ArrayList<String> decor) {
        
    }
}
