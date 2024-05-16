package Logic;
import java.io.Serializable;
import java.util.*;


public class Manager extends Person implements Serializable 
{

    
    public Manager()
    {
          SportsLeague sl = new SportsLeague();
            this.setId(sl.getManagers().size());
        
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

    @Override
    public String toString() {
        return "ID: "+this.getId()+" Name: "+this.getName()+" Team: "+team.getName();
    }
    
    
    
    

    
   

}