import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;

    @Before
    public void before(){
        flight = new Flight(PlaneType.BOEING747,"ABC123","London", "Glasgow", "15:00");
    }

    @Test
    public void hasPlane() {
        assertEquals(PlaneType.BOEING747, flight.getPlaneType());
    }

    @Test
    public void hasWeight() {
        assertEquals(PlaneType.BOEING747.getWeight(), flight.getPlaneType().getWeight());
    }

    @Test
    public void hasCapacity() {
        assertEquals(PlaneType.BOEING747.getCapacity(), flight.getPlaneType().getCapacity());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("ABC123", flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("London", flight.getDestination());
    }

    @Test
    public void hasAirport(){
        assertEquals("Glasgow", flight.getAirport());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("15:00", flight.getDepartureTime());
    }

    @Test
    public void hasEmptyPilotList(){
        assertEquals(0, flight.getPilotCount());
    }

    @Test
    public void hasEmptyCrewList(){
        assertEquals(0, flight.getCrewCount());
    }

    @Test
    public void hasEmptyPassengerList(){
        assertEquals(0, flight.getPassengerCount());
    }

    @Test
    public void canAddPilots(){
        Pilot pilot = new Pilot("John", RankType.CAPTAIN, "123ABC");
        flight.addPilot(pilot);
        assertEquals(1, flight.getPilotCount());
    }

    @Test
    public void canRemovePilots(){
        Pilot pilot = new Pilot("John", RankType.CAPTAIN, "123ABC");
        flight.addPilot(pilot);
        flight.removePilot(pilot);
        assertEquals(0, flight.getPilotCount());
    }

    @Test
    public void canAddCrew(){
        CabinCrewMember cabinCrewMember = new CabinCrewMember("James", RankType.FLIGHT_ATTENDANT);
        flight.addCrew(cabinCrewMember);
        assertEquals(1, flight.getCrewCount());
    }

    @Test
    public void canRemoveCrew(){
        CabinCrewMember cabinCrewMember = new CabinCrewMember("James", RankType.FLIGHT_ATTENDANT);
        flight.addCrew(cabinCrewMember);
        flight.removeCrew(cabinCrewMember);
        assertEquals(0, flight.getCrewCount());
    }

    @Test
    public void hasSeats(){
        assertEquals(3, flight.getSeatsRemaining());
    }

    @Test
    public void canAddPassenger(){
        Passenger passenger = new Passenger("Jack", 2);
        flight.addPassenger(passenger);
        assertEquals(1, flight.getPassengerCount());
    }

    @Test
    public void canRemovePassenger(){
        Passenger passenger = new Passenger("Jack", 2);
        flight.addPassenger(passenger);
        flight.removePassenger(passenger);
        assertEquals(0, flight.getPassengerCount());
    }

    @Test
    public void cantAddPassengerIfNoSeats(){
        Passenger passenger = new Passenger("Jack", 2);
        Passenger passenger1 = new Passenger("James", 3);
        Passenger passenger2 = new Passenger("Alan", 1);
        Passenger passenger3 = new Passenger("Andrew", 1);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        assertEquals(3, flight.getPassengerCount());
    }

    @Test
    public void pilotCanFlyPlane() {
        Pilot pilot = new Pilot("John", RankType.CAPTAIN, "123ABC");
        flight.addPilot(pilot);
        assertEquals("The plane is in the air", pilot.announcement("The plane is in the air"));
    }

    @Test
    public void cabingCrewCanMakeAnnouncement() {
        CabinCrewMember cabinCrewMember = new CabinCrewMember("James", RankType.FLIGHT_ATTENDANT);
        flight.addCrew(cabinCrewMember);
        assertEquals("Hello", cabinCrewMember.announcement("Hello"));
    }
}
