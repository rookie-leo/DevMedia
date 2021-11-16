package aula.intermediario.excecoes;

public class Main {

    public static void main(String[] args) {

        try {
            ItemVenda camisa = new ItemVenda();
            camisa.setDescricao("Camisa Polo");
            camisa.setPreco(30.0);

            ItemVenda bone = new ItemVenda();
            bone.setDescricao("Noné Infantil");
            bone.setPreco(21.0);

            Venda venda = new Venda();
            venda.adicionar(camisa);
            venda.adicionar(bone);

            System.out.println("Total da venda: " + venda.getTotal());
        } catch (VendaException e) {
            e.printStackTrace();//Mostra onde a excecao eh levantada

            System.out.println("Erro ao processar total: "
                + e.getMessage()//Nao eh uma boa pratica utilizar o metodo getMessage
                + " - Codigo: "
                + e.getCodigo());
        } catch (RuntimeException e) {
            System.out.println("Erro em tempo de execução: " + e.getMessage());
        } finally {
            System.out.println("Processamento encerrado");
        }
    }
}
