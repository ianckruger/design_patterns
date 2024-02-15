package iterator;

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

    public void addTicket(String name, String teamMember, int difficulty) {
        this.todo.addTicket(name, teamMember, difficulty);
    }

    public boolean startTicket(String name) {
        Ticket temp = this.todo.getTicket(name);
        if (temp == null) {
            return false;
        }
        this.doing.addTicket(temp);
        return true;
    }

    public boolean finishTicket(String name) {
        Ticket temp = this.doing.getTicket(name);
        if (temp == null) {
            return false;
        }
        this.done.addTicket(temp);
        return true;
    }

    public String toString() {
        String ret = "";
        ret += "***** Recipe Application******\n";
        ret += "ToDo:\n"+todo.toString()+"\n";
        ret += "Doing:\n"+doing.toString()+"\n";
        ret += "Done:\n"+done.toString();

        return ret;
    }
    
}
