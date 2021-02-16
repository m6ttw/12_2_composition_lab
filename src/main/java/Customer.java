import jdk.jfr.internal.consumer.RecordingInput;

import java.util.ArrayList;

public class Customer {
    private double money;
    private ArrayList<Car> carCollection;

    public Customer(double money) {
        this.money = money;
        this.carCollection = new ArrayList<Car>();
    }

    public double getMoney() {
        return this.money;
    }

    public int getNumberOfOwnedCars() {
        return this.carCollection.size();
    }
}
