package Ex_04;

import java.util.Scanner;

public class MainJogador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do jogador: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a pontuação inicial: ");
        int pontuacaoInicial = scanner.nextInt();

        System.out.print("Digite o nível inicial: ");
        int nivelInicial = scanner.nextInt();

        Jogador jogador = new Jogador(nome, pontuacaoInicial, nivelInicial);

        jogador.exibirInfo();

        System.out.print("\nDigite quantos pontos o jogador ganhou: ");
        int pontos = scanner.nextInt();
        jogador.aumentarPontuacao(pontos);

        System.out.println("Subindo de nível...");
        jogador.subirNivel();

        jogador.exibirInfo();

        scanner.close();
    }
}
