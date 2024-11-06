public class InProgressState implements TaskState {
    @Override
    public void displayStatus(String taskName) {
        System.out.println("Task '" + taskName + "' is in progress.");
    }
}