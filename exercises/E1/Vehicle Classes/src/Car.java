import java.awt.Color;

public class Car implements Vehicle {
    Color color;
    int axles;
    String VIN;
    int modelYear;

    double mileage;
    int cupholders;

    public Car(Color color, int axles, String VIN, int modelYear, double mileage, int cupholders) {
        this.color = color;
        this.axles = axles;
        this.VIN = VIN;
        this.modelYear = modelYear;
        this.mileage = mileage;
        this.cupholders = cupholders;
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

    public double mileage() {
        return mileage;
    }
    public int cupholders() {
        return cupholders;
    }
}
