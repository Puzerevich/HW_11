import petrolStation.PetrolStation;
import petrolStation.Refuel;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {

    public static void main(String[] args) {
        PetrolStation petrolStation = new PetrolStation(50.0);

        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.execute(new Refuel(1.0, petrolStation));
        executor.execute(new Refuel(2.0, petrolStation));
        executor.execute(new Refuel(3.0, petrolStation));
        executor.execute(new Refuel(4.0, petrolStation));
        executor.execute(new Refuel(5.0, petrolStation));

        executor.shutdown();
    }
}
