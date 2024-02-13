package iterator;

public class TaskList {
    
    private Ticket[] tickets;
    private int count;
    private String name;

    public TaskList(String name) {
        this.name = name;
        this.count = 0;
    }

    public void addTicket(String name, String teamMember, int difficulty) {
        Ticket ticket = new Ticket(name, teamMember, difficulty);
        addTicket(ticket);
    } 
    
    public void addTicket(Ticket ticket) {
        this.tickets[count] = ticket;
        count++;
    }

    public Ticket getTicket(String name) {

    }

    public TaskListIterator createIterator() {

    }

    public String toString() {
        return " ";
    }
}
