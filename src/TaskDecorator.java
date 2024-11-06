public abstract class TaskDecorator extends AbstractTask {
    protected AbstractTask task;

    public TaskDecorator(AbstractTask task) {
        super(task.getName(), task.getPriority(), task.getDeadline());
        this.task = task;
    }

    @Override
    public abstract void displayInfo();
}