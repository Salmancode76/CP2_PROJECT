package Logic;

import java.io.*;
import java.util.*;

/**
 * Class: Player
 * @version 1.0
 * Purpose: Represents a player in the sports league, extending the Person class.
 */
public class Player extends Person {

    private String position;
    private boolean isCaptain;
    private Team team;

    /**
     * Constructor: Player
     * Purpose: Default constructor for the Player class.
     * Input: None
     * Output: None
     * Effect: Initializes a new instance of the Player class.
     * @throws IOException If an input or output exception occurred
     * @throws ClassNotFoundException If the class being loaded cannot be found
     */
    public Player() throws IOException, ClassNotFoundException {
        super(); // Call the superclass constructor to initialize id
    }

    /**
     * Constructor: Player
     * Purpose: Initializes a new instance of the Player class with specified attributes.
     * Input: name - The name of the player
     *        address - The address of the player
     *        dob - The date of birth of the player
     *        nationality - The nationality of the player
     *        salary - The salary of the player
     *        position - The position of the player
     *        team - The team of the player
     *        isCaptain - Boolean indicating if the player is the team captain
     * Output: None
     * Effect: Creates a new Player object with the given attributes.
     * @param name The name of the player
     * @param address The address of the player
     * @param dob The date of birth of the player
     * @param nationality The nationality of the player
     * @param salary The salary of the player
     * @param position The position of the player
     * @param team The team of the player
     * @param isCaptain Boolean indicating if the player is the team captain
     * @throws IOException If an input or output exception occurred
     */
    public Player(String name, String address, String dob, String nationality, double salary, String position, Team team, boolean isCaptain) throws IOException {
        super(name, address, dob, nationality, salary);
        if (name == null || address == null || dob == null || nationality == null || position == null || team == null) {
            throw new NullPointerException("Parameters cannot be null");
        }
        this.position = position;
        this.isCaptain = isCaptain;
        this.team = team;
    }

    /**
     * Constructor: Player
     * Purpose: Initializes a new instance of the Player class with specified attributes.
     * Input: name - The name of the player
     *        address - The address of the player
     *        dob - The date of birth of the player
     *        nationality - The nationality of the player
     *        salary - The salary of the player
     *        position - The position of the player
     *        isCaptain - Boolean indicating if the player is the team captain
     * Output: None
     * Effect: Creates a new Player object with the given attributes.
     * @param name The name of the player
     * @param address The address of the player
     * @param dob The date of birth of the player
     * @param nationality The nationality of the player
     * @param salary The salary of the player
     * @param position The position of the player
     * @param isCaptain Boolean indicating if the player is the team captain
     * @throws IOException If an input or output exception occurred
     */
    public Player(String name, String address, String dob, String nationality, double salary, String position, boolean isCaptain) throws IOException {
        super(name, address, dob, nationality, salary);
        if (name == null || address == null || dob == null || nationality == null || position == null) {
            throw new NullPointerException("Parameters cannot be null");
        }
        this.position = position;
        this.isCaptain = isCaptain;
    }

    /**
     * Name: getPosition
     * Purpose: Retrieves the position of the player.
     * Input: None
     * Output: The position of the player
     * Effect: Provides access to the position.
     * @return The position of the player
     */
    public String getPosition() {
        return position;
    }

    /**
     * Name: setPosition
     * Purpose: Sets the position of the player.
     * Input: position - The new position
     * Output: None
     * Effect: Updates the position of the player.
     * @param position The new position
     */
    public void setPosition(String position) {
        if (position == null) {
            throw new NullPointerException("Position cannot be null");
        }
        this.position = position;
    }

    /**
     * Name: isIsCaptain
     * Purpose: Checks if the player is the team captain.
     * Input: None
     * Output: true if the player is the team captain, false otherwise
     * Effect: Provides the captain status of the player.
     * @return true if the player is the team captain, false otherwise
     */
    public boolean isIsCaptain() {
        return isCaptain;
    }

    /**
     * Name: setIsCaptain
     * Purpose: Sets the captain status of the player.
     * Input: isCaptain - The new captain status
     * Output: None
     * Effect: Updates the captain status of the player.
     * @param isCaptain The new captain status
     */
    public void setIsCaptain(boolean isCaptain) {
        this.isCaptain = isCaptain;
    }

    /**
     * Name: getTeam
     * Purpose: Retrieves the team of the player.
     * Input: None
     * Output: The team of the player
     * Effect: Provides access to the team.
     * @return The team of the player
     */
    public Team getTeam() {
        return team;
    }

    /**
     * Name: setTeam
     * Purpose: Sets the team of the player.
     * Input: team - The new team
     * Output: None
     * Effect: Updates the team of the player.
     * @param team The new team
     */
    public void setTeam(Team team) {
        if (team == null) {
            throw new NullPointerException("Team cannot be null");
        }
        this.team = team;
    }

    /**
     * Name: toString
     * Purpose: Returns a string representation of the player.
     * Input: None
     * Output: String representation of the player
     * Effect: Provides a string representation of the player object.
     * @return String representation of the player
     */
    @Override
    public String toString() {
        if (team == null) {
            return "ID: " + this.getId() + " Name: " + this.getName() + " Team: N/A";
        }
        if (isCaptain) {
            return "ID: " + this.getId() + " Name: " + this.getName() + " Team: " + team.getName() + " Captain";
        }
        return "ID: " + this.getId() + " Name: " + this.getName() + " Team: " + team.getName();
    }
}
