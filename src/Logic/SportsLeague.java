package Logic;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.*;
import java.io.Serializable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


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
    File file_play = new File("players.txt");
    if (!file_play.exists()){
        try {
            file_play.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(SportsLeague.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        try {
            FileInputStream fisp = new FileInputStream(file_play);
        try {
            if (file_play.length()>0){
            ObjectInputStream osp = new ObjectInputStream(fisp);
            while(true){
                try {
                    ArrayList<Player> playersInFile = (ArrayList<Player>) osp.readObject();
                    All_Players.addAll(playersInFile);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SportsLeague.class.getName()).log(Level.SEVERE, null, ex);
                }catch (EOFException ex) {
                    // Break the loop when EOFException is thrown
                    break;
                }
                
            }
            }
        } catch (IOException ex) {
            Logger.getLogger(SportsLeague.class.getName()).log(Level.SEVERE, null, ex);
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SportsLeague.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        File file_managers = new File("managers.txt");
        if (!file_managers.exists())
        {
            try
            {
                file_managers.createNewFile();
            }
            catch (IOException exz)
                    {
                        Logger.getLogger(SportsLeague.class.getName()).log(Level.SEVERE, null, exz);
                    }
        }

        try {
            FileInputStream fisM = new FileInputStream(file_managers);
        try {
            if (file_managers.length()>0){
            ObjectInputStream osM = new ObjectInputStream(fisM);
            while(true)
            {
                try {
                    ArrayList<Manager> managersInFile = (ArrayList<Manager>) osM.readObject();
                    Managers.addAll(managersInFile);
                } catch (ClassNotFoundException exz) {
                    Logger.getLogger(SportsLeague.class.getName()).log(Level.SEVERE, null, exz);
                }catch (EOFException exz) {
                    // Break the loop when EOFException is thrown
                    break;
                }

            }
            }
        } catch (IOException exz) {
            Logger.getLogger(SportsLeague.class.getName()).log(Level.SEVERE, null, exz);
        }
        } catch (FileNotFoundException exz) {
            Logger.getLogger(SportsLeague.class.getName()).log(Level.SEVERE, null, exz);
    
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
        All_Players.add(player);
    }

    
    public void removePlayer(Player player)
    {
        
    }

    
    public void addManager(Manager manager) 
    
    {
        Managers.add(manager);
        
    }

    
    public void removeManager(Manager manager) 
    {
        
    }

    
    public void assignPlayerToTeam(Player player, Team team) 
    {
        //asiagn team in player obj
        player.setTeam(team);
        //assign player to the team array
        team.addPlayers(player);
        //add player to the array list of all players
        this.addPlayer(player);
    }

    
    public boolean designateCaptain(Player player, Team team) 
{
    int play_index;
    for(int i=0;i<team.getPlayers().size();i++){
        if(team.getPlayers().get(i).isIsCaptain()){
            team.getPlayers().get(i).setIsCaptain(false);
            play_index= team.getPlayers().get(i).getId();
            for (int j=0;j<this.All_Players.size();j++){
                if(All_Players.get(j).getId()==play_index){
                    All_Players.get(j).setIsCaptain(false);
                    
                }
                
                
            }
            
        }
    }
    player.setIsCaptain(true);
    return true;
}

    public boolean designateManager(Manager manag, Team team) 
    {
            if(!(team.getManager() ==null)) {
                return false;
            }
        
        manag.setTeam(team);
        team.addManagers(manag);
        this.addManager(manag);
        return true;
        
    }

    
    public void editTeamDetails(Team team, String newName, String newStadium, int newCapacity) 
    {
        
    }

    
    public void editPlayerDetails(Player player, String newName, String newAddress, String newDOB, String newNationality, double newSalary, String newPosition) 
{
    
      // Update the player's details
  
    // Update the player in the All_Players list
    for (int i = 0; i < All_Players.size(); i++) {
        if (All_Players.get(i).getId() == player.getId()) {
            All_Players.get(i).setName(newName);
            All_Players.get(i).setAddress(newAddress);
            All_Players.get(i).setDob(newDOB);
            All_Players.get(i).setNationality(newNationality);
            All_Players.get(i).setSalary(newSalary);
            
            break;
        }
    }
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

    public ArrayList<Manager> getManagers() {
        return Managers;
    }
    
    

}