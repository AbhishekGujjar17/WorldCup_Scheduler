import java.util.ArrayList;
import java.util.Collections;
import java.text.DecimalFormat;
import java.text.NumberFormat;


/**
 * The class WorldCup holds the array of groups and simulates the the world cup event.
 *
 * @author Abhishek Gujjar
 * @version 11/21/2021
 */
public class WorldCup
{
    // instance variables
    private ArrayList<Group> groups;

    /**
     * Constructor for objects of class WorldCup
     */
    public WorldCup()
    {
        groups = new ArrayList<>();
    }

    /**
     * The method worldCupSetup creates groups, creates teams to add to the groups and simulates matches between the teams in each group.
     */

    public void worldCupSetup()
    {
        // creates group and adds them to the world cup.
        int numberOfGroups = 0;
        while (numberOfGroups < 6)
        {
            Group newGroup = new Group("Group"+numberOfGroups);
            groups.add(newGroup);
            numberOfGroups++;
        }
        
        // creates an random lis of 23 players to add to the team.
        String[] players = new String[23];
        int numberOfPlayers = 0;
        while (numberOfPlayers < 23)
        {
            players[numberOfPlayers]= ("Player" + numberOfPlayers);
            numberOfPlayers++;
        }
        
        // For each group in the World cup, the method creates teams , adds the to the group and simulates matches between the teams.
        for(Group eachGroup: groups)
        {
            int numberOfTeams = 1;
            while (numberOfTeams < 5)
            {
                Team newTeam = new Team("Team"+numberOfTeams,"Coach"+numberOfTeams,players);
                eachGroup.addTeam(newTeam);
                numberOfTeams++;
            }
            eachGroup.randomMatches();
        }

    }
    
    /**
     * The method takes the name of the group and calculates/displays the ranking for that group.
     */

    public void calculateRanking(String groupName)
    {
        for (Group eachGroup: groups)
        {
            if (eachGroup.getName().equals(groupName)) // Checks if the group name passed in the parameter matches any of the group in the world cup
            {
                Group group = eachGroup;
                System.out.println("Rankings of " + group.getName() + ":");
                group.calculateGroupRanking(); // sorts the teams in the group in ascending order according to their points
                Collections.reverse(group.getTeams()); // reverse the list to sort the list in descending order.
                for (Team team: group.getTeams()) // prints out the teams in the group according to their points.
                {
                    DecimalFormat df = new DecimalFormat("0.00");
                    System.out.println("" + (group.getTeams().indexOf(team)+1) + ". " + team.getName() + " Points: " +  df.format(team.getPoints()));
                }
            }
        }
        System.out.println(" ");
    }
}
