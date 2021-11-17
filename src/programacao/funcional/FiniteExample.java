package programacao.funcional;

import java.util.stream.IntStream;

public class FiniteExample {

    public static void main(String[] args) {

        long sum = IntStream.iterate(0, n -> n + 1)
                .limit(101)
                .sum();
        System.out.println(sum);

    }

}
