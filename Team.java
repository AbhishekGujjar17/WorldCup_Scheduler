import java.util.ArrayList;
/**
 * The class Team takes the team name, the coach name and the array of players to initialize a
 * team object. It also stores the goal record and the points of a team.
 *
 * @author Sameer Mukhi, Abhishek Gujjar, Sahil Mahey
 * @version 11/21/2021
 */
public class Team
{
    // instance variables
    private String teamName;
    private String coachName;
    private String[] players;
    private int goalScored;
    private int goalAgainst;
    private int goalDifference;
    private float points;
    
    /**
     * Constructor for objects of class Team
     */
    public Team(String name, String coach, String[] players)
    {
        teamName = name;
        coachName = coach;
        this.players = new String[23];
        this.players = players;
        goalScored = 0; // instance variable to store goals scored by the team.
        goalAgainst = 0; // instance variable to store goals scored against the team.
        goalDifference = 0; // instance variable to store the goal difference of the team.
        points = 0; // instance variable to store points of the team.
    }
    
    /**
     * Accessor method to access the points of the team.
     */
    public float getPoints()
    {
        return points;
    }
    
    /**
     * Accessor method to access the goals scored by the team.
     */
    public int getGoalsScored()
    {
        return goalScored;
    }
    
    /**
     * Accessor method to access the goals scored against the team.
     */
    public int getGoalsAgainst()
    {
        return goalAgainst;
    } 
    
    /**
     * Accessor method to access the goals difference of the team.
     */
    public int getGoalsDifference()
    {
        return goalDifference;
    }
    
    /**
     * Accessor method to access the name of the team.
     */
    public String getName()
    {
        return teamName;
    }
    
    /**
     * Mutator method that takes in the parameter goal to update the goals scored by the team 
     * after a match.
     */
    public void updateGoalScored(int goal)
    {
        goalScored = goalScored + goal;
    }
    
    /**
     * Mutator method that takes in the parameter goal to update the goals scored against the 
     * team after a match.
     */
    public void updateGoalAgainst(int goal)
    {
        goalAgainst = goalAgainst + goal;
    }
    
    /**
     * Mutator method to update the goal difference of the team by taking the difference
     * between goals scored and goals against.
     */
    public void updateGoalDifference()
    {
        goalDifference = goalScored - goalAgainst;
    }
    
    /**
     * Mutator method that takes in the parameter points to update the points of the team 
     * after a match.
     */
    public void updatePoints(float point)
    {
        points = points + point;
    }
}
