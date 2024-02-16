package iterator;
import java.util.Iterator;
/**
 * This class defines the TaskListIterator that creates functions for checking list indexs and 
 * moving the list along
 * @author Ian Kruger
 */
public class TaskListIterator implements Iterator{
    private Ticket[] tickets;
    private int position = 0;

    TaskListIterator(Ticket[] tickets) {
        this.tickets = tickets;
    }

    /**
     * checks the current positions status and data to see if there is more to the list
     * @return a boolean true or false 
     */
    public boolean hasNext() {
        return (tickets[position] != null && position < tickets.length);
    }

    /**
     * this function returns the current positions ticket, then increases it by 1 for the next iteration
     * @return a ticket of the next position
     */
    public Ticket next(){
        Ticket ticket = tickets[position];
        position += 1;
        return ticket;
    }

    /**
     * a simple get position function for other functions
     * @return an int of the current position
     */
    public int getPosition() {
        return this.position;
    }

}
