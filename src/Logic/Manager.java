package Logic;
import java.io.Serializable;
import java.util.*;


public class Manager extends Person implements Serializable 
{

    
    public Manager()
    {
        
    }

    private double bonusPercentage;
    private String qualifications;
    private Team team;
    
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
    
    

    
   

}