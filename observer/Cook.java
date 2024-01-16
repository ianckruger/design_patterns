import java.util.ArrayList;
/**
 * This file contains the details of the Subject Cook class that is observed in the driver.
 * @author Ian Kruger
 */
public class Cook implements Subject{
    
    private ArrayList<Observer> observers;
    private String name;

    public Cook(String name){
        this.name = name;
    }

    /**
     * @return a String of the cooks name
     */
    public String getName(){
        if(this.name != null){
            return this.name;
        } else {
            return "none";
        }
    }

    public void registerObserver(Observer observer){
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyObservers(String location, String description, ArrayList<String> accomplices){
        //Not sure what this means
    }

    public void enterSighting(String location, String description, String accomplices){
        // not sure what this means
    }
}
