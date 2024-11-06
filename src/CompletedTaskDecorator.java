public class CompletedTaskDecorator extends TaskDecorator{
    private boolean isCompleted;

    public CompletedTaskDecorator(AbstractTask task, boolean isCompleted) {
        super(task);
        this.isCompleted = isCompleted;
    }

    @Override
    public void displayInfo() {
        task.displayInfo();
        if(isCompleted){
            System.out.println("Completed: yes");
        }else{
            System.out.println("Completed: no");
        }
    }
}
