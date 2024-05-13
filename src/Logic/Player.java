
import java.util.*;

/**
 * 
 */
public class Player extends Person {

    
    private String position;
    private boolean isCaptain;
    private Team team;
    public Player() {
        
        
        
    }

    public String getPosition() 
    {
        return position;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

    public boolean isIsCaptain() 
    {
        return isCaptain;
    }

    public void setIsCaptain(boolean isCaptain) 
    {
        this.isCaptain = isCaptain;
    }

    public Team getTeam() 
    {
        return team;
    }

    public void setTeam(Team team) 
    {
        this.team = team;
    }
}

