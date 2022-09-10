package VehicleP;

import java.awt.Color;

public class Truck implements Vehicle {
    Color color;
    int axles;
    String VIN;
    int modelYear;

    double horsepower;
    boolean hasPlowPackage;

    public Truck(Color color, int axles, String VIN, int modelYear, double horsepower, boolean hasPlowPackage) {
        this.color = color;
        this.axles = axles;
        this.VIN = VIN;
        this.modelYear = modelYear;
        this.horsepower = horsepower;
        this.hasPlowPackage = hasPlowPackage;
    }

    public Color color() {
        return color;
    }
    public int axles() {
        return axles;
    }
    public String VIN() {
        return VIN;
    }
    public int modelYear() {
        return modelYear;
    }

    public double horsepower() {
        return horsepower;
    }
    public boolean hasPlowPackage() {
        return hasPlowPackage;
    }
}
