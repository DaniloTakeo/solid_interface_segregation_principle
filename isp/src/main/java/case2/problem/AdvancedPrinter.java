package case2.problem;

public class AdvancedPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Impressora avançada imprimindo...");
    }
    
    @Override
    public void scan() {
        System.out.println("Impressora avançada escaneando...");
    }
    
    @Override
    public void fax() {
        System.out.println("Impressora avançada enviando fax...");
    }
}