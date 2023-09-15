package Strategy;

public class DefensiveBehaviour implements RobotBehaviour {

    @Override
    public String toString() {
        return "Defensive Behavior if find another robot run for it ";
    }

    @Override
    public int moveCommand() {
        return -1;
    }
    
}
