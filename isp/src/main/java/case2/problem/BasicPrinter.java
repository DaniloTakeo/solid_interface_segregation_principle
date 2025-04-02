package case2.problem;

public class BasicPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Impressora básica imprimindo...");
    }
    
    @Override
    public void scan() {
        throw new UnsupportedOperationException("Impressora básica não pode escanear!");
    }
    
    @Override
    public void fax() {
        throw new UnsupportedOperationException("Impressora básica não pode enviar fax!");
    }
}
