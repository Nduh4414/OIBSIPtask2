import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TrainManager {
    String name;
    int number;
    String trainClass;

    public TrainManager(String name, int number, String trainClass) {
        this.name = name;
        this.number = number;
        this.trainClass = trainClass;
    }

   
}

class ReservationSystem {
   ArrayList<TrainManager> trains = new ArrayList<>();
    Map<Integer, DataBase> bookings = new HashMap<>();
    Random random = new Random();

    public void addTrain(String name, int number, String trainClass) {
        trains.add(new TrainManager(name, number, trainClass));
    }

    public void addPopularTrains() {
        addTrain("Metro rail-midclass", 10, "Passenger");
        addTrain("Durban rail-Firstclass", 20, "Passenger");
        addTrain("Gautrain-midclass", 30, "Passenger");
        addTrain("Oasis rail-Firstclass", 40, "Passenger");
        addTrain("Sandton rails-Firstclass", 50, "Passenger");
    }

    public TrainManager[] getRandomTrains(int n) {
        TrainManager[] randomTrains = new TrainManager[n];
        for (int i = 0; i < n; i++) {
            randomTrains[i] = trains.get(random.nextInt(trains.size()));
        }
        return randomTrains;
    }

    public int makeBooking(String username, TrainManager train) {
        int referenceNumber = random.nextInt(10000); 
        DataBase booking = new DataBase(username, train, referenceNumber);
        bookings.put(referenceNumber, booking);
        return referenceNumber; 
    }

    public void cancelBooking(int referenceNumber) {
        bookings.remove(referenceNumber);
    }

    public DataBase getBooking(int referenceNumber) {
        return bookings.get(referenceNumber);
    }

}
