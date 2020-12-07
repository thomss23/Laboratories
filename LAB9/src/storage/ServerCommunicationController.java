package storage;

import communication.ServerMessage;
import main.Utils;

import java.util.Observable;
import java.util.Observer;

public class ServerCommunicationController implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        DataRepository drepo = (DataRepository) o;

//        for(SensorData data : drepo.getData()){
//            ServerMessage serverMessage = new ServerMessage(data.getStepsCount(), Utils.getClientId(),data.getTimestamp());
//            System.out.println("Sending to server: ");
//            System.out.println(serverMessage);
//
//        }

        ServerMessage serverMessage = new ServerMessage(drepo.getData().get(drepo.getData().size()-1).getStepsCount(),
                Utils.getClientId(),drepo.getData().get(drepo.getData().size()-1).getTimestamp());

        System.out.println("Sending to server: ");
        System.out.println(serverMessage);



    }
}
