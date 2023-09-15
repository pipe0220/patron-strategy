package Strategy;

public class AgressiveBehaviour implements RobotBehaviour {

    @Override
    public String toString() {
        return "Agressive Behaviour if find another robot attack for it";
    }

    @Override
    public int moveCommand() {
        return 1;
    }
    
}
