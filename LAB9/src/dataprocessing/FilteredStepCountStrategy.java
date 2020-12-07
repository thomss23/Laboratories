package dataprocessing;

import storage.SensorData;

import java.util.ArrayList;

public class FilteredStepCountStrategy implements StepCountStrategy {

    private ArrayList<SensorData> list;

    public FilteredStepCountStrategy(ArrayList<SensorData> list) {
        this.list = list;
    }

    @Override
    public int getTotalSteps() {
        int sum=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getStepsCount()>=0 && list.get(i).getStepsCount()<1000)
                sum=sum+list.get(i).getStepsCount();
        }
        return sum;
    }

    @Override
    public String getStrategyDescription() {
        return "filtered";
    }
}
