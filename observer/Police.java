import java.util.ArrayList;

/**
 * A class that uses the observer interface to depict a DEA Agent watching the meth cook
 * @author Ian Kruger
 */
public class Police implements Observer{
    
    private Subject cook;
    private ArrayList<String> locations;
    private String notes;
    private ArrayList<String> people;

    public Police(Subject cook){
        this.cook = cook;
        this.cook.registerObserver(this);
        this.notes = "Notes:\n";
        this.locations = new ArrayList<String>();
        this.people = new ArrayList<String>();
    }

    /**
     * This function updates the various array lists/notes of the information from a sighting
     * @param location a string contain the location of the sighting of the subject
     * @param description a string description of the sighting 
     * @param accomplices an array list of the accomplices sighted near the subject
     */
    public void update(String location, String description, ArrayList<String> accomplices) {
        locations.add(location);
        if (accomplices != null) {
            for (String accomplice : accomplices) {
                people.add(accomplice);
            }
        }
        notes += "- "+description+"\n";

        
    }

    public String getLog(){
        String ret = "";
        if (locations != null) {
            ret += "Locations:\n";
            for ( String location : locations) {
                ret += "- "+location+"\n";
            }
        } else {
            ret += "Locations:\n\n";
        }
        if (notes != null) {
            ret += "\n"+this.notes+"\n";
        } else {
            ret += this.notes + "\n";
        }
        if (people != null) {
            ret += "Accomplices:\n";
            for (String accomplice : people) {
                ret += "- "+accomplice+"\n";
            }
            ret += "\n";
        } else {
            ret += "Accomplices:\n\n";
        }

        return ret;
    }

}
