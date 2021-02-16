import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car car;

    @Before
    public void before(){
        car = new Car(EngineType.HYBRID, 2000.00, "green", "Michelin");
    }

    @Test
    public void hasEngineType(){
        assertEquals(EngineType.HYBRID, car.getEngineType());
    }

    @Test
    public void hasPrice(){
        assertEquals(2000.00, car.getPrice(), 0.0);
    }

    @Test
    public void hasColour(){
        assertEquals("green", car.getColour());
    }

    @Test
    public void hasTyres(){
        assertEquals("Michelin", car.getTyres());
    }
}
