public class Bowler {
    // Instance variables
    private String name;
    private int wickets;
    private int matches;
    private int ballsBowled;
    private int runsConceded;

    // Default constructor
    public Bowler() {
        this.name = "Unknown";
        this.wickets = 0;
        this.matches = 0;
        this.ballsBowled = 0;
        this.runsConceded = 0;
    }

    // Parameterized constructor
    public Bowler(String name, int wickets, int matches, int ballsBowled, int runsConceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.ballsBowled = ballsBowled;
        this.runsConceded = runsConceded;
    }

    // Method to compute and print bowling average
    public void computeBowlingAverage() {
        if (wickets <= 0 || runsConceded < 0 || ballsBowled < 0 || matches < 0 ||
            (matches == 0 && (runsConceded > 0 || ballsBowled > 0))) {
            System.out.println("Error");
            return;
        }
        double bowlingAverage = (double) runsConceded / wickets;
        System.out.printf("Name: %s bowling_avg=%.1f\n", name, bowlingAverage);
    }

    // Method to show statistics
    public void showStatistics() {
        if (wickets < 0 || runsConceded < 0 || ballsBowled < 0 || matches < 0 ||
            (matches == 0 && (runsConceded > 0 || ballsBowled > 0))) {
            System.out.println("Error");
            return;
        }
        System.out.printf("Name=%s wickets=%d matches=%d balls_bowled=%d runs_conceded=%d\n",
                          name, wickets, matches, ballsBowled, runsConceded);
    }

    // Method to compute and print strike rate
    public void computeStrikeRate() {
        if (wickets <= 0 || runsConceded < 0 || ballsBowled < 0 || matches < 0 ||
            (matches == 0 && (runsConceded > 0 || ballsBowled > 0))) {
            System.out.println("Error");
            return;
        }
        double strikeRate = (double) runsConceded / ballsBowled;
        System.out.printf("Name: %s Strike_rate=%.8f\n", name, strikeRate);
    }

    public static void main(String[] args) {
        // Create an object of Bowler with given values
        Bowler sachin = new Bowler("Sachin", 10, 5, 750, 463);
        
        // Call the methods to test
        sachin.computeBowlingAverage();
        sachin.showStatistics();
        sachin.computeStrikeRate();
    }
}

