package iterator;
/**
 * @author Ian Kruger
 * this class defines the task list object, designed to track, add, and remove tickets within
 * a given list through implemented Iterator methods.
 */

public class TaskList {
    
    private Ticket[] tickets;
    private int count;
    private String name;

    public TaskList(String name) {
        this.tickets = new Ticket[100];
        this.name = name;
        this.count = 0;
    }

    /**
     * create a ticket to add to a list
     * @param name the name of the task
     * @param teamMember the person making the ticket
     * @param difficulty how hard the ticket is
     */
    public void addTicket(String name, String teamMember, int difficulty) {
        if(tickets[99] != null) {
            System.out.println("Task list full. complete tasks first before adding more.");
            return;
        }
        Ticket ticket = new Ticket(name, teamMember, difficulty);
        this.tickets[count] = ticket;
        count++;
        // add error checking
    } 
    
    /**
     * an overload function
     * When you get a ticket that already exists aka move from todo to doing
     * @param ticket the ticket object of the task
     */
    public void addTicket(Ticket ticket) {
        this.tickets[count] = ticket;
        count++;
        // add error checking
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
                removeTicket(ticketIterator.getPosition());
                count --;
                return temp;
            } 
        } while (ticketIterator.hasNext());
        return null;
    }

    /**
     * this function creates a task list iterator to iterate through the list once
     * @return an Iterator for the class list tickets
     */
    public TaskListIterator createIterator() {
        return new TaskListIterator(tickets);
    }

    /**
     * iterates over all of the tickets and gets each toString for every ticket
     * combine each one into one toString
     * @return a string of all combined tasks
     */
    public String toString() {
        String ret = "";
        TaskListIterator ticketIterator = createIterator();
        while(ticketIterator.hasNext()) {
            Ticket temp = ticketIterator.next();
            ret += temp.toString() + "\n"; 
        }
        return ret;
    }

    /**
     * simplified function for removing a ticket so the code is shorter for the get ticket function
     * this function checks both the length of the list and the index position to prevent errors.
     * @param index location of the ticket
     */
    public void removeTicket(int index) {
        if (tickets.length >2) { 
            for (int i=index-1; i < this.count; i++) {
                tickets[i] = tickets[i+1];
            }
        }
        else if (index == 0 && tickets[index]!= null) {
            tickets[index] = tickets[index+1];
            tickets[index+1] = null;
        } else {
            tickets[index] = null;
        }
        
    }
}
