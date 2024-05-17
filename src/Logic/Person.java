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
    
    public Person() throws FileNotFoundException, IOException {
        File fil = new File("ids.txt");
        if(fil.exists() && fil.length() > 0){
            try (BufferedReader reader = new BufferedReader(new FileReader(fil))) {
                lastAssignedId = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            fil.createNewFile();
            lastAssignedId = 0;
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


    public void setName(String name)
    {
        this.name = name;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public void setDob(String dob) 
    {
        this.dob = dob;
    }

    public void setNationality(String nationality)
    {
        this.nationality = nationality;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

   
    
}