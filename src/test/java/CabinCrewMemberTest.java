import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("John", RankType.CAPTAIN);
    }

    @Test
    public void hasName(){
        assertEquals("John", cabinCrewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(RankType.CAPTAIN, cabinCrewMember.getRankType());
    }
}
