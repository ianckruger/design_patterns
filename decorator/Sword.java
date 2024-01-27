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
     * This file iterates through each character of each line
     * @param decor is the lines of the sword file
     */
    @Override
    protected void integrateDecor(ArrayList<String> decor) {
        for (int i = 0; i < Math.min(decor.size(), lines.size()); i++ ) {
            String combined = "";
            for (int j = 0; j < Math.min(decor.get(i).length(), lines.get(i).length()); j++) {
                char decorChar = decor.get(i).charAt(j);
                if (Character.isWhitespace(decorChar)) {
                    char lineChar = lines.get(i).charAt(j);
                    combined += lineChar;
                } else {
                    combined += decorChar;
                }
            }
            lines.set(i, combined);

        }
    }

    @Override
    public String getName() {
        return this.name;
    }
    
}
