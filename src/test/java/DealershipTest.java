import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
    Dealership dealership;
    Car car;

    @Before
    public void before(){
        dealership = new Dealership(100000.00);
        car = new Car(EngineType.DIESEl, 2000.00, "blue", "Continental");
    }

    @Test
    public void hasTill(){
        assertEquals(100000.00, dealership.getTill(), 0.0);
    }

    @Test
    public void carCollectionStartsEmpty(){
        assertEquals(0, dealership.getNumberOfCars());
    }

    @Test
    public void canAddCarToCollection(){
        dealership.addCar(car);
        assertEquals(1, dealership.getNumberOfCars());
    }
}
