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

    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String location, String description, ArrayList<String> accomplices){
        for (Observer observer : observers) {
            observer.update(location, description, accomplices);
        }
    }

    public void enterSighting(String location, String description, String accomplices) {
        String[] temp = accomplices.split(" ");
        ArrayList<String> accomp = new ArrayList<String>();
        for (String person : temp ) {
            accomp.add(person);
        }
        notifyObservers(location, description, accomp);

    }
}
