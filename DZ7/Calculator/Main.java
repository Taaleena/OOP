package DZ7.Calculator;

public class Main {
    public static void main(String[] args) {
        MCalculableFactura calculableFactory = new CalculableFactura();
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}
