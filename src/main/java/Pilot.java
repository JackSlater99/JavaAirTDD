public class Pilot extends CabinCrewMember{

    private String licenseNumber;

    public Pilot(String name, RankType rankType, String licenseNumber) {
        super(name, rankType);
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String announcement(String message){
        return message;
    }
}
