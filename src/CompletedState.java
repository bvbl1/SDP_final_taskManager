public class CompletedState implements TaskState {
    @Override
    public void displayStatus(String taskName) {
        System.out.println("Task '" + taskName + "' is Completed.");
    }
}