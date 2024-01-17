import java.util.ArrayList;

/**
 * This interface defines the base behaviors of the classes observing the subjects
 * @author Ian Kruger
 */
public interface Observer {

    public void update(String location, String description, ArrayList<String> accomplices);
    public String getLog();
}
