public class SimpleTask extends AbstractTask {
    public SimpleTask(String name, String priority, String deadline){
        super(name, priority, deadline);
    }
    @Override
    public void displayInfo() {
        System.out.println("Simple Task: " + name + ", Priority: " + priority + ", Deadline: " + deadline);
    }
}
