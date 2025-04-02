package case1.problem;

public class HumanWorker implements Worker {
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
