public class TaskFacade {
    // method to create task with factory pattern
    public AbstractTask createTask(String type, String name, String priority, String deadline) {
        return TaskFactory.createTask(type, name, priority, deadline);
    }

    // method to create task with builder pattern
    public Task buildTask(String name, String priority, String deadline) {
        TaskBuilder builder = new TaskBuilder();
        return builder.setName(name)
                .setPriority(priority)
                .setDeadline(deadline)
                .build();
    }

    // Method for wrapping a task in a completion decorator
    public AbstractTask markAsCompleted(AbstractTask task, boolean isCompleted) {
        return new CompletedTaskDecorator(task, isCompleted);
    }

    // method to display information about task
    public void displayTaskInfo(AbstractTask task) {
        task.displayInfo();
    }
}
