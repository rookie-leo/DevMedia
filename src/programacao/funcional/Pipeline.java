package programacao.funcional;

import java.util.ArrayList;
import java.util.List;

public class Pipeline {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) list.add(i);

        int soma = list.stream()
                .filter(i -> i % 2 == 1)
                .map(i -> i * 2)
                .reduce(0, (a, b) -> a + b);

        System.out.println(soma);

    }

}
