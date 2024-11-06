public class PendingState implements TaskState {
    @Override
    public void displayStatus(String taskName) {
        System.out.println("Task '" + taskName + "' is in Pending state.");
    }
}