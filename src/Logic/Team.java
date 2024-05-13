package Logic;

import java.util.*;
/**
 * 
 */
public class Team {

    private String name;
    private String stadium;
    private int capacity;
    private Manager manager;
    private ArrayList<Player> players;

    public Team()  
    {
    
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getStadium() 
    {
        return stadium;
    }

    public void setStadium(String stadium) 
    {
        this.stadium = stadium;
    }

    public int getCapacity() 
    {
        return capacity;
    }

    public void setCapacity(int capacity) 
    {
        this.capacity = capacity;
    }

    public Manager getManager() 
    {
        return manager;
    }

    public void setManager(Manager manager) 
    {
        this.manager = manager;
    }
     public void addPlayers(Player player)
    {
        
    }

    public void removePlayer(Player player)
    {
        
    }

    public ArrayList<Player> getPlayers() 
    {
        return players;
    }

    
}