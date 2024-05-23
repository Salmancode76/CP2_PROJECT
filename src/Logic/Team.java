package Logic;

import java.io.Serializable;
import java.util.*;

/**
 * Class: Team
 * @version 1.0
 * Purpose: Represents a team in the sports league, including team details, manager, and players.
 */
public class Team implements Serializable {

    private String name;
    private String stadium;
    private int capacity;
    private Manager manager;
    private ArrayList<Player> players;

    /**
     * Constructor: Team
     * Purpose: Default constructor for the Team class.
     * Input: None
     * Output: None
     * Effect: Initializes a new instance of the Team class.
     */
    public Team() {
        players = new ArrayList<>();
    }

    /**
     * Constructor: Team
     * Purpose: Initializes a new instance of the Team class with specified attributes.
     * Input: name - The name of the team
     *        stadium - The stadium of the team
     *        capacity - The capacity of the stadium
     * Output: None
     * Effect: Creates a new Team object with the given attributes.
     * @param name The name of the team
     * @param stadium The stadium of the team
     * @param capacity The capacity of the stadium
     */
    public Team(String name, String stadium, int capacity) {
        if (name == null || stadium == null) {
            throw new NullPointerException("Parameters cannot be null");
        }
        players = new ArrayList<>();
        this.name = name;
        this.stadium = stadium;
        this.capacity = capacity;
    }

    /**
     * Name: getName
     * Purpose: Retrieves the name of the team.
     * Input: None
     * Output: The name of the team
     * Effect: Provides access to the name.
     * @return The name of the team
     */
    public String getName() {
        return name;
    }

    /**
     * Name: setName
     * Purpose: Sets the name of the team.
     * Input: name - The new name
     * Output: None
     * Effect: Updates the name of the team.
     * @param name The new name
     */
    public void setName(String name) {
        if (name == null) {
            throw new NullPointerException("Name cannot be null");
        }
        this.name = name;
    }

    /**
     * Name: getStadium
     * Purpose: Retrieves the stadium of the team.
     * Input: None
     * Output: The stadium of the team
     * Effect: Provides access to the stadium.
     * @return The stadium of the team
     */
    public String getStadium() {
        return stadium;
    }

    /**
     * Name: setStadium
     * Purpose: Sets the stadium of the team.
     * Input: stadium - The new stadium
     * Output: None
     * Effect: Updates the stadium of the team.
     * @param stadium The new stadium
     */
    public void setStadium(String stadium) {
        if (stadium == null) {
            throw new NullPointerException("Stadium cannot be null");
        }
        this.stadium = stadium;
    }

    /**
     * Name: getCapacity
     * Purpose: Retrieves the capacity of the stadium.
     * Input: None
     * Output: The capacity of the stadium
     * Effect: Provides access to the stadium capacity.
     * @return The capacity of the stadium
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Name: setCapacity
     * Purpose: Sets the capacity of the stadium.
     * Input: capacity - The new capacity
     * Output: None
     * Effect: Updates the stadium capacity.
     * @param capacity The new capacity
     */
    public void setCapacity(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative");
        }
        this.capacity = capacity;
    }

    /**
     * Name: getManager
     * Purpose: Retrieves the manager of the team.
     * Input: None
     * Output: The manager of the team
     * Effect: Provides access to the manager.
     * @return The manager of the team
     */
    public Manager getManager() {
        return manager;
    }

    /**
     * Name: setManager
     * Purpose: Sets the manager of the team.
     * Input: manager - The new manager
     * Output: None
     * Effect: Updates the manager of the team.
     * @param manager The new manager
     */
    public void setManager(Manager manager) {
        if (manager == null) {
            throw new NullPointerException("Manager cannot be null");
        }
        this.manager = manager;
    }

    /**
     * Name: addPlayers
     * Purpose: Adds a player to the team.
     * Input: player - The player to add
     * Output: None
     * Effect: Adds the player to the list of players.
     * @param player The player to add
     */
    public void addPlayers(Player player) {
        if (player == null) {
            throw new NullPointerException("Player cannot be null");
        }
        players.add(player);
    }

    /**
     * Name: addManagers
     * Purpose: Sets the manager of the team.
     * Input: manager_add - The manager to set
     * Output: None
     * Effect: Updates the manager of the team.
     * @param manager_add The manager to set
     */
    public void addManagers(Manager manager_add) {
        if (manager_add == null) {
            throw new NullPointerException("Manager cannot be null");
        }
        manager = manager_add;
    }

    /**
     * Name: removePlayer
     * Purpose: Removes a player from the team.
     * Input: player - The player to remove
     * Output: None
     * Effect: Removes the player from the list of players.
     * @param player The player to remove
     */
    public void removePlayer(Player player) {
        if (player == null) {
            throw new NullPointerException("Player cannot be null");
        }
        players.remove(player);
    }

    /**
     * Name: getPlayers
     * Purpose: Retrieves the list of players on the team.
     * Input: None
     * Output: The list of players on the team
     * Effect: Provides access to the list of players.
     * @return The list of players on the team
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * Name: toString
     * Purpose: Returns a string representation of the team.
     * Input: None
     * Output: String representation of the team
     * Effect: Provides a string representation of the team object.
     * @return String representation of the team
     */
    @Override
    public String toString() {
        return "Name: " + name;
    }
}
