package Logic;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Team implements Serializable {

    private String name;
    private String stadium;
    private int capacity;
    private Manager manager;
    private ArrayList<Player> players;

   

    public Team()  
    {
     players = new ArrayList<>();
    
    }

    public Team(String name, String stadium, int capacity) {
          if (name == null || stadium == null) {
            throw new NullPointerException("Parameters cannot be null");
        }
        players = new ArrayList<>();
        this.name = name;
        this.stadium = stadium;
        this.capacity = capacity;
        this.manager = manager;
        this.players = players;
    }
    
    

    public String getName() 
    {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new NullPointerException("Name cannot be null");
        }
        this.name = name;
    }

    public String getStadium() 
    {
        return stadium;
    }

public void setStadium(String stadium) {
        if (stadium == null) {
            throw new NullPointerException("Stadium cannot be null");
        }
        this.stadium = stadium;
    }

    public int getCapacity() 
    {
        return capacity;
    }

     public void setCapacity(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative");
        }
        this.capacity = capacity;
    }

    public Manager getManager() 
    {
        return manager;
    }

 public void setManager(Manager manager) {
        if (manager == null) {
            throw new NullPointerException("Manager cannot be null");
        }
        this.manager = manager;
    }
 
    public void addPlayers(Player player) {
        if (player == null) {
            throw new NullPointerException("Player cannot be null");
        }
        players.add(player);
    }

    public void addManagers(Manager manager_add) {
        if (manager_add == null) {
            throw new NullPointerException("Manager cannot be null");
        }
        manager = manager_add;
    }
     public void removePlayer(Player player) {
        if (player == null) {
            throw new NullPointerException("Player cannot be null");
        }
        players.remove(player);
    }

    public ArrayList<Player> getPlayers() 
    {
        return players;
    }
    public String toString() {
        return "Name: " + name;
    }

    
}