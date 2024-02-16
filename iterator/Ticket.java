package iterator;
/**
 * This class defines a ticket of a given task
 * @author Ian Kruger
 */
public class Ticket {

    private String name;
    private String teamMember;
    private int difficulty;

    public Ticket(String name, String teamMember, int difficulty) {
        this.name = name;
        this.teamMember = teamMember;
        this.difficulty = difficulty;
    }

    /**
     * This function is used to get the name of the ticket for identification
     * @return a string of the name
     */
    public String getName() {
        return this.name;
    }

    public String toString() {
        return "- "+name+"("+difficulty+") - "+teamMember;
    }
    
}
