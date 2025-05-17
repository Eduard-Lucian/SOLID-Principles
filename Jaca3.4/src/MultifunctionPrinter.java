public class MultifunctionPrinter implements Printer, Scanner, Fax {

    @Override
    public void print(String document) {
        System.out.println("MultifunctionPrinter imprimă: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("MultifunctionPrinter scanează: " + document);
    }

    @Override
    public void fax(String document) {
        System.out.println("MultifunctionPrinter trimite fax: " + document);
    }
}
