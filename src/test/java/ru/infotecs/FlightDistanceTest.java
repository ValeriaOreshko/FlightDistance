package ru.infotecs;

public class FlightDistanceTest {
    public static void main(String[] args) {
        FlightDistanceService service = new FlightDistanceService();

        double a = 45;
        double v = 6;

        double s = service.calculate(a,v);

        System.out.println(s);
    }
}
