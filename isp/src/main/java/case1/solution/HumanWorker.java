package case1.solution;

public class HumanWorker implements Workable, Eatable, Sleepable {
    @Override
    public void work() {
        System.out.println("Humano trabalhando...");
    }
    
    @Override
    public void eat() {
        System.out.println("Humano comendo...");
    }
    
    @Override
    public void sleep() {
        System.out.println("Humano dormindo...");
    }
}