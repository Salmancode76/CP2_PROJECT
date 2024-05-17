package Logic;
import GUI.Add_Players;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.*;
import Logic.Team;
import java.io.FileOutputStream;

import java.io.Serializable;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SportsLeague  implements Serializable 
{

    private ArrayList <Player> unassign_players;
    private ArrayList <Manager> Managers;
    private ArrayList <Team> Teams;
        File file = new File("teams.txt");
    File file_play = new File("remain_players.txt");
    File file_managers = new File("managers.txt");
    File file_boot=new File("startup.txt");
    
    public SportsLeague() {
    unassign_players = new ArrayList<>();
    Managers = new ArrayList<>();
    Teams = new ArrayList<>();   
if(!file.exists() && !file_play.exists() && !file_managers.exists() && file_boot.exists()){
    // This is the first run, initialize from startup.txt
   // initializeFromFile("startup.txt");
   try (Scanner scanner = new Scanner(new File("startup.txt"))) {
        int numTeams = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numTeams; i++) {
            String teamName = scanner.nextLine();
            String stadiumName = scanner.nextLine();
            int stadiumCapacity = Integer.parseInt(scanner.nextLine());

            // Create and add the team
            Team team = new Team(teamName, stadiumName, stadiumCapacity);
            Teams.add(team);

            // Read and add the manager
            String managerName = scanner.nextLine();
            String managerAddress = scanner.nextLine();
            String managerDob = scanner.nextLine();
            String managerNationality = scanner.nextLine();
            double managerSalary = Double.parseDouble(scanner.nextLine());
            double managerBonusPercentage = Double.parseDouble(scanner.nextLine());
            String managerQualifications = scanner.nextLine();

            Manager manager = new Manager(managerName, managerAddress, managerDob, managerNationality, managerSalary, managerBonusPercentage, managerQualifications);
            Managers.add(manager);

            // Read and add the players
            int numPlayers = Integer.parseInt(scanner.nextLine());

            for (int j = 0; j < numPlayers; j++) {
                String playerName = scanner.nextLine();
                String playerAddress = scanner.nextLine();
                String playerDob = scanner.nextLine();
                String playerNationality = scanner.nextLine();
                double playerSalary = Double.parseDouble(scanner.nextLine());
                String playerPosition = scanner.nextLine().trim();
                boolean isCaptain = scanner.nextLine().equals("Captain");

                Player player = new Player(playerName, playerAddress, playerDob, playerNationality, playerSalary, playerPosition,team, isCaptain);
                team.getPlayers().add(player);
            }
        }

        // Read and add the unassigned players
        int numUnassignedPlayers = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numUnassignedPlayers; i++) {
            String playerName = scanner.nextLine();
            String playerAddress = scanner.nextLine();
            String playerDob = scanner.nextLine();
            String playerNationality = scanner.nextLine();
            double playerSalary = Double.parseDouble(scanner.nextLine());
            String playerPosition = scanner.nextLine();
            boolean isCaptain = scanner.nextLine().equals("Captain");

            Player player = new Player(playerName, playerAddress, playerDob, playerNationality, playerSalary, playerPosition, isCaptain);
            unassign_players.add(player);
           
                
                
        }
        
        String file_path_rp ="remain_players.txt";
                try {
                    FileOutputStream fost = new FileOutputStream(file_path_rp);
                    try {
                         ObjectOutputStream oosrp = new ObjectOutputStream(fost);
                        
                        oosrp.writeObject(this.getUnassign_players());
                        System.out.println("Player Added");
                        
                    } catch (IOException ex) {
                        Logger.getLogger(Add_Players.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Add_Players.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                 String file_path_team ="teams.txt";
                try {
                    FileOutputStream fost = new FileOutputStream(file_path_team);
                    try {
                         ObjectOutputStream oost = new ObjectOutputStream(fost);
                        
                        oost.writeObject(this.getTeams());
                        System.out.println("Player Added");
                        
                    } catch (IOException ex) {
                        Logger.getLogger(Add_Players.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Add_Players.class.getName()).log(Level.SEVERE, null, ex);
                }
                String file_path_manager ="managers.txt";
                    try {
                        FileOutputStream fost = new FileOutputStream(file_path_manager);
                        
                        try {
                            ObjectOutputStream oosm = new ObjectOutputStream(fost);
                            
                            oosm.writeObject(this.getManagers());
                            System.out.println("Manager Added");
                            
                        } catch (IOException ex) {
                            Logger.getLogger(Add_Players.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Add_Players.class.getName()).log(Level.SEVERE, null, ex);
                    }
        
        
        
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
   
   
   
} else {
    // This is not the first run, load data from serialized files
    loadSerializedData();    
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


        team.setName(newName);
        team.setStadium(newStadium);
        team.setCapacity(newCapacity);

    // Update the team in the Teams list
    for (int i = 0; i < Teams.size(); i++) 
    {
        if (Teams.get(i).getName().equals(team.getName()) && Teams.get(i).getStadium().equals(team.getStadium()))
        {
            Teams.get(i).setName(newName);
            Teams.get(i).setStadium(newStadium);
            Teams.get(i).setCapacity(newCapacity);  // Replace the old team with the updated team
            break;
        }
    }

    
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
    

public void editManagerDetails(Manager manager, String newName, String newAddress, String newDOB, String newNationality, double newSalary, double newBonusPercentage, String newQualifications) 
    {
        manager.setName(newName);
        manager.setAddress(newAddress);
        manager.setDob(newDOB);
        manager.setNationality(newNationality);
        manager.setSalary(newSalary);
        manager.setBonusPercentage(newBonusPercentage);
        manager.setQualifications(newQualifications);


        for (Manager m : Managers) 
        {
            if (m.getId() == manager.getId()) 
            {
                m.setName(newName);
                m.setAddress(newAddress);
                m.setDob(newDOB);
                m.setNationality(newNationality);
                m.setSalary(newSalary);
                m.setBonusPercentage(newBonusPercentage);
                m.setQualifications(newQualifications);
                break;
            }
        }

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
    
     private void loadSerializedData() {
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
     

}