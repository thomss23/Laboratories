package package1;

public class CounterOutTask implements Task {
    private static int count=0;



    @Override
    public void execute() {
        count++;
        System.out.println("Contorul este la valoarea " + count);
    }
}
