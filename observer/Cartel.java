import java.util.ArrayList;

/**
 * This class defines an observer class memeber of the cartel watching the subject
 * @author Ian Kruger
 */
public class Cartel implements Observer{

    private Subject cook;
    private ArrayList<Sighting> sightings;
    
    
    /**
     * Creates an instance of the Observer Cartel and registers it to the subject, as well as initializing ArrayList's
     * @param cook the subject that the observer is registering
     */
    public Cartel(Subject cook) {
        this.cook = cook;
        this.cook.registerObserver(this);
        this.sightings = new ArrayList<Sighting>();
    }


    /**
     * This function updates the sighting list to store the information about each sighting of the Observer
     * @param location the location of the sighting
     * @param description details of the sighting
     * @param accomplices who was with the Subject 
     */
    public void update(String location, String description, ArrayList<String> accomplices) {
        Sighting sighting = new Sighting(location, description, accomplices);
        sightings.add(sighting);
    }


    /**
     * This function acts as a toString, iterating through each sighting and outputting the details
     * @return a paragraph string of each sighting
     */
    public String getLog() { 
        if (sightings != null) {
            String ret = "";
            for (Sighting sighting : sightings) {
                ret += sighting.getLocation();
                ret += "("+sighting.getDetails()+") ";
                ret += "with "+sighting.getAccomplices()+"\n";
            }
            return ret;
        } else {
            return null;
        }
    }

}
