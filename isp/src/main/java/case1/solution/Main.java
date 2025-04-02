package case1.solution;

public class Main {
    public static void main(String[] args) {
        HumanWorker human = new HumanWorker();
        human.work();
        human.eat();
        human.sleep();
        
        RobotWorker robot = new RobotWorker();
        robot.work();
    }
}