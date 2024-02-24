/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author conorfryer
 */
public class Goal {
    private int team;
    private int period;
    private int time;
    private String playerName;
    private int playerNumber;
    private String goalType;
    
    public Goal (int team, int period, int time, String playerName, int playerNumber, String goalType)
    {
        this.team = team;
        this.period = period;
        this.time = time;
        this.playerName = playerName;
        this.playerNumber = playerNumber;
        this.goalType = goalType;
    }       
    
    private int getTeam()
    {
        return team;
    }
    
    private int getPeriod()
    {
        return period;
    }
    
    private int getTime()
    {
        return time;
    }
    
    private String getPlayerName()
    {
        return playerName;
    }        
    
    private int getPlayerNumber()
    {
        return playerNumber;
    }
    
    private String getGoalType()
    {
        return goalType;
    }
    
    private void setTeam(int team)
    {
        this.team = team;
    }
    
    private void setPeriod(int period)
    {
        this.period = period;
    }
    
    private void setTime(int time)
    {
        this.time = time;
    }
    
    private void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }        
    
    private void setPlayerNumber(int playerNumber)
    {
        this.playerNumber = playerNumber;
    }
    
    private void setGoalType(String goalType)
    {
        this.goalType = goalType;
    }
}
