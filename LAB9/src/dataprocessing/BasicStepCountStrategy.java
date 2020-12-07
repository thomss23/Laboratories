package dataprocessing;


import storage.SensorData;

import java.util.ArrayList;

public class BasicStepCountStrategy implements StepCountStrategy {

    private ArrayList<SensorData> list;

    public BasicStepCountStrategy(ArrayList<SensorData> list) {
        this.list = list;
    }

    @Override
    public int getTotalSteps() {
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum=sum+list.get(i).getStepsCount();
        }
        return sum;
    }

    @Override
    public String getStrategyDescription() {
        return "basic";
    }
}
