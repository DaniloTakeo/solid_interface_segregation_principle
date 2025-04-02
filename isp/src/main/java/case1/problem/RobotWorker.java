package case1.problem;

class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Robô trabalhando...");
    }
    
    @Override
    public void eat() {
        // Robôs não comem
        throw new UnsupportedOperationException("Robôs não comem!");
    }
    
    @Override
    public void sleep() {
        // Robôs não dormem
        throw new UnsupportedOperationException("Robôs não dormem!");
    }
}