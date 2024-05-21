package Logic;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 */
public class Person implements Serializable
{

    
    private static int lastAssignedId = 0; // This field will keep track of the last assigned id
    private int id; // Each instance of Person will have a unique id
  

    private String name;
    private String address;
    private String dob;
    private String nationality;
    private double salary;
    
    public Person() throws FileNotFoundException, IOException 
    {
        File fil = new File("ids.txt");
        if(fil.exists() && fil.length() > 0)
        {
            try (BufferedReader reader = new BufferedReader(new FileReader(fil))) 
            {
                lastAssignedId = Integer.parseInt(reader.readLine());
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        } 
        else
        {
            fil.createNewFile();
        }

        id = lastAssignedId++;

        try (PrintWriter writer = new PrintWriter(new FileWriter(fil, false)))
        {
            writer.println(lastAssignedId); // Convert lastAssignedId to string and write it to file
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }

    

        // Constructor with five arguments
    public Person(String name, String address, String dob, String nationality, double salary) throws IOException 
    {
         if (name == null || address == null || dob == null || nationality == null) {
            throw new NullPointerException("Parameters cannot be null");
        }
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.nationality = nationality;
        this.salary = salary;
        File fil = new File("ids.txt");
        if(fil.exists() && fil.length() > 0)
        {
            try (BufferedReader reader = new BufferedReader(new FileReader(fil))) {
                lastAssignedId = Integer.parseInt(reader.readLine());
            } 
            catch (IOException e)
            {
                e.printStackTrace();
            }
        } 
        else 
        {
            fil.createNewFile();
        }

        id = lastAssignedId++;

        try (PrintWriter writer = new PrintWriter(new FileWriter(fil, false))) {
            writer.println(lastAssignedId); // Convert lastAssignedId to string and write it to file
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    }


    public String getName() 
    {
        return name;
    }

    public String getAddress() 
    {
        return address;
        
    }

    public String getDob() 
    {
        return dob;
    }

    public String getNationality()
    {
        return nationality;
    }

    public double getSalary() 
    {
        return salary;
    }


public void setName(String name) {
        if (name == null) {
            throw new NullPointerException("Name cannot be null");
        }
        this.name = name;
    }

    public void setAddress(String address) {
        if (address == null) {
            throw new NullPointerException("Address cannot be null");
        }
        this.address = address;
    }

    public void setDob(String dob) {
        if (dob == null) {
            throw new NullPointerException("Date of birth cannot be null");
        }
        this.dob = dob;
    }

    public void setNationality(String nationality) {
        if (nationality == null) {
            throw new NullPointerException("Nationality cannot be null");
        }
        this.nationality = nationality;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.salary = salary;
    }



    public int getId() {
        return id;
    }

   
    
}