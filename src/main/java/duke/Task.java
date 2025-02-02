package duke;

/**
 * A Task class that represents a task inputted by user.
 */
public abstract class Task {

    /**
     * Constructor for the Task Class.
     *
     * @param description Description of task.
     */
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    /**
     * Checks if a task is done, returns "X" if done and " " if undone.
     *
     * @return A String that corresponds to the status of the task.
     */
    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    /**
     * Marks a task as done.
     */
    public void markAsDone() {
        this.isDone = true;
    }

    /**
     * Marks a task as undone.
     */
    public void markAsUnDone() {
        this.isDone = false;
    }

    public String getDescription() {
        return this.description;
    }

    public String toString() {
        return "[" + this.getStatusIcon() + "] " + this.getDescription();
    }

    public abstract String saveString();
}
