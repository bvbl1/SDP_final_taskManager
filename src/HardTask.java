public class HardTask extends AbstractTask {
    public HardTask(String name, String priority, String deadline){
        super(name, priority, deadline);
    }

    @Override
    public void displayInfo() {
        System.out.println("Hard Task: " + name + ", Priority: " + priority + ", Deadline: " + deadline);
    }
}
