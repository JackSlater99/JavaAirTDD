import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilotList;
    private ArrayList<CabinCrewMember> crewList;
    private ArrayList<Passenger> passengerList;
    private PlaneType planeType;
    private String flightNumber;
    private String destination;
    private String airport;
    private String departureTime;
    private int seatsRemaining;

    public Flight(PlaneType planeType, String flightNumber, String destination, String airport, String departureTime) {
        this.pilotList = new ArrayList<>();
        this.crewList = new ArrayList<>();
        this.passengerList = new ArrayList<>();
        this.planeType = planeType;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.airport = airport;
        this.departureTime = departureTime;
        this.seatsRemaining = planeType.getCapacity();
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getAirport() {
        return airport;
    }

    public String getDepartureTime() {
        return departureTime;
    }


    public int getPilotCount() {
        return pilotList.size();
    }

    public int getCrewCount() {
        return crewList.size();
    }

    public int getPassengerCount() {
        return passengerList.size();
    }

    public void addPilot(Pilot newPilot) {
        pilotList.add(newPilot);
    }

    public void removePilot(Pilot removePilot) {
        pilotList.remove(removePilot);
    }

    public void addCrew(CabinCrewMember newCabinCrewMember) {
        crewList.add(newCabinCrewMember);
    }

    public void removeCrew(CabinCrewMember removeCabinCrewMember) {
        crewList.remove(removeCabinCrewMember);
    }

    public int getSeatsRemaining() {
        return seatsRemaining;
    }

    public void addPassenger(Passenger newPassenger) {
        if (seatsRemaining > 0) {
            seatsRemaining -= 1;
            passengerList.add(newPassenger);
        }
    }

    public void removePassenger(Passenger removePassenger) {
        passengerList.remove(removePassenger);
        seatsRemaining += 1;
    }
}
