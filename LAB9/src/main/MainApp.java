package main;

import dataprocessing.StepCountStrategy;
import dataprocessing.StepCountStrategyFactory;
import storage.*;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) throws Exception {

        System.out.println("Choose a strategy: type 'basic or 'filtered");
        Scanner scanner = new Scanner(System.in);
        String strategyType = scanner.next();
        scanner.close();

        DataRepository dataRepository = new DataRepository();
        // TODO: use the StepCountStrategyFactory to create a strategy

        StepCountStrategy stepCountStrategyFactory = StepCountStrategyFactory.createStrategy(strategyType,dataRepository);




        // TODO: add observers to the dataRepository
        // don't forget to provide the strategy to the DataAggregator observer

        ConsoleLogger consoleLogger = new ConsoleLogger();
        ServerCommunicationController serverCommunicationController = new ServerCommunicationController();


        DataAggregator dataAggregator = new DataAggregator(stepCountStrategyFactory);

        dataRepository.addObserver(consoleLogger);
        dataRepository.addObserver(serverCommunicationController);
        dataRepository.addObserver(dataAggregator);

        long baseTimestamp = System.currentTimeMillis();

        dataRepository.addData(new SensorData(10, baseTimestamp + 1));
        System.out.println();

        dataRepository.addData(new SensorData(20, baseTimestamp + 2));
        System.out.println();

        dataRepository.addData(new SensorData(30, baseTimestamp + 3));
        System.out.println();

        // TODO: after the first successful run, change this to baseTimestamp + 40000 and check the result
        dataRepository.addData(new SensorData(4000, baseTimestamp + 4));
        System.out.println();

        dataRepository.addData(new SensorData(50, baseTimestamp + 5));
        System.out.println();

        dataRepository.addData(new SensorData(-100, baseTimestamp + 6));
        System.out.println();

        dataRepository.addData(new SensorData(500, baseTimestamp + 600));
        System.out.println();

    }
}
