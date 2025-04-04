package praktic.inheritance.transportation;

public class Vehicle {
    protected String nama;
    protected int capacity;
    protected String route;
    protected int currentPassengers;

    public Vehicle(String nama, int capacity, String route) {
        this.nama = nama;
        this.capacity = capacity;
        this.route = route;
        this.currentPassengers = 0;
    }

    public void startJourney() {
        System.out.println(nama + " memulai perjalanan di " + route);
    }

    public void endJourney() {
        System.out.println(nama + " mencapai tujuan akhir dan berhenti");
    }

    public void boardPassengers(int count) {
        if (currentPassengers + count > capacity) {
            System.out.println("Kapasitas penuh! Tidak dapat menaikkan " + count + " penumpang");
        } else {
            currentPassengers += count;
            System.out.println(count + " penumpang naik ke dalam " + nama);
        }
    }

    public void dropPassengers() {
        if (currentPassengers == 0) {
            System.out.println("Tidak ada cukup penumpang untuk turun");
        } else {
            System.out.println(currentPassengers + " penumpang turun dari " + nama);
            currentPassengers = 0;
        }
    }

    public int getCurrentPassengers() {
        return currentPassengers;
    }
}
