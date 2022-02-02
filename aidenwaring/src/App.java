import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        Printer<Integer> myPrinter = new Printer<>(20);
        Printer<String> myPrinter2 = new Printer<>("Hello");
        Printer<Double> myPrinter3 = new Printer<>(20.0);
        myPrinter.print();
        myPrinter2.print();
        myPrinter3.print();

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Hello World");
    }

}
