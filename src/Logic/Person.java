package Logic;

import java.io.*;
import java.util.*;

/**
 * Class: Person
 * @version 1.0
 * Purpose: Represents a person in the system with unique ID, personal details, and salary.
 */
public class Person implements Serializable {

    private static int lastAssignedId = 0; // This field will keep track of the last assigned id
    private int id; // Each instance of Person will have a unique id

    private String name;
    private String address;
    private String dob;
    private String nationality;
    private double salary;

    /**
     * Constructor: Person
     * Purpose: Default constructor for the Person class.
     * Input: None
     * Output: None
     * Effect: Initializes a new instance of the Person class, assigns a unique ID, and updates the ID file.
     * @throws FileNotFoundException If the file is not found
     * @throws IOException If an input or output exception occurred
     */
    public Person() throws FileNotFoundException, IOException {
        File fil = new File("ids.txt");
        if (fil.exists() && fil.length() > 0) {
            try (BufferedReader reader = new BufferedReader(new FileReader(fil))) {
                lastAssignedId = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            fil.createNewFile();
        }

        id = lastAssignedId++;

        try (PrintWriter writer = new PrintWriter(new FileWriter(fil, false))) {
            writer.println(lastAssignedId); // Convert lastAssignedId to string and write it to file
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Constructor: Person
     * Purpose: Initializes a new instance of the Person class with specified attributes.
     * Input: name - The name of the person
     *        address - The address of the person
     *        dob - The date of birth of the person
     *        nationality - The nationality of the person
     *        salary - The salary of the person
     * Output: None
     * Effect: Creates a new Person object with the given attributes and assigns a unique ID.
     * @param name The name of the person
     * @param address The address of the person
     * @param dob The date of birth of the person
     * @param nationality The nationality of the person
     * @param salary The salary of the person
     * @throws IOException If an input or output exception occurred
     */
    public Person(String name, String address, String dob, String nationality, double salary) throws IOException {
        if (name == null || address == null || dob == null || nationality == null) {
            throw new NullPointerException("Parameters cannot be null");
        }
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.nationality = nationality;
        this.salary = salary;

        File fil = new File("ids.txt");
        if (fil.exists() && fil.length() > 0) {
            try (BufferedReader reader = new BufferedReader(new FileReader(fil))) {
                lastAssignedId = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            fil.createNewFile();
        }

        id = lastAssignedId++;

        try (PrintWriter writer = new PrintWriter(new FileWriter(fil, false))) {
            writer.println(lastAssignedId); // Convert lastAssignedId to string and write it to file
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Name: getName
     * Purpose: Retrieves the name of the person.
     * Input: None
     * Output: The name of the person
     * Effect: Provides access to the name.
     * @return The name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * Name: getAddress
     * Purpose: Retrieves the address of the person.
     * Input: None
     * Output: The address of the person
     * Effect: Provides access to the address.
     * @return The address of the person
     */
    public String getAddress() {
        return address;
    }

    /**
     * Name: getDob
     * Purpose: Retrieves the date of birth of the person.
     * Input: None
     * Output: The date of birth of the person
     * Effect: Provides access to the date of birth.
     * @return The date of birth of the person
     */
    public String getDob() {
        return dob;
    }

    /**
     * Name: getNationality
     * Purpose: Retrieves the nationality of the person.
     * Input: None
     * Output: The nationality of the person
     * Effect: Provides access to the nationality.
     * @return The nationality of the person
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Name: getSalary
     * Purpose: Retrieves the salary of the person.
     * Input: None
     * Output: The salary of the person
     * Effect: Provides access to the salary.
     * @return The salary of the person
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Name: setName
     * Purpose: Sets the name of the person.
     * Input: name - The new name
     * Output: None
     * Effect: Updates the name of the person.
     * @param name The new name
     */
    public void setName(String name) {
        if (name == null) {
            throw new NullPointerException("Name cannot be null");
        }
        this.name = name;
    }

    /**
     * Name: setAddress
     * Purpose: Sets the address of the person.
     * Input: address - The new address
     * Output: None
     * Effect: Updates the address of the person.
     * @param address The new address
     */
    public void setAddress(String address) {
        if (address == null) {
            throw new NullPointerException("Address cannot be null");
        }
        this.address = address;
    }

    /**
     * Name: setDob
     * Purpose: Sets the date of birth of the person.
     * Input: dob - The new date of birth
     * Output: None
     * Effect: Updates the date of birth of the person.
     * @param dob The new date of birth
     */
    public void setDob(String dob) {
        if (dob == null) {
            throw new NullPointerException("Date of birth cannot be null");
        }
        this.dob = dob;
    }

    /**
     * Name: setNationality
     * Purpose: Sets the nationality of the person.
     * Input: nationality - The new nationality
     * Output: None
     * Effect: Updates the nationality of the person.
     * @param nationality The new nationality
     */
    public void setNationality(String nationality) {
        if (nationality == null) {
            throw new NullPointerException("Nationality cannot be null");
        }
        this.nationality = nationality;
    }

    /**
     * Name: setSalary
     * Purpose: Sets the salary of the person.
     * Input: salary - The new salary
     * Output: None
     * Effect: Updates the salary of the person.
     * @param salary The new salary
     */
    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.salary = salary;
    }

    /**
     * Name: getId
     * Purpose: Retrieves the ID of the person.
     * Input: None
     * Output: The ID of the person
     * Effect: Provides access to the ID.
     * @return The ID of the person
     */
    public int getId() {
        return id;
    }
}
