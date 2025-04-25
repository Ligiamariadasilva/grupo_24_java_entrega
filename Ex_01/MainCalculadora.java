package Ex_01;

import java.util.Scanner;

public class MainCalculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double x = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double y = scanner.nextDouble();

        System.out.println("Escolha a operação: +  -  *  /");
        System.out.print("Operação: ");
        char operacao = scanner.next().charAt(0);

        double resultado;
        switch (operacao) {
            case '+':
                resultado = Calculadora.somar(x, y);
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = Calculadora.subtrair(x, y);
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = Calculadora.multiplicar(x, y);
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                resultado = Calculadora.dividir(x, y);
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("Operação inválida.");
        }

        scanner.close();
    }
}

