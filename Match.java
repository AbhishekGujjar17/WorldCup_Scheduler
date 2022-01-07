
/**
 * The class Match takes two Teams and simulates a match between them, updates their goal
 * record and their points.
 * 
 * @author Abhishek Gujjar
 * @version 11/21/2021
 */
public class Match
{
    // instance variables
    private Team team1;
    private Team team2;
    private int scoreTeam1;
    private int scoreTeam2;
    
    /**
     * Constructor for objects of class Match
     */
    public Match(Team team1, Team team2)
    {
        this.team1 = team1;
        //Randomly assigns a score fore team1
        scoreTeam1 = (int)Math.floor(Math.random()*7);
        this.team2 = team2;
        //Randomly assigns a score fore team1
        scoreTeam2 = (int)Math.floor(Math.random()*7);
    }

    /**
     * Updates the goals scored, goals against and goal difference of the teams after
     * each match
     */
    public void updateGoals()
    {
        team1.updateGoalScored(scoreTeam1);
        team1.updateGoalAgainst(scoreTeam1);
        team1.updateGoalDifference();
        
        team2.updateGoalScored(scoreTeam2);
        team2.updateGoalAgainst(scoreTeam2);
        team2.updateGoalDifference();
    }
    
    /**
     * Updates the points of the teams after each match
     */    
    public void updatePoints()
    {
        if (scoreTeam1 > scoreTeam2)
        {
            team1.updatePoints(3);
        }
        else if (scoreTeam1 == scoreTeam2)
        {
            team1.updatePoints(1);
            team2.updatePoints(1);
        }
        else
        {
            team2.updatePoints(3);
        }
        
        double goalPoint = 0.1;
        team1.updatePoints(scoreTeam1*(float)goalPoint);
        team2.updatePoints(scoreTeam2*(float)goalPoint);
    }
}
