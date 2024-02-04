public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public void markAsDone() {
        this.isDone = true;
    }

    public void markNotDone() {
        this.isDone = false;
    }

    public void showTask() {
        System.out.println("[" + (isDone ? "X" : " ") + "] " + this.description);
    }
}
