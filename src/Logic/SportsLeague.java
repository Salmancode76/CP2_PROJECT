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

    private ArrayList <Player> unassign_players;
    private ArrayList <Manager> Managers;
    private ArrayList <Team> Teams;
    
    public SportsLeague() {
    unassign_players = new ArrayList<>();
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
    File file_play = new File("remain_players.txt");
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
                    unassign_players.addAll(playersInFile);
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

   
    public void add_unassigned_Player(Player player) 
    {
        unassign_players.add(player);
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
       
    }

    
  public boolean designateCaptain(Player player, Team team) {
    // Iterate over all teams
    boolean comp = false;
    for (int i = 0; i < this.Teams.size(); i++) {
        // If the current team is the one we're interested in
        if (this.Teams.get(i).getName().equals(team.getName())  && (this.Teams.get(i).getStadium().equals(team.getStadium())  ) ){
            // Iterate over all players in the current team
            for (int j = 0; j < this.Teams.get(i).getPlayers().size(); j++) {
                // If the current player is the one we want to make captain
                if (this.Teams.get(i).getPlayers().get(j).getId() == player.getId()) {
                    // Set the current player as captain
                    this.Teams.get(i).getPlayers().get(j).setIsCaptain(true);
                    comp=true;
                }else{
                    this.Teams.get(i).getPlayers().get(j).setIsCaptain(false);
                }
            }
        }
    }
    return comp;
}
    public boolean undesignateCaptain(Player player, Team team) {
    // Iterate over all teams
    for (int i = 0; i < this.Teams.size(); i++) {
        // If the current team is the one we're interested in
        if (this.Teams.get(i).getName().equals(team.getName())  && (this.Teams.get(i).getStadium().equals(team.getStadium())  ) ){
            // Iterate over all players in the current team
            for (int j = 0; j < this.Teams.get(i).getPlayers().size(); j++) {
                // If the current player is the one we want to make captain
                if (this.Teams.get(i).getPlayers().get(j).getId() == player.getId()) {
                    // Set the current player as captain
                    this.Teams.get(i).getPlayers().get(j).setIsCaptain(false);
                }
            }
        }
    }
    return false;
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

    
    public void editPlayerDetails(Player player, String newName, String newAddress, String newDOB, String newNationality, double newSalary, String newPosition) {
        player.setName(newName);
        player.setAddress(newAddress);
        player.setDob(newDOB);
        player.setNationality(newNationality);
        player.setSalary(newSalary);
        player.setPosition(newPosition);

        for (Player p : unassign_players) {
            if (p.getId() == player.getId()) {
                p.setName(newName);
                p.setAddress(newAddress);
                p.setDob(newDOB);
                p.setNationality(newNationality);
                p.setSalary(newSalary);
                p.setPosition(newPosition);
                break;
            }
        }

        for (Team team : Teams) {
            for (Player p : team.getPlayers()) {
                if (p.getId() == player.getId()) {
                    p.setName(newName);
                    p.setAddress(newAddress);
                    p.setDob(newDOB);
                    p.setNationality(newNationality);
                    p.setSalary(newSalary);
                    p.setPosition(newPosition);
                    break;
                }
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
    public ArrayList<Player> getUnassign_players() {
        return unassign_players;
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