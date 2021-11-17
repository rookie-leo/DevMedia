package programacao.funcional;

public class FatorialRecursivo {

    public static void main(String[] args) {

        long fatorial = 10;
        int count = 1;
        long resultado = 1;

        while (count <= fatorial) {
            resultado *= count;

            count++;
        }

        System.out.println("Fatorial = " + resultado);

    }

}
