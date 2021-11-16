package aula.basico.estrutura.repeticao;

public class Break {
    public static void main(String[] args) {
        String conta = "00-234-2333";
        int posicao = conta.length();

        while(posicao < conta.length()) {
            char c = conta.charAt(posicao);

            if(c == '-') {
                break;
            }

            posicao--;

        }
        System.out.println(conta.substring(7, posicao));
        System.out.println(isPar());
    }

    public static boolean isPar(){
        return 2 % 2 == 0;
    }
}
