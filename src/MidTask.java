public class MidTask extends AbstractTask {
    public MidTask(String name, String priority, String deadline){
        super(name, priority, deadline);
    }

    @Override
    public void displayInfo() {
        System.out.println("Medium Task: " + name + ", Priority: " + priority + ", Deadline: " + deadline);
    }
}
