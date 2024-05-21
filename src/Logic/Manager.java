package Logic;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;


public class Manager extends Person implements Serializable 
{
        
    private double bonusPercentage;
    private String qualifications;
    private Team team;
    
    
    public Manager() throws IOException
    {
          super();
        
    }

     public Manager(String name, String address, String dob, String nationality, double salary, double bonusPercentage, String qualifications) throws IOException {
        super(name, address, dob, nationality,salary); 
          if (name == null || address == null || dob == null || nationality == null || qualifications == null) {
            throw new NullPointerException("Parameters cannot be null");
        }
        this.bonusPercentage = bonusPercentage;
        this.qualifications = qualifications;

    }

 

    public double getBonusPercentage() 
    {
        return bonusPercentage;
    }

 

    public String getQualifications()
    {
        return qualifications;
    }

    public Team getTeam()
    {
        return team;
    }

   public void setBonusPercentage(double bonusPercentage) {
        if (bonusPercentage < 0) {
            throw new IllegalArgumentException("Bonus percentage cannot be negative");
        }
        this.bonusPercentage = bonusPercentage;
    }

    public void setQualifications(String qualifications) {
        if (qualifications == null) {
            throw new NullPointerException("Qualifications cannot be null");
        }
        this.qualifications = qualifications;
    }

    public void setTeam(Team team) {
        if (team == null) {
            throw new NullPointerException("Team cannot be null");
        }
        this.team = team;
    }

    @Override
    public String toString() {
     
                return "ID: "+this.getId()+" Name: "+this.getName();

    }
    
    
    
    

    
   

}