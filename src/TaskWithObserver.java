import java.util.ArrayList;
import java.util.List;

public class TaskWithObserver extends AbstractTask implements Observable{
    private boolean isCompleted;
    private List<Observer> observers = new ArrayList<>();
    public TaskWithObserver(String name, String priority, String deadline){
        super(name, priority, deadline);
    }

    public void setCompleted(boolean completed) {
        this.isCompleted = completed;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(this.name, this.isCompleted);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Task name: " + name);
        System.out.println("Priority: " + priority);
        System.out.println("Deadline: " + deadline);
        System.out.println("Completed: " + (isCompleted ? "yes" : "no"));
    }
}
