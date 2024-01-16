/**
 * This interface defines the base behaviors of the classes observing the subjects
 * @author Ian Kruger
 */
public interface Observer {

    public void update();
    public String getLog();
}
