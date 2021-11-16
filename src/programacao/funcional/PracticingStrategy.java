package programacao.funcional;

import static programacao.funcional.Context.execute;

public class PracticingStrategy {

    public static void main(String[] args) {

        System.out.println(execute(3, 4, (a, b) -> a > b ? a : b));
		System.out.println(execute(4, 8, (a, b) -> a < b ? a : b));
		System.out.println(execute(7, 5, (a, b) -> (a + b) / 2));

    }

}

@FunctionalInterface
interface Strategy {
    double apply(double a, double b);
}

class Maximo implements Strategy {
    @Override
    public double apply(double a, double b) {
        return a > b ? a : b;
    }
}

class Minimo implements Strategy {
    @Override
    public double apply(double a, double b) {
        return a < b ? a : b;
    }
}

class Media implements Strategy {
    @Override
    public double apply(double a, double b) {
        return (a + b) / 2;
    }
}
