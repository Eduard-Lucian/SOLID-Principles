public class Main {
    public static void main(String[] args) {
        Printer simplePrinter = new SimplePrinter();
        simplePrinter.print("Document simplu");

        MultifunctionPrinter mfp = new MultifunctionPrinter();
        mfp.print("Document complet");
        mfp.scan("Document complet");
        mfp.fax("Document complet");
    }
}
