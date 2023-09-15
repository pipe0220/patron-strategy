import Strategy.AgressiveBehaviour;
import Strategy.DefensiveBehaviour;
import Strategy.Robot;

public class App {
    public static void main(String[] args) throws Exception {
    Robot roboto = new Robot();
    roboto.setName("Mr Roboto");
    roboto.setBehavior(new AgressiveBehaviour());
    roboto.move();

    Robot wally = new Robot();
    wally.setName("Mr wally");
    wally.setBehavior(new DefensiveBehaviour());
    wally.move();
    }
}
