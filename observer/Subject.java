import java.util.ArrayList;
/**
 * This interface defines the base behaviors of the Subject classes that are being observed
 * @author Ian Kruger
 */
public interface Subject {

    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(String location, String description, ArrayList<String> accomplices);

}
