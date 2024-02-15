package iterator;
import java.util.Iterator;

public class TaskListIterator implements Iterator{
    private Ticket[] tickets;
    private int position = 0;

    TaskListIterator(Ticket[] tickets) {
        this.tickets = tickets;
    }

    public boolean hasNext() {
        return (tickets[position] != null && position < tickets.length);
    }

    public Ticket next(){
        Ticket ticket = tickets[position];
        position += 1;
        return ticket;
    }

    public int getPosition() {
        return this.position;
    }

}
