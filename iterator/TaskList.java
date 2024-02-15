package iterator;

import java.util.Iterator;

public class TaskList {
    
    private Ticket[] tickets;
    private int count;
    private String name;

    public TaskList(String name) {
        this.tickets = new Ticket[100];
        this.name = name;
        this.count = 0;
    }

    public void addTicket(String name, String teamMember, int difficulty) {
        Ticket ticket = new Ticket(name, teamMember, difficulty);
        addTicket(ticket);
    } 
    
    /**
     * When you get a ticket that already exists aka move from todo to doing
     * @param ticket
     */
    public void addTicket(Ticket ticket) {
        this.tickets[count] = ticket;
        count++;
    }

    /**
     * returns the requested ticket and removes it from the list
     * @param name
     * @return
     */
    public Ticket getTicket(String name) {
        TaskListIterator ticketIterator = createIterator();
        
        do {
            Ticket temp = ticketIterator.next();
            if (temp.getName().equalsIgnoreCase(name)) {
                
                return temp;
            } 
        } while (ticketIterator.hasNext());
        return null;
    }

    public TaskListIterator createIterator() {
        return new TaskListIterator(tickets);
    }

    /**
     * iterates over all of the tickets and gets each toString for every ticket
     * combine each one into one toString
     */
    public String toString() {
        return " ";
    }
}
