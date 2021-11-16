package programacao.funcional;

public class Context {

    public static double execute(double a, double b, Strategy strategy) {
        return strategy.apply(a, b);
    }
}
