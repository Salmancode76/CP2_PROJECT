package Logic;
import java.util.*;

/**
 * 
 */
public class Person 
{

    private static int  ID=0;
    private int Owner_id;
    private String name;
    private String address;
    private String dob;
    private String nationality;
    private double salary;

    
    public Person() //Default constructor
    {
        Owner_id=ID++; 
    }

   

    public int getID() 
    {
        return ID;
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

    public void setID(int ID) 
    {
        this.ID = ID;
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

   
    
}