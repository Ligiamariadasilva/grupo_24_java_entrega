package Ex_02;

import java.util.Scanner;

public class MainLivro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite o autor do livro: ");
        String autor = scanner.nextLine();

        System.out.print("Digite o ano de publicação: ");
        int ano = scanner.nextInt();

        Livro livro = new Livro(titulo, autor, ano);

        livro.exibirInfo();

        scanner.close();
    }
}
