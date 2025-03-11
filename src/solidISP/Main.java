package solidISP;

public class Main {
    public static void main(String[] args) {

        SimplePrinter printer = new SimplePrinter();
        printer.print();

        System.out.println("===================================");

        AllinOnePrinter allinOnePrinter = new AllinOnePrinter();
        allinOnePrinter.print();
        allinOnePrinter.scan();
        allinOnePrinter.fax();

    }
}
