import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        System.out.println();
        System.out.println("Tennis match details:");
        Tennis tennis1 = new Tennis (true, Tennis.CourtType.Grass, 5);
        System.out.println("Type of court: " + tennis1.courtType + " " + "\n" + "Umpire? " + tennis1.umpire + " " + "\n" + "Number of sets: " +tennis1.noOfSets);

        System.out.println();
        System.out.println("Football match details");
        Football footie1 = new Football("me", "you", 90, 1827272);
        System.out.println("Home Team: " + footie1.homeTeam + "\n" + "Away Team: " + footie1.awayTeam + "\n" + "Length of match: " + footie1.noOfMinutes + "mins" + "\n" + "No. Of Tickets Sold: " + footie1.noOfTicketsSold);

        System.out.println();
        System.out.println("Tennis Details");
        System.out.println("Size of Pitch: " + tennis1.getPitchSize());
        System.out.println("Type of Racket used: " + tennis1.getTypeOfRacket());

        System.out.println();
        System.out.println("Football Details");
        System.out.println("Size of Pitch: " + footie1.getPitchSize());
        System.out.println("Type of ball used: " + footie1.getTypeOfBall());


        ArrayList<Sports> SportsBucket = new ArrayList<Sports>();

        SportsBucket.add(tennis1);
        SportsBucket.add(footie1);

        System.out.println();
        System.out.println("List of sports and the size of their pitch.");
        for (Sports sport : SportsBucket)
        {

            System.out.println(sport.getSportName() + " has this size of pitch: " + sport.getPitchSize());
        }
    }
}
