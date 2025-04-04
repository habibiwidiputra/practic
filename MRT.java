package praktic.inheritance.transportation;

public class MRT extends Vehicle {
    static final int FARE_PER_PASSENGER = 15000;

    public MRT(String nama, int capacity, String route) {
        super(nama, capacity, route);
    }

    public void calculateFare() {
        int fare = getCurrentPassengers() * FARE_PER_PASSENGER;
        System.out.println("Total penumpang: " + getCurrentPassengers());
        System.out.println("Tarif tetap per penumpang: Rp " + FARE_PER_PASSENGER);
        System.out.println("Total tarif perjalanan MRT: Rp " + fare);
    }
}
