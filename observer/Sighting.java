import java.util.ArrayList;
/**
 * This class defines an object Sighting for the use of the observer Cartel
 * @author Ian Kruger
 */

public class Sighting {

    private String location;
    private String details;
    private ArrayList<String> accomplices;

    public Sighting(String location, String details, ArrayList<String> accomplices){

        this.location = location;
        this.details = details;
        this.accomplices = accomplices;
    }

    /**
     * @return the String location of the sighting
     */
    public String getLocation() {
        if (this.location != null){
            return location;
        } else {
        return "none";
        }
    }
    
    /**
     * 
     * @return a list of Strings accomplices that saw the sighting
     */
    public String getAccomplices() {
        if (this.accomplices != null){
            String ret = "";
            for (String accomplice : accomplices) {
                ret += accomplice+" ";
            }
            return ret;
        } else {
        return null;
        }
    }
    
    /**
     * @return a String detail that recalls the events of the sighting
     */
    public String getDetails() {
        if (this.details != null){
            return this.details;
        } else {
        return "none";
        }
    }

}