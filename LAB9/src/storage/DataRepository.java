package storage;


import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * Persists sensor data. Observable, its observers are notified when data is added it to.
 */
public class DataRepository extends Observable { // TODO make this an Observable

    private ArrayList<SensorData> data;

    public DataRepository() {
        data=new ArrayList<>();
    }

    public void addData(SensorData dataRecord){
        // TODO
        // store data (e.g. in a List)
        data.add(dataRecord);
        // notifiy observers
        setChanged();
        notifyObservers();
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        super.deleteObserver(o);
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers();
    }


    // TODO implement a method to get the stored data (needed by the strategies)

    public ArrayList<SensorData> getData() {
        return data;
    }
}


