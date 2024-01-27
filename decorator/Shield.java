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
        integrateDecor(FileReader.getLines("design_patterns/decorator/shield.txt"));
    }

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
}
