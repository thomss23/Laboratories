package storage;

import java.util.Observable;
import java.util.Observer;

public class ConsoleLogger implements Observer {
    @Override
    public void update(Observable o, Object arg) {

        DataRepository drepo = (DataRepository) o;

//        System.out.println("New Changes: ");
//        for(SensorData data : drepo.getData()){
//            System.out.println(data);
//        }


        System.out.println("New Changes: ");
        System.out.println(drepo.getData().get(drepo.getData().size()-1));


    }
}
