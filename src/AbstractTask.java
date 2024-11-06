public abstract class AbstractTask {
    protected String name;
    protected String priority;
    protected String deadline;
    private TaskState state;
    public AbstractTask(String name, String priority, String deadline){
        this.name = name;
        this.priority = priority;
        this.deadline = deadline;
        this.state = new PendingState();
    }
    public abstract void displayInfo();

    public String getName() {
        return name;
    }

    public String getPriority() {
        return priority;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setState(TaskState state) {
        this.state = state;
    }
    public void displayState() {
        state.displayStatus(this.name);
    }
}
