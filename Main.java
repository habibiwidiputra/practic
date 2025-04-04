package praktic.inheritance.mains;

import praktic.inheritance.transportation.Bus;
import praktic.inheritance.transportation.GoCar;
import praktic.inheritance.transportation.MRT;

public class Main {
    public static void main(String[] args) {
        // BUS
        Bus bus = new Bus("Bus TransJakarta", 30, "Terminal A - Terminal B");
        bus.startJourney();
        bus.boardPassengers(30);
        bus.boardPassengers(100); // Kapasitas penuh
        System.out.println("Total penumpang: " + bus.getCurrentPassengers());
        bus.calculateFare(5);
        bus.endJourney();
        bus.dropPassengers();
        bus.dropPassengers(); // Tidak ada cukup penumpang untuk turun

        System.out.println("\n--------------------------------\n");

        // MRT
        MRT mrt = new MRT("MRT Jakarta", 200, "Stasiun Kota - Stasiun Pusat");
        mrt.startJourney();
        mrt.boardPassengers(200);
        mrt.boardPassengers(50); // Kapasitas penuh
        System.out.println("Total penumpang: " + mrt.getCurrentPassengers());
        mrt.calculateFare();
        mrt.endJourney();
        mrt.dropPassengers();
        mrt.dropPassengers(); // Tidak ada cukup penumpang untuk turun

        System.out.println("\n--------------------------------\n");

        // GOCAR
        GoCar gocar = new GoCar("GoCar", 4, "Bandara - Hotel");
        gocar.startJourney();
        gocar.boardPassengers(4);
        gocar.boardPassengers(5); // Kapasitas penuh
        System.out.println("Total penumpang: " + gocar.getCurrentPassengers());
        gocar.calculateFare(12);
        gocar.endJourney();
        gocar.dropPassengers();
        gocar.dropPassengers(); // Tidak ada cukup penumpang untuk turun
    }
}
