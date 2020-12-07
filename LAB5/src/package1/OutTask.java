package package1;

public class OutTask implements Task {
    private String task;
    public OutTask(String task) {
        this.task = task;
    }

    @Override
    public void execute() {
        System.out.println(task);
    }
}
