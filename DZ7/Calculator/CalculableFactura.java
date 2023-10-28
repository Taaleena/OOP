package DZ7.Calculator;

public class CalculableFactura {
    public Calculable create(int primaryArg, boolean logFlag) {
        if (logFlag) {
            Calculable calculator =  new Calculator(primaryArg);
            return new LogCalculator(calculator);
        }
        return new Calculator(primaryArg);
    }
}