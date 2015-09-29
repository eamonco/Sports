
public class Tennis extends RacketSport {

    public enum CourtType
    {
        Grass,
        Hard,
        Clay
    }

    public boolean umpire;
    public CourtType courtType;
    public int noOfSets;

    public Tennis (boolean umpire, CourtType courtType, int noOfSets)
    {
        this.umpire = umpire;
        this.courtType = courtType;
        this.noOfSets = noOfSets;

    }

    public String getPitchSize()
    {
        return "50m x 20m";
    }

    public String getTypeOfRacket()
    {
        return "Tennis Racket Racket";
    }

    public String getSportName()
    {
        return "Tennis";
    }
}
