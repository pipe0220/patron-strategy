package Strategy;

public class Robot {
    private RobotBehaviour behavior;
    private String name;

    public Robot() {
    }

    public RobotBehaviour getBehavior() {
        return behavior;
    }

    public void setBehavior(RobotBehaviour behavior) {
        this.behavior = behavior;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move() {
        int command = behavior.moveCommand();
        System.out.println("move command:" + command + "." + behavior.toString());
    }
}
