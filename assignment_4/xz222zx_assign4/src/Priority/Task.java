package Priority;

public interface Task {
    void setPriority(int n);
    int getPriority();
    void setDescription(String s);
    String getDescription();
    void checkPriority(int n);
    String get();
}
