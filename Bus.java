package praktic.inheritance.transportation;

public class Bus extends Vehicle {
    static final int FARE_PER_STOP = 2000;

    public Bus(String nama, int capacity, String route) {
        super(nama, capacity, route);
    }

    public void calculateFare(int stops) {
        int fare = getCurrentPassengers() * FARE_PER_STOP * stops;
        System.out.println("Total penumpang: " + getCurrentPassengers());
        System.out.println("Total pemberhentian: " + stops);
        System.out.println("Tarif per halte: Rp " + FARE_PER_STOP);
        System.out.println("Total tarif perjalanan bus: Rp " + fare);
    }
}
