package dataprocessing;

import storage.DataRepository;

public class StepCountStrategyFactory {

    public static StepCountStrategy createStrategy(String strategyType, DataRepository dataRepository) throws Exception {
        switch (strategyType){
            case "basic":
                return new BasicStepCountStrategy(dataRepository.getData());
            case "filtered":
                return  new FilteredStepCountStrategy(dataRepository.getData());
            default:
                throw new Exception("Invalid Count Type");
        }
    }
}
