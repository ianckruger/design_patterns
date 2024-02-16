package iterator;
/**
 * This class defines the SCRUM board of project that uses three different task lists and one 
 * iterator to move tickets along with their completion status
 * @author Ian Kruger
 */
public class SCRUMBoard {

    private String projectName;
    private TaskList todo;
    private TaskList doing;
    private TaskList done;

    public SCRUMBoard(String projectName) {
        this.projectName = projectName;
        this.todo = new TaskList(projectName);
        this.doing = new TaskList(projectName);
        this.done = new TaskList(projectName);
    }

    /**
     * this function adds a new ticket to the to do task list based on given data
     * @param name the name of the task
     * @param teamMember who submitted/should complete it
     * @param difficulty priority
     */
    public void addTicket(String name, String teamMember, int difficulty) {
        this.todo.addTicket(name, teamMember, difficulty);
    }

    /**
     * this function takes a waiting task and starts it, moving it from one list to the other
     * @param name the name of the ticket for searching
     * @return a boolean of if it exists
     */
    public boolean startTicket(String name) {
        Ticket temp = this.todo.getTicket(name);
        if (temp == null) {
            return false;
        }
        this.doing.addTicket(temp);
        return true;
    }

    /**
     * this function takes an in process tasks and marks it as complete, moving it from one list to the other
     * @param name the name of the ticket for searching
     * @return a boolean of if it exists
     */
    public boolean finishTicket(String name) {
        Ticket temp = this.doing.getTicket(name);
        if (temp == null) {
            return false;
        }
        this.done.addTicket(temp);
        return true;
    }

    /**
     * this toString takes the toStrings of all the lists and formats them into one.
     * @return a string of all tasks across the scrum board
     */
    public String toString() {
        String ret = "";
        ret += "***** Recipe Application******\n";
        ret += "ToDo:\n"+todo.toString()+"\n";
        ret += "Doing:\n"+doing.toString()+"\n";
        ret += "Done:\n"+done.toString();

        return ret;
    }
    
}
