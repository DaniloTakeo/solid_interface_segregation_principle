package case2.solution;

public class AdvancedPrinter implements Printable, Scannable, Faxable {
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