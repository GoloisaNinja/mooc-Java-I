
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {

        ArrayList<Team> teams = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();

        try {
            Scanner reader = new Scanner(Paths.get(file));
            while (reader.hasNextLine()) {
                // read file data by line
                String line = reader.nextLine();
                String[] data = line.split(",");
                // four part data - home team / away team / home score / away score
                String homeTeamName = data[0];
                String opposingTeamName = data[1];
                int homeScore = Integer.parseInt(data[2]);
                int opposingScore = Integer.parseInt(data[3]);
                // does team exist? if not build it
                int homeTeamIndex = getTeamIndex(teams, homeTeamName);
                int opposingTeamIndex = getTeamIndex(teams, opposingTeamName);
                if (homeTeamIndex == -1) {
                    homeTeamIndex = createTeamAndReturnIndex(teams, homeTeamName);
                }
                if (opposingTeamIndex == -1) {
                    opposingTeamIndex = createTeamAndReturnIndex(teams, opposingTeamName);
                }

                Team homeTeam = getTeam(teams, homeTeamIndex);
                Team opposingTeam = getTeam(teams, opposingTeamIndex);
                homeTeam.recordGame(homeScore, opposingScore, opposingTeam);
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Team:");
        String teamToSearch = scan.nextLine()
                                  .trim();
        int teamIndex = getTeamIndex(teams, teamToSearch);
        if (teamIndex != -1) {
            Team searchedTeam = getTeam(teams, teamIndex);
            System.out.println(searchedTeam);
        } else {
            Team emptyTeam = new Team(teamToSearch);
            System.out.println(emptyTeam);
        }
    }

    public static int createTeamAndReturnIndex(ArrayList<Team> teams, String teamName) {
        Team newTeam = new Team(teamName);
        teams.add(newTeam);
        return teams.indexOf(newTeam);
    }

    public static int getTeamIndex(ArrayList<Team> teams, String teamName) {
        for (int i = 0; i < teams.size(); i++) {
            if (teams.get(i)
                     .getName()
                     .equals(teamName)) {
                return i;
            }
        }
        return -1;
    }

    public static Team getTeam(ArrayList<Team> teams, int index) {
        return teams.get(index);
    }

}
