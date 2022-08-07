import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class PassengerTest {
    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("John", 2);
    }

    @Test
    public void hasName() {
        assertEquals("John", passenger.getName());
    }

    @Test
    public void hasBags() {
        assertEquals(2, passenger.getBagCount());
    }
}
