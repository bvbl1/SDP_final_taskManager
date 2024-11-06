public class Main {
    public static void main(String[] args) {
        TaskFacade taskFacade = new TaskFacade();

        // creating task with builder
        Task task1 = taskFacade.buildTask("project report", "High", "8 November");
        task1.displayTask();
        System.out.println();

        // creating task with factory
        AbstractTask simpleTask = taskFacade.createTask("simple", "home work", "high", "10 October");
        AbstractTask hardTask = taskFacade.createTask("hard", "wash dishes", "medium", "7 October");
        taskFacade.displayTaskInfo(simpleTask);
        taskFacade.displayTaskInfo(hardTask);
        System.out.println();

        // using decorator to mark the task as completed
        AbstractTask completedSimpleTask = taskFacade.markAsCompleted(simpleTask, true);
        taskFacade.displayTaskInfo(completedSimpleTask);
        System.out.println();

        //observer
        TaskWithObserver observedTask = new TaskWithObserver("project report", "High", "8 November");
        TaskObserver observer = new TaskObserver();
        observedTask.addObserver(observer);
        observedTask.setCompleted(true);
        System.out.println();

        //state pattern
        // Initially the task is in the "Pending" state.
        simpleTask.displayState();

        // Switch the task to the "Completed" state
        simpleTask.setState(new CompletedState());
        simpleTask.displayState();
    }
}
