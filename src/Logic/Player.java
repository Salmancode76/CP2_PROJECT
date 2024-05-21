package Logic;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;



import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Player extends Person  {
    
    File file = new File("Players.txt");

    private String position;
    private boolean isCaptain;
    private Team team;

    public Player() throws IOException, ClassNotFoundException {
    super(); // Call the superclass constructor to initialize id

    }

 
    public Player(String name, String address, String dob, String nationality, double salary,String position,  Team team,boolean isCaptain ) throws IOException {
        super(name, address, dob, nationality, salary);       
         if (name == null || address == null || dob == null || nationality == null || position == null || team == null) {
            throw new NullPointerException("Parameters cannot be null");
        }
        this.position = position;
        this.isCaptain = isCaptain;
        this.team = team;
    }

    public Player(String name, String address, String dob, String nationality, double salary,String position,boolean isCaptain ) throws IOException {
        super(name, address, dob, nationality, salary);
         if (name == null || address == null || dob == null || nationality == null || position == null) {
            throw new NullPointerException("Parameters cannot be null");
        }

    }

    public String getPosition() {
        return position;
    }

      public void setPosition(String position) {
        if (position == null) {
            throw new NullPointerException("Position cannot be null");
        }
        this.position = position;
    }

    public boolean isIsCaptain() {
        return isCaptain;
    }

    public void setIsCaptain(boolean isCaptain) {
        this.isCaptain = isCaptain;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        if (team == null) {
            throw new NullPointerException("Team cannot be null");
        }
        this.team = team;
    }

    

    @Override
    public String toString() {
        if(team==null){
                return "ID: "+this.getId()+" Name: "+this.getName()+" Team: N/A";

        }
         if(isCaptain==true){
                return "ID: "+this.getId()+" Name: "+this.getName()+" Team: "+team.getName() +" Captain";
            }
        return "ID: "+this.getId()+" Name: "+this.getName()+" Team: "+team.getName();
    }
    
}
