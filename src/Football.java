
public class Football extends BallSport {

    public String homeTeam;
    public String awayTeam;
    public float noOfMinutes;
    public int noOfTicketsSold;

    public Football (String homeTeam, String awayTeam, float noOfMinutes, int noOfTicketsSold)
    {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.noOfMinutes = noOfMinutes;
        this.noOfTicketsSold = noOfTicketsSold;

    }

    public String getPitchSize()
    {
        return "59m x 255m";

    }

    public String getTypeOfBall()
    {
        return "Football ball ball";
    }

    public String getSportName()
    {
        return "Football";
    }
}
