package Ex_08;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Pizza pizza;
    private String tamanho;
    private String enderecoEntrega;
    private boolean cancelado;

    private static List<Pedido> todosPedidos = new ArrayList<>();

    public Pedido(Pizza pizza, String tamanho, String enderecoEntrega) {
        this.pizza = pizza;
        this.tamanho = tamanho;
        this.enderecoEntrega = enderecoEntrega;
        this.cancelado = false;
        todosPedidos.add(this);
    }

    public void cancelarPedido() {
        this.cancelado = true;
        System.out.println("Pedido cancelado com sucesso.");
    }

    public void exibirPedido() {
        if (!cancelado) {
            System.out.println("=== Pedido ===");
            pizza.exibirInformacoes();
            System.out.println("Tamanho: " + tamanho);
            System.out.println("Endereço de entrega: " + enderecoEntrega);
            System.out.println("------------------------");
        }
    }

    public static void gerarRelatorio() {
        System.out.println("=== RELATÓRIO DE PEDIDOS ===");
        double soma = 0;
        int total = 0;

        for (Pedido p : todosPedidos) {
            if (!p.cancelado) {
                p.exibirPedido();
                soma += p.pizza.getValor();
                total++;
            }
        }

        System.out.println("Total de pedidos realizados: " + total);
        if (total > 0) {
            System.out.println("Média de preço dos pedidos: R$" + (soma / total));
        }
    }
}
