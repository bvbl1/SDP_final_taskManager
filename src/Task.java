public class Task {
    private String name;
    private String priority;
    private String deadline;

    public Task(TaskBuilder taskBuilder){
        this.name = taskBuilder.getName();
        this.priority = taskBuilder.getPriority();
        this.deadline = taskBuilder.getDeadline();
    }

    public void displayTask(){
        System.out.println("name: " + name);
        System.out.println("priority: " + priority);
        System.out.println("deadline: " + deadline);
    }
}
