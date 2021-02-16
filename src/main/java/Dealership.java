import java.util.ArrayList;

public class Dealership {
    private double till;
    private ArrayList<Car> carCollection;

    public Dealership(double till) {
        this.till = till;
        this.carCollection = new ArrayList<Car>();
    }

    public double getTill() {
        return till;
    }

    public int getNumberOfCars() {
        return this.carCollection.size();
    }

    public void addCar(Car car) {
        this.carCollection.add(car);
    }
}
