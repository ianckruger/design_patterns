package decorator;
/**
 * This file contains the parent/child class PlayerDecorater that inherites the contents of a player
 * and passes them down to its child node Decorators with abstract methods that force them to 
 * decorate the player
 * @author Ian Kruger
 */
import java.util.ArrayList;

public abstract class PlayerDecorator extends Player{

    private Player player;

    public PlayerDecorator(Player player) {
        super(player.lines, player.name);
    }

    protected abstract void integrateDecor(ArrayList<String> decor);
}
