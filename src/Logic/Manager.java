package Logic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;

/**
 * Class: Manager
 * @version 1.0
 * Purpose: Represents a manager in the sports league, extending the Person class.
 */
public class Manager extends Person implements Serializable {

    private double bonusPercentage;
    private String qualifications;
    private Team team;

    /**
     * Constructor: Manager
     * Purpose: Default constructor for the Manager class.
     * Input: None
     * Output: None
     * Effect: Initializes a new instance of the Manager class.
     * @throws IOException If an input or output exception occurred
     */
    public Manager() throws IOException {
        super();
    }

    /**
     * Constructor: Manager
     * Purpose: Initializes a new instance of the Manager class with specified attributes.
     * Input: name - The name of the manager
     *        address - The address of the manager
     *        dob - The date of birth of the manager
     *        nationality - The nationality of the manager
     *        salary - The salary of the manager
     *        bonusPercentage - The bonus percentage of the manager
     *        qualifications - The qualifications of the manager
     * Output: None
     * Effect: Creates a new Manager object with the given attributes.
     * @param name The name of the manager
     * @param address The address of the manager
     * @param dob The date of birth of the manager
     * @param nationality The nationality of the manager
     * @param salary The salary of the manager
     * @param bonusPercentage The bonus percentage of the manager
     * @param qualifications The qualifications of the manager
     * @throws IOException If an input or output exception occurred
     */
    public Manager(String name, String address, String dob, String nationality, double salary, double bonusPercentage, String qualifications) throws IOException {
        super(name, address, dob, nationality, salary);
        if (name == null || address == null || dob == null || nationality == null || qualifications == null) {
            throw new NullPointerException("Parameters cannot be null");
        }
        this.bonusPercentage = bonusPercentage;
        this.qualifications = qualifications;
    }

    /**
     * Name: getBonusPercentage
     * Purpose: Retrieves the bonus percentage of the manager.
     * Input: None
     * Output: The bonus percentage of the manager
     * Effect: Provides access to the bonus percentage.
     * @return The bonus percentage of the manager
     */
    public double getBonusPercentage() {
        return bonusPercentage;
    }

    /**
     * Name: getQualifications
     * Purpose: Retrieves the qualifications of the manager.
     * Input: None
     * Output: The qualifications of the manager
     * Effect: Provides access to the qualifications.
     * @return The qualifications of the manager
     */
    public String getQualifications() {
        return qualifications;
    }

    /**
     * Name: getTeam
     * Purpose: Retrieves the team managed by the manager.
     * Input: None
     * Output: The team managed by the manager
     * Effect: Provides access to the team.
     * @return The team managed by the manager
     */
    public Team getTeam() {
        return team;
    }

    /**
     * Name: setBonusPercentage
     * Purpose: Sets the bonus percentage for the manager.
     * Input: bonusPercentage - The new bonus percentage
     * Output: None
     * Effect: Updates the bonus percentage.
     * @param bonusPercentage The new bonus percentage
     */
    public void setBonusPercentage(double bonusPercentage) {
        if (bonusPercentage < 0) {
            throw new IllegalArgumentException("Bonus percentage cannot be negative");
        }
        this.bonusPercentage = bonusPercentage;
    }

    /**
     * Name: setQualifications
     * Purpose: Sets the qualifications for the manager.
     * Input: qualifications - The new qualifications
     * Output: None
     * Effect: Updates the qualifications.
     * @param qualifications The new qualifications
     */
    public void setQualifications(String qualifications) {
        if (qualifications == null) {
            throw new NullPointerException("Qualifications cannot be null");
        }
        this.qualifications = qualifications;
    }

    /**
     * Name: setTeam
     * Purpose: Sets the team managed by the manager.
     * Input: team - The new team
     * Output: None
     * Effect: Updates the team managed by the manager.
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
     * Purpose: Returns a string representation of the manager.
     * Input: None
     * Output: String representation of the manager
     * Effect: Provides a string representation of the manager object.
     * @return String representation of the manager
     */
    @Override
    public String toString() {
        return "ID: " + this.getId() + " Name: " + this.getName();
    }
}
