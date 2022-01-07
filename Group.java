import java.util.*;

/**
 *  The class Group takes the group name to initializ a group object that also stores an array
 *  of matches and teams in the group.
 *
 * @author  Abhishek Gujjar
 * @version 11/21/2021
 */
public class Group
{
    private String groupName;
    private ArrayList<Team> teams;
    private ArrayList<Match> matches;

    /**
     * Constructor for objects of class Group
     */
    public Group(String name)
    {
        groupName = name;
        teams = new ArrayList<>();
        matches = new ArrayList<>();
    }
    
    /**
     * Accessor method to access the name of the group.
     */
    public String getName()
    {
        return groupName;
    }
    
    /**
     * Accessor method to access the array of teams in the group.
     */
    ArrayList<Team> getTeams()
    {
        return teams;
    }

    /**
     * Mutator method to add a team to the group.
     */
    public void addTeam(Team team)
    {
        teams.add(team);
    }
    
    /**
     * Mutator method that takes two different teams from the group and simulates a match 
     * between them, adds the the match to the group and also updates the the team goals/
     * points.
     */

    public void addMatch()
    {
        Random rand = new Random();
        Team team1 = teams.get(rand.nextInt(teams.size())); // selects a random team in group
        Team team2 = teams.get(rand.nextInt(teams.size())); // selects a random team in group
        
        // Keeps selecting a new team until the two teams are different.
        
        while(team1 != team2)
        {
            team2 = teams.get(rand.nextInt(teams.size()));
        }
        
        
        
        Match newMatch = new Match(team1 , team2); // creates a match instance between the the selected teams
        newMatch.updateGoals(); // Updates the goals of the teams after a match.
        newMatch.updatePoints(); // Updates the points of the teams after a match.
        
        matches.add(newMatch); // adds the match to the group
    }
    
    /**
     * Creates thirty random matches between the teams in the group and adds them to the group.
     */

    public void randomMatches()
    {
        int numberMatches = 0;
        
        while (numberMatches < 30)
        {
            addMatch();
            numberMatches++;
        }
    }
    
    /**
     * Mutator method to sort the teams based on their points.
     */

    public void calculateGroupRanking()
    {
        teams.sort((o1, o2)
                      -> Float.compare(o1.getPoints(), o2.getPoints()));
                      
                      
        
    }
}
