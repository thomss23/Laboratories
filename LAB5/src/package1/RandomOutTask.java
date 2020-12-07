package package1;

public class RandomOutTask implements Task {
    private double number;

    public RandomOutTask() {
        this.number = (int) (Math.random() * 100);
    }

    @Override
    public void execute() {
        System.out.println(this.number);
    }
}
