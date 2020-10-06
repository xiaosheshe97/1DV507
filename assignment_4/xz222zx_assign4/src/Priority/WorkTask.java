package Priority;

public class WorkTask implements Task{
    private int priority;
    private String description;

    public WorkTask() {
    }

    public WorkTask(int priority, String description) {
        checkPriority(priority);
        this.priority = priority;
        this.description = description;
    }

    @Override
    public void setPriority(int n) {
        checkPriority(n);
        priority = n;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public void setDescription(String s) {
        description = s;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void checkPriority(int n) {
        if (n <= 0)
            throw new IllegalArgumentException("The priority should be positive number");
    }

    @Override
    public String get(){
        return priority+"."+description;
    }
}
