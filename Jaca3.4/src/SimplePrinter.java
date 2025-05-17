public class SimplePrinter implements Printer {
    @Override
    public void print(String document) {
        System.out.println("Imprimare: " + document);
    }
}
