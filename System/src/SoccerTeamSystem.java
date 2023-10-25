import java.util.HashMap;
import java.util.Map;

public class SoccerTeamSystem {
    private Map<Integer, PlayerSuperClass> players = new HashMap<>();
    public SoccerTeamSystem(){
    }
    public String registerForward(String name, int shirt, int kickPower, double dribbling){
        if(name.isBlank()) throw new NullPointerException("Invalid forward name!");
        else if(shirt < 0) throw new NullPointerException("Invalid forward shirt number!");
        else if(kickPower < 0) throw new NullPointerException("Invalid forward kickpower!");
        else if(dribbling < 0) throw new NullPointerException("Invalid forward dribbling!");
        players.put(shirt, new Forward(name, shirt, kickPower, dribbling));
        return "Forward player registered in the team!";
    }
    public String registerCenterBack(String name, int shirt, int kickPower, double tackling){
        if(name.isBlank()) throw new NullPointerException("Invalid center back name!");
        else if(shirt < 0) throw new NullPointerException("Invalid center back shirt number!");
        else if(kickPower < 0) throw new NullPointerException("Invalid center back kickpower!");
        else if(tackling < 0) throw new NullPointerException("Invalid center back tackling!");
        players.put(shirt, new CenterBack(name, shirt, kickPower, tackling));
        return "Center back player registered in the team!";
    }
    public String registerMidfield(String name, int shirt, int kickPower, String typeMidfielder){
        if(name.isBlank()) throw new NullPointerException("Invalid player name!");
        else if(shirt < 0) throw new NullPointerException("Invalid player shirt number!");
        else if(kickPower < 0) throw new NullPointerException("Invalid player kickpower!");
        if (!(typeMidfielder.equalsIgnoreCase("right midfielder")) && !(typeMidfielder.equalsIgnoreCase("center midfielder")) && !(typeMidfielder.equalsIgnoreCase("left midfielder"))) throw new NullPointerException("Invalid type of midfielder!");
        players.put(shirt, new Midfield(name, shirt, kickPower, typeMidfielder));
        return "Midfielder player registered in the team!";
    }
}
