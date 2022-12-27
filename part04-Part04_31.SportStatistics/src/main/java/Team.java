public class Team {
    private String name;
    private int totalGames;
    private int gamesWon;
    private int gamesLost;
    // Constructor
    public Team(String name) {
        this.name = name;
        this.totalGames = 0;
        this.gamesWon = 0;
        this.gamesLost = 0;
    }
    // Getter
    public String getName() {
        return this.name;
    }
    public void recordGame(int homeScore, int opposingScore) {
        if (homeScore > opposingScore) {
            this.gamesWon++;
        } else {
            this.gamesLost++;
        }
        this.totalGames++;
    }
    public void recordGame(int homeScore, int opposingScore, Team opposingTeam) {
        if (homeScore > opposingScore) {
            this.gamesWon++;
        } else {
            this.gamesLost++;
        }
        this.totalGames++;
        opposingTeam.recordGame(opposingScore, homeScore);
    }
    public String toString() {
        return "Games: " + this.totalGames + "\n" +
               "Wins: " + this.gamesWon + "\n" +
               "Losses: " + this.gamesLost;
    }
}
