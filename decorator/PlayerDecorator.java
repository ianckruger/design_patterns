package decorator;

import java.util.ArrayList;

/**
 * 
 * @author Ian Kruger
 */

public abstract class PlayerDecorator extends Player{

    private Player player;

    public PlayerDecorator(Player player) {
        super(player.lines, player.name);
    }

    protected abstract void integrateDecor(ArrayList<String> decor);
}
