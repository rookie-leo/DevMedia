package programacao.restritiva;

public class Pessoa {

    private final String nome;
    private final String sobrenome;
    private final String documento;

    public static class Builder {

        private final String nome;
        private final String sobrenome;

        private String documento = ""; //null safe

        public Builder(String nome, String sobrenome) {
            this.nome = nome;
            this.sobrenome = sobrenome;
        }

        public Builder documento(String documento) {
            this.documento = documento;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(this);
        }

    }

    private Pessoa (Builder builder) {
        this.nome = builder.nome;
        this.sobrenome = builder.sobrenome;
        this.documento = builder.documento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", documento='" + documento + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa.Builder("Nome", "Sobrenome").build();

        Pessoa pessoa1 = new Builder("João", " da Silva").documento("12345678912").build();

        System.out.println(pessoa);
        System.out.println(pessoa1);
    }
}
