import java.util.ArrayList;

/**
 * This class defines an observer class memeber of the cartel watching the subject
 * @author Ian Kruger
 */
public class Cartel implements Observer{

    private Subject cook;
    private ArrayList<Sighting> sightings;
    
    public Cartel(Subject cook) {
        this.cook = cook;
        this.cook.registerObserver(this);
        this.sightings = new ArrayList<Sighting>();
    }

    public void update(String location, String description, ArrayList<String> accomplices) {
        Sighting sighting = new Sighting(location, description, accomplices);
        sightings.add(sighting);
    }

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
