package third;

public class Operation implements Minus,Plus,Div,Mult {
    private float myNumber;

    public Operation(float myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void div(float number) {
      if(number!=0)
       myNumber=(int)(myNumber/number);

    }

    @Override
    public void minus(float number) {
        myNumber = (int)(myNumber-number);
    }

    @Override
    public void mult(float number) {
    myNumber=(int)(myNumber*number);

    }

    @Override
    public void plus(float number) {
        myNumber=(int)(myNumber+number);
    }

    public float getNumber() {
        return myNumber;
    }
}
