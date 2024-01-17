import java.util.ArrayList;
/**
 * This file contains the details of the Subject Cook class that is observed in the driver.
 * @author Ian Kruger
 */
public class Cook implements Subject{
    
    private ArrayList<Observer> observers;
    private String name;

    /**
     * Initializes the subject as well as a list of Observers for the functionality of each other class
     * @param name 
     */
    public Cook(String name){
        this.name = name;
        this.observers = new ArrayList<Observer>();
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

    /**
     * Adds the observer to the array list 
     * @param observer an instance of each interface Observer related to this Subject cook
     */
    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    /**
     * removes the instance from the list to stop notifying them
     * @param observer instance each interface Observer related to this Subject cook 
     */
    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }


    /**
     * This function iterates through each observer in the observer list to notify them of a new sighting
     * @param location a string of the location of the sighting
     * @param description a string of the events
     * @param accomplices an array list of strings describing people
     */
    @Override
    public void notifyObservers(String location, String description, ArrayList<String> accomplices){
        for (Observer observer : observers) {
            observer.update(location, description, accomplices);
        }
    }

    /**
     * this function converts the input to the right data structures to notify observers
     * @param location a string of the location 
     * @param description a string of the events
     * @param accomplices a string of people
     */
    public void enterSighting(String location, String description, String accomplices) {
        String[] temp = accomplices.split(" ");
        ArrayList<String> accomp = new ArrayList<String>();
        for (String person : temp ) {
            accomp.add(person);
        }
        notifyObservers(location, description, accomp);

    }
}
