package ru.infotecs;

public class FlightDistanceService {
    public double calculate(double a, double v) {

        double angleRadians = Math.toRadians(2 * a);
        double sinValue = Math.sin(angleRadians);

        double g = 9.8;

        double s = (v * v * sinValue) / g;

        return s;
    }
}
