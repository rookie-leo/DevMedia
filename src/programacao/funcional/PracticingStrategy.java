package programacao.funcional;

public class PracticingStrategy {

	public static void main(String[] args) {
		Context context = new Context(new Maximo());
        System.out.println(context.execute(3, 4));

        context = new Context(new Minimo());
        System.out.println(context.execute(3, 4));

        context = new Context(new Media());
        System.out.println(context.execute(10, 7));
	}

}

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

class Context {
	private final Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public double execute(double a, double b) {
		return this.strategy.apply(a, b);
	}
}
