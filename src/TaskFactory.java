public class TaskFactory {
    public static AbstractTask createTask(String type, String name, String priority, String deadline) {
        if (type.equalsIgnoreCase("simple")) {
            return new SimpleTask(name, priority, deadline);
        } else if (type.equalsIgnoreCase("mid")) {
            return new MidTask(name, priority, deadline);
        } else if (type.equalsIgnoreCase("hard")) {
            return new HardTask(name, priority, deadline);
        }
        throw new IllegalArgumentException("Invalid task type: " + type);
    }
}
