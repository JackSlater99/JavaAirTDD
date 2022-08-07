public class CabinCrewMember {

    private String name;
    private RankType rankType;

    public CabinCrewMember(String name, RankType rankType) {
        this.name = name;
        this.rankType = rankType;
    }

    public String getName() {
        return name;
    }

    public RankType getRankType() {
        return rankType;
    }

    public String announcement(String message){
        return message;
    }
}
