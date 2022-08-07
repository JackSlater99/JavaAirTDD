import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("John", RankType.CAPTAIN, "ABC123");
    }

    @Test
    public void hasName(){
        assertEquals("John", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(RankType.CAPTAIN, pilot.getRankType());
    }

    @Test
    public void hasLicense() {
        assertEquals("ABC123", pilot.getLicenseNumber());
    }
}
