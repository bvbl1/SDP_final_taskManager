public class TaskObserver implements Observer {
    @Override
    public void update(String taskName, boolean isCompleted) {
        System.out.println("Task '" + taskName + "' completed status: " + (isCompleted ? "yes" : "no"));
    }
}