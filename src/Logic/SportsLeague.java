package Logic;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;
import java.io.Serializable;
import java.io.IOException;


public class SportsLeague  implements Serializable 
{

    private ArrayList <Player> All_Players;
    private ArrayList <Manager> Managers;
    private ArrayList <Team> Teams;
    
    public SportsLeague() {
    All_Players = new ArrayList<>();
    Managers = new ArrayList<>();
    Teams = new ArrayList<>();
    //File Object
    File file = new File("teams.txt");
    
   //Making sure the exists
    if (!file.exists()) {
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Only read when the file is NOT empty
    if (file.length() > 0) {
    try {
        //File stream
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream in = new ObjectInputStream(fis);
        
        Teams = new ArrayList<>();
        while (true) {
            try {
                //copying all data from the serialized file to the temp array
                ArrayList<Team> teamsInFile = (ArrayList<Team>) in.readObject();
                Teams.addAll(teamsInFile);
            } catch (EOFException e) {
                break; 
            }
        }
        
        in.close();
        fis.close();
    } catch (IOException | ClassNotFoundException ex) {
        ex.printStackTrace();
    }


}
    }
    

   
    


    public void addTeam(Team team) 
    {
            Teams.add(team);
        
       
    }

    
    public void removeTeam(Team team) 
    {
        
    }

   
    public void addPlayer(Player player) 
    {
        
    }

    
    public void removePlayer(Player player)
    {
        
    }

    
    public void addManager(Manager manager) 
    
    {
        
    }

    
    public void removeManager(Manager manager) 
    {
        
    }

    
    public void assignPlayerToTeam(Player player, Team team) 
    {
        
    }

    
    public void designateCaptain(Player player, Team team) 
    {
        
    }

    
    public void editTeamDetails(Team team, String newName, String newStadium, int newCapacity) 
    {
        
    }

    
    public void editPlayerDetails(Player player, String newName, String newAddress, Date newDOB, String newNationality, double newSalary, String newPosition) 
    {
        
    }

    
    public void editManagerDetails(Manager manager, String newName, String newAddress, Date newDOB, String newNationality, double newSalary, double newBonusPercentage, String newQualifications) 
    {
      
    }

    
    public void generatePayrollReport() 
    {
        
    }
    //new
    public ArrayList<Player> getAll_Players() {
        return All_Players;
    }

    public ArrayList<Team> getTeams() {
        return Teams;
    }

    public void setTeams(ArrayList<Team> Teams) {
        this.Teams = Teams;
    }
    
    

}