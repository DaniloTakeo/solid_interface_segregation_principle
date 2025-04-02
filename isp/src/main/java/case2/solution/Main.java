package case2.solution;

public class Main {
    public static void main(String[] args) {
        Printable basicPrinter = new BasicPrinter();
        basicPrinter.print();
        
        AdvancedPrinter advancedPrinter = new AdvancedPrinter();
        advancedPrinter.print();
        advancedPrinter.scan();
        advancedPrinter.fax();
    }
}
