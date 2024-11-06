public class TaskBuilder {
    private String name;
    private String priority;
    private String deadline;

    public TaskBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public TaskBuilder setPriority(String priority) {
        this.priority = priority;
        return this;
    }

    public TaskBuilder setDeadline(String deadline) {
        this.deadline = deadline;
        return this;
    }
    //getters

    public String getName() {
        return name;
    }

    public String getPriority() {
        return priority;
    }

    public String getDeadline() {
        return deadline;
    }

    public Task build() {
        return new Task(this);
    }
}
