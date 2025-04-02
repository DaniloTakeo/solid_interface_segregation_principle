package case1.problem;

public class Main {
    public static void main(String[] args) {
        Worker human = new HumanWorker();
        human.work();
        human.eat();
        human.sleep();
        
        Worker robot = new RobotWorker();
        robot.work();
        robot.eat(); // Vai lançar exceção
    }
}
