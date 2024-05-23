package Logic;

import GUI.Add_Players;
import GUI.Main_Page;
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
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Class: SportsLeague
 * @version 1.0
 * Purpose: Manages the sports league including teams, players, and managers.
 */
public class SportsLeague implements Serializable {

    private ArrayList<Player> unassign_players;
    private ArrayList<Manager> Managers;
    private ArrayList<Team> Teams;

    private File file = new File("teams.txt");
    private File file_play = new File("remain_players.txt");
    private File file_managers = new File("managers.txt");
    private File file_boot = new File("startup.txt");

    /**
     * Constructor: SportsLeague
     * @throws IOException If an input or output exception occurred
     * Purpose: Initializes the sports league and loads data from files or initializes from startup file.
     */
    public SportsLeague() throws IOException {
        unassign_players = new ArrayList<>();
        Managers = new ArrayList<>();
        Teams = new ArrayList<>();

        if (!file.exists() && !file_play.exists() && !file_managers.exists() && file_boot.exists()) {
            // This is the first run, initialize from startup.txt
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
                    team.setManager(manager);

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

                        Player player = new Player(playerName, playerAddress, playerDob, playerNationality, playerSalary, playerPosition, team, isCaptain);
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

                saveData("remain_players.txt", this.getUnassign_players());
                saveData("teams.txt", this.getTeams());
                saveData("managers.txt", this.getManagers());

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        } else {
            // This is not the first run, load data from serialized files
            loadSerializedData();
        }
    }

    /**
     * Name: saveData
     * Purpose: Saves the given data to the specified file.
     * Input: fileName - The name of the file to save to
     *        data - The data to save
     * Output: None
     * Effect: Saves the current league data to the respective files.
     * @param fileName The name of the file to save to
     * @param data The data to save
     */
    private void saveData(String fileName, Object data) {
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(data);
        } catch (IOException ex) {
            Logger.getLogger(Add_Players.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Name: loadSerializedData
     * Purpose: Loads the league data from the serialized files.
     * Input: None
     * Output: None
     * Effect: Loads data from serialized files into the respective lists.
     */

    /**
     * Name: loadFromFile
     * Purpose: Loads data from the specified file into the given list.
     * Input: file - The file to load from
     *        list - The list to populate with the loaded data
     * Output: None
     * Effect: Populates the list with data loaded from the file.
     * @param file The file to load from
     * @param list The list to populate with the loaded data
     */
    private void loadFromFile(File file, ArrayList list) {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (file.length() > 0) {
            try (FileInputStream fis = new FileInputStream(file);
                 ObjectInputStream ois = new ObjectInputStream(fis)) {
                while (true) {
                    try {
                        ArrayList<?> data = (ArrayList<?>) ois.readObject();
                        list.addAll(data);
                    } catch (EOFException e) {
                        break;
                    }
                }
            } catch (IOException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }

    /**
     * Name: addTeam
     * Purpose: Adds a new team to the league.
     * Input: team - The team to add
     * Output: None
     * Effect: Adds the team to the list of teams.
     * @param team The team to add
     */
    public void addTeam(Team team) {
        Teams.add(team);
    }

    /**
     * Name: removeTeam
     * Purpose: Removes a team from the league.
     * Input: team - The team to remove
     * Output: None
     * Effect: Removes the team from the list of teams.
     * @param team The team to remove
     */
    public void removeTeam(Team team) {
        for (int i = 0; i < this.getTeams().size(); i++) {
            if (this.getTeams().get(i).getName().equals(team.getName())
                && this.getTeams().get(i).getStadium().equals(team.getStadium())) {
                for (Player player : this.getTeams().get(i).getPlayers()) {
                    player.setTeam(null);
                    this.add_unassigned_Player(player);
                }

                Manager manager = this.getTeams().get(i).getManager();
                if (manager != null) {
                    manager.setTeam(null);
                }

                this.getTeams().remove(i);
                break;
            }
        }
    }

    /**
     * Name: add_unassigned_Player
     * Purpose: Adds a player to the list of unassigned players.
     * Input: player - The player to add
     * Output: None
     * Effect: Adds the player to the list of unassigned players.
     * @param player The player to add
     */
    public void add_unassigned_Player(Player player) {
        unassign_players.add(player);
    }

    /**
     * Name: removePlayer
     * Purpose: Removes a player from their team.
     * Input: player - The player to remove
     * Output: None
     * Effect: Removes the player from their current team.
     * @param player The player to remove
     */
    public void removePlayer(Player player) {
        for (int i = 0; i < this.getTeams().size(); i++) {
            for (int j = 0; j < this.getTeams().get(i).getPlayers().size(); j++) {
                if (player.getId() == this.getTeams().get(i).getPlayers().get(j).getId()) {
                    this.getTeams().get(i).getPlayers().remove(j);
                    player.setTeam(null);
                    break;
                }
            }
        }
    }

    /**
     * Name: remove_unassignPlayer
     * Purpose: Removes a player from the list of unassigned players.
     * Input: player - The player to remove
     * Output: None
     * Effect: Removes the player from the list of unassigned players.
     * @param player The player to remove
     */
    public void remove_unassignPlayer(Player player) {
        for (int j = 0; j < this.getUnassign_players().size(); j++) {
            if (player.getId() == this.getUnassign_players().get(j).getId()) {
                this.getUnassign_players().remove(j);
                break;
            }
        }
    }

    /**
     * Name: addManager
     * Purpose: Adds a new manager to the league.
     * Input: manager - The manager to add
     * Output: None
     * Effect: Adds the manager to the list of managers.
     * @param manager The manager to add
     */
    public void addManager(Manager manager) {
        Managers.add(manager);
    }

    /**
     * Name: removeManager
     * Purpose: Removes a manager from the league.
     * Input: manager - The manager to remove
     * Output: None
     * Effect: Removes the manager from the list of managers.
     * @param manager The manager to remove
     */
    public void removeManager(Manager manager) {
        for (int i = 0; i < this.getTeams().size(); i++) {
            if (this.getTeams().get(i).getManager() != null
                && this.getTeams().get(i).getManager().getId() == manager.getId()) {
                this.getTeams().get(i).setManager(null);
                manager.setTeam(null);
                break;
            }
        }

        for (int j = 0; j < this.getManagers().size(); j++) {
            if (manager.getId() == this.getManagers().get(j).getId()) {
                this.getManagers().remove(j);
                break;
            }
        }
    }

    /**
     * Name: assignPlayerToTeam
     * Purpose: Assigns a player to a team.
     * Input: player - The player to assign
     *        team - The team to assign the player to
     * Output: None
     * Effect: Assigns the player to the specified team.
     * @param player The player to assign
     * @param team The team to assign the player to
     */
    public void assignPlayerToTeam(Player player, Team team) {
        player.setTeam(team);
        team.addPlayers(player);
    }

    /**
     * Name: designateCaptain
     * Purpose: Designates a player as the captain of their team.
     * Input: player - The player to designate as captain
     *        team - The team the player belongs to
     * Output: true if the player was designated as captain, false otherwise
     * Effect: Designates the player as the captain of the team.
     * @param player The player to designate as captain
     * @param team The team the player belongs to
     * @return true if the player was designated as captain, false otherwise
     */
    public boolean designateCaptain(Player player, Team team) {
        boolean comp = false;
        for (int i = 0; i < this.Teams.size(); i++) {
            if (this.Teams.get(i).getName().equals(team.getName())
                && this.Teams.get(i).getStadium().equals(team.getStadium())) {
                for (int j = 0; j < this.Teams.get(i).getPlayers().size(); j++) {
                    if (this.Teams.get(i).getPlayers().get(j).getId() == player.getId()) {
                        this.Teams.get(i).getPlayers().get(j).setIsCaptain(true);
                        comp = true;
                    } else {
                        this.Teams.get(i).getPlayers().get(j).setIsCaptain(false);
                    }
                }
            }
        }
        return comp;
    }

    /**
     * Name: undesignateCaptain
     * Purpose: Undesignates a player as the captain of their team.
     * Input: player - The player to undesignate as captain
     *        team - The team the player belongs to
     * Output: false
     * Effect: Undesignates the player as the captain of the team.
     * @param player The player to undesignate as captain
     * @param team The team the player belongs to
     * @return false
     */
    public boolean undesignateCaptain(Player player, Team team) {
        for (int i = 0; i < this.Teams.size(); i++) {
            if (this.Teams.get(i).getName().equals(team.getName())
                && this.Teams.get(i).getStadium().equals(team.getStadium())) {
                for (int j = 0; j < this.Teams.get(i).getPlayers().size(); j++) {
                    if (this.Teams.get(i).getPlayers().get(j).getId() == player.getId()) {
                        this.Teams.get(i).getPlayers().get(j).setIsCaptain(false);
                    }
                }
            }
        }
        return false;
    }

    /**
     * Name: designateManager
     * Purpose: Designates a manager to a team.
     * Input: manag - The manager to designate
     *        team - The team to designate the manager to
     * Output: true if the manager was designated, false otherwise
     * Effect: Designates the manager to the specified team.
     * @param manag The manager to designate
     * @param team The team to designate the manager to
     * @return true if the manager was designated, false otherwise
     */
    public boolean designateManager(Manager manag, Team team) {
        if (!(team.getManager() == null)) {
            return false;
        }

        manag.setTeam(team);
        team.addManagers(manag);
        this.addManager(manag);
        return true;
    }

    /**
     * Name: editTeamDetails
     * Purpose: Edits the details of a team.
     * Input: team - The team to edit
     *        newName - The new name of the team
     *        newStadium - The new stadium of the team
     *        newCapacity - The new capacity of the stadium
     * Output: None
     * Effect: Updates the team details.
     * @param team The team to edit
     * @param newName The new name of the team
     * @param newStadium The new stadium of the team
     * @param newCapacity The new capacity of the stadium
     */
    public void editTeamDetails(Team team, String newName, String newStadium, int newCapacity) {
        for (int i = 0; i < Teams.size(); i++) {
            if (Teams.get(i).getName().equals(team.getName()) && Teams.get(i).getStadium().equals(team.getStadium())) {
                Teams.get(i).setName(newName);
                Teams.get(i).setStadium(newStadium);
                Teams.get(i).setCapacity(newCapacity);
                break;
            }
        }
    }

    /**
     * Name: editPlayerDetails
     * Purpose: Edits the details of a player.
     * Input: player - The player to edit
     *        newName - The new name of the player
     *        newAddress - The new address of the player
     *        newDOB - The new date of birth of the player
     *        newNationality - The new nationality of the player
     *        newSalary - The new salary of the player
     *        newPosition - The new position of the player
     * Output: None
     * Effect: Updates the player details.
     * @param player The player to edit
     * @param newName The new name of the player
     * @param newAddress The new address of the player
     * @param newDOB The new date of birth of the player
     * @param newNationality The new nationality of the player
     * @param newSalary The new salary of the player
     * @param newPosition The new position of the player
     */
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

    /**
     * Name: editManagerDetails
     * Purpose: Edits the details of a manager.
     * Input: manager - The manager to edit
     *        newName - The new name of the manager
     *        newAddress - The new address of the manager
     *        newDOB - The new date of birth of the manager
     *        newNationality - The new nationality of the manager
     *        newSalary - The new salary of the manager
     *        newBonusPercentage - The new bonus percentage of the manager
     *        newQualifications - The new qualifications of the manager
     * Output: None
     * Effect: Updates the manager details.
     * @param manager The manager to edit
     * @param newName The new name of the manager
     * @param newAddress The new address of the manager
     * @param newDOB The new date of birth of the manager
     * @param newNationality The new nationality of the manager
     * @param newSalary The new salary of the manager
     * @param newBonusPercentage The new bonus percentage of the manager
     * @param newQualifications The new qualifications of the manager
     */
    public void editManagerDetails(Manager manager, String newName, String newAddress, String newDOB, String newNationality, double newSalary, double newBonusPercentage, String newQualifications) {
        manager.setName(newName);
        manager.setAddress(newAddress);
        manager.setDob(newDOB);
        manager.setNationality(newNationality);
        manager.setSalary(newSalary);
        manager.setBonusPercentage(newBonusPercentage);
        manager.setQualifications(newQualifications);

        for (Manager m : Managers) {
            if (m.getId() == manager.getId()) {
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

    /**
     * Name: transferPlayer
     * Purpose: Transfers a player from one team to another.
     * Input: player - The player to transfer
     *        sourceTeam - The source team
     *        targetTeam - The target team
     * Output: None
     * Effect: Transfers the player from the source team to the target team.
     * @param player The player to transfer
     * @param sourceTeam The source team
     * @param targetTeam The target team
     */
    public void transferPlayer(Player player, Team sourceTeam, Team targetTeam) {
        // Remove player from source team
        this.removePlayer(player);

        // Set player's team to target team
        player.setTeam(targetTeam);

        // Add player to target team
        targetTeam.addPlayers(player);
    }

    /**
     * Name: generatePayrollReport
     * Purpose: Generates a payroll report for the league.
     * Input: None
     * Output: None
     * Effect: Creates a payroll report and saves it to a file.
     */
    public void generatePayrollReport() {
        FileOutputStream fos = null;
        File pay_report_fil = new File("payroll.txt");
        SportsLeague sp = null;

        try {
            sp = new SportsLeague();
        } catch (IOException ex) {
            Logger.getLogger(Main_Page.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (!pay_report_fil.exists()) {
            try {
                pay_report_fil.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Main_Page.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                pay_report_fil.delete();
                pay_report_fil.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Main_Page.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        PrintStream bw = null;
        try {
            bw = new PrintStream(pay_report_fil);
        } catch (IOException ex) {
            Logger.getLogger(Main_Page.class.getName()).log(Level.SEVERE, null, ex);
        }

        DecimalFormat df = new DecimalFormat("#.#");
        double teamtotal = 0;
        double total_league = 0;

        for (int i = 0; i < sp.getTeams().size(); i++) {
            bw.append(sp.getTeams().get(i).getName() + '\n');
            if (sp.getTeams().get(i).getManager() != null) {
                bw.append(sp.getTeams().get(i).getManager().getId() + " " +
                        sp.getTeams().get(i).getManager().getName() + " " +
                        df.format(sp.getTeams().get(i).getManager().getSalary() / 26) + '\n');
                teamtotal += sp.getTeams().get(i).getManager().getSalary() / 26;
            }

            bw.append("Players:" + '\n');
            for (int j = 0; j < sp.getTeams().get(i).getPlayers().size(); j++) {
                bw.append(sp.getTeams().get(i).getPlayers().get(j).getId() + " " +
                        sp.getTeams().get(i).getPlayers().get(j).getName() + " " +
                        df.format(sp.getTeams().get(i).getPlayers().get(j).getSalary() / 26) + '\n');
                teamtotal += sp.getTeams().get(i).getPlayers().get(j).getSalary() / 26;
            }

            bw.append("--------------------------------------------------------------------------------------------" + '\n');
            bw.append("Team Total: " + df.format(teamtotal) + '\n');
            bw.append("--------------------------------------------------------------------------------------------" + '\n');
            total_league += teamtotal;
            teamtotal = 0;
        }

        bw.append('\n');
        bw.append("The Total League: " + df.format(total_league));
        total_league = 0;

        // Show success message
        JOptionPane.showMessageDialog(null, "Pay Report has been saved in your project folder!!!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Name: getUnassign_players
     * Purpose: Retrieves the list of unassigned players.
     * Input: None
     * Output: List of unassigned players
     * Effect: Provides access to the unassigned players list.
     * @return List of unassigned players
     */
    public ArrayList<Player> getUnassign_players() {
        return unassign_players;
    }

    /**
     * Name: getTeams
     * Purpose: Retrieves the list of teams.
     * Input: None
     * Output: List of teams
     * Effect: Provides access to the teams list.
     * @return List of teams
     */
    public ArrayList<Team> getTeams() {
        return Teams;
    }

    /**
     * Name: setTeams
     * Purpose: Sets the list of teams.
     * Input: Teams - The list of teams to set
     * Output: None
     * Effect: Updates the teams list.
     * @param Teams The list of teams to set
     */
    public void setTeams(ArrayList<Team> Teams) {
        this.Teams = Teams;
    }

    /**
     * Name: getManagers
     * Purpose: Retrieves the list of managers.
     * Input: None
     * Output: List of managers
     * Effect: Provides access to the managers list.
     * @return List of managers
     */
    public ArrayList<Manager> getManagers() {
        return Managers;
    }
    
    /**
     * Name: loadSerializedData
     * Purpose: Loads the league data from the serialized files.
     * Input: None
     * Output: None
     * Effect: Populates the lists from serialized files if they exist.
     */
    private void loadSerializedData() {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (file.length() > 0) {
            try (FileInputStream fis = new FileInputStream(file);
                 ObjectInputStream in = new ObjectInputStream(fis)) {

                while (true) {
                    try {
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

        if (!file_play.exists()) {
            try {
                file_play.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(SportsLeague.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        try (FileInputStream fisp = new FileInputStream(file_play)) {
            if (file_play.length() > 0) {
                try (ObjectInputStream osp = new ObjectInputStream(fisp)) {
                    while (true) {
                        try {
                            ArrayList<Player> playersInFile = (ArrayList<Player>) osp.readObject();
                            unassign_players.addAll(playersInFile);
                        } catch (ClassNotFoundException | EOFException ex) {
                            break;
                        }
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(SportsLeague.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (!file_managers.exists()) {
            try {
                file_managers.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(SportsLeague.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        try (FileInputStream fisM = new FileInputStream(file_managers)) {
            if (file_managers.length() > 0) {
                try (ObjectInputStream osM = new ObjectInputStream(fisM)) {
                    while (true) {
                        try {
                            ArrayList<Manager> managersInFile = (ArrayList<Manager>) osM.readObject();
                            Managers.addAll(managersInFile);
                        } catch (ClassNotFoundException | EOFException ex) {
                            break;
                        }
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(SportsLeague.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
