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
public class Penalty 
{
    private String player;
    private String penaltyType;
    private int penaltyLength;
    
    public Penalty (String player, String penaltyType, int penaltyLength)
    {
        this.player = player;
        this.penaltyType = penaltyType;
        this.penaltyLength = penaltyLength;
    }
    
    private String getPlayer()
    {
        return player;
    }
    
    private String getPenaltyType()
    {
        return penaltyType;
    }
            
    private int getPenaltyLength()
    {
        return penaltyLength;
    }
    
    private void setPlayer(String player)
    {
        this.player = player;
    }
            
    private void setPenaltyType(String penaltyType)
    {
        this.penaltyType = penaltyType;
    }
    
    private void setPenaltyLength(int penaltyLength)
    {
        this.penaltyLength = penaltyLength;
    }
    
    
}
