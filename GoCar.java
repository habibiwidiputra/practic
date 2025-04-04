package praktic.inheritance.transportation;

public class GoCar extends Vehicle {
    static final int FARE_PER_KM = 6000;

    public GoCar(String nama, int capacity, String route) {
        super(nama, capacity, route);
    }

    public void calculateFare(int distance) {
        int fare = getCurrentPassengers() * distance * FARE_PER_KM;
        System.out.println("Total penumpang: " + getCurrentPassengers());
        System.out.println("Total jarak: " + distance + " km");
        System.out.println("Tarif per km: Rp " + FARE_PER_KM);
        System.out.println("Total tarif perjalanan GoCar: Rp " + fare);
    }
}
