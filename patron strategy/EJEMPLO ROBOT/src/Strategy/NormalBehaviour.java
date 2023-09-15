package Strategy;

public class NormalBehaviour implements RobotBehaviour {

    @Override
    public String toString() {
        return "Normal Behavior if find another robot ignore it";
    }

    @Override
    public int moveCommand() {
        return 0;
    }

    
}
