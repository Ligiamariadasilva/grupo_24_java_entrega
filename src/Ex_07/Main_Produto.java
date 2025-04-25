package Main;

import Ex_07.Produto;

public class Main_Produto {
    public static void main(String[] args) {
        Produto p1 = new Produto("Café", "CF001", 9.90, 50);
        Produto p2 = new Produto("Açúcar", "AC002", 4.50, 30);

        p1.adicionarEstoque(10);
        p2.removerEstoque(5);

        System.out.println("=== PRODUTO 1 ===");
        p1.exibirInfo();

        System.out.println("\n=== PRODUTO 2 ===");
        p2.exibirInfo();
    }
}

