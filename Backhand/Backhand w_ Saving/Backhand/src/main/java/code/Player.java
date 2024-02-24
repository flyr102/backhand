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
public class Player {
    private String name;
    private int number;
    private String position;
    
    public Player(String name, int number, String position)
    {
        this.name = name;
        this.number = number;
        this.position = position;
    }
    
    private String getName()
    {
        return name;
    }
    
    private int getNumber()
    {
        return number;
    }
    
    private String getPosition()
    {
        return position;
    }
    
    private void setName(String name)
    {
        this.name = name;
    }
    
    private void setNumber(int number)
    {
        this.number = number;
    }
    
    private void setPosition(String position)
    {
        this.position = position;
    }
}
