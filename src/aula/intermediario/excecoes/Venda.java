package aula.intermediario.excecoes;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    List<ItemVenda> itens = new ArrayList<>();

    public void adicionar(ItemVenda itemVenda) {
        if (itemVenda == null) {
            throw new IllegalArgumentException("Item não pode ser nulo");
        }

        itens.add(itemVenda);
    }

    public double getTotal() {
        double total = 0;

        for (ItemVenda item : itens) {
            total += item.getPreco();
        }

        return total;
    }
}
