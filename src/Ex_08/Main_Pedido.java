package Main;

import Ex_08.Pizza;
import Ex_08.Pedido;

import java.util.Arrays;

public class Main_Pedido {
    public static void main(String[] args) {
        Pizza marguerita = new Pizza("Marguerita", 35.0, Arrays.asList("Mussarela", "Tomate", "Manjericão"));
        Pizza calabresa = new Pizza("Calabresa", 40.0, Arrays.asList("Calabresa", "Cebola", "Mussarela"));
        Pizza frangoCatupiry = new Pizza("Frango com Catupiry", 45.0, Arrays.asList("Frango", "Catupiry", "Milho"));

        Pedido p1 = new Pedido(marguerita, "Média", "Rua das Flores, 123");
        Pedido p2 = new Pedido(calabresa, "Grande", "Av. Brasil, 456");
        Pedido p3 = new Pedido(frangoCatupiry, "Pequena", "Rua da Pizza, 789");

        p2.cancelarPedido();

        Pedido.gerarRelatorio();
    }
}

