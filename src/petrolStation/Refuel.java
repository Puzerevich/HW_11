package petrolStation;

public class Refuel implements Runnable{
    private final double order;
    private final PetrolStation petrolStation;

    public Refuel(double order, PetrolStation petrolStation) {
        this.order = order;
        this.petrolStation = petrolStation;
    }

    @Override
    public void run() {
        petrolStation.doRefuel(order);
    }
}