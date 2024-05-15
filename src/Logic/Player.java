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

    
    
    private static int  ID=0;
    private int Owner_id;
    private String position;
    private boolean isCaptain;
    private Team team;

    public Player() throws IOException, ClassNotFoundException {
            SportsLeague sl = new SportsLeague();
            Owner_id = sl.getAll_Players().size();
        //Owner_id=ID++;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
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
        this.team = team;
    }

    public int getOwner_id() {
        return Owner_id;
    }

    @Override
    public String toString() {
        if(team==null){
                return "ID: "+Owner_id+" Name: "+this.getName()+" Team: N/A";

        }
         if(isCaptain==true){
                return "ID: "+Owner_id+" Name: "+this.getName()+" Team: "+team.getName() +" Captain";
            }
        return "ID: "+Owner_id+" Name: "+this.getName()+" Team: "+team.getName();
    }
    
}
