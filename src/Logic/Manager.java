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

     public Manager(String name, String address, String dob, String nationality, double salary, double bonusPercentage, String qualifications) {
        super(name, address, dob, nationality,salary); 
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

    public void setBonusPercentage(double bonusPercentage) 
    {
        this.bonusPercentage = bonusPercentage;
    }

    public void setQualifications(String qualifications)
    {
        this.qualifications = qualifications;
    }

    public void setTeam(Team team) 
    {
        this.team = team;
    }

    @Override
    public String toString() {
        if(team!=null){
        return "ID: "+this.getId()+" Name: "+this.getName()+" Team: "+team.getName();
    }
                return "ID: "+this.getId()+" Name: "+this.getName();

    }
    
    
    
    

    
   

}