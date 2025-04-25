package Ex_05;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Uno", 2015, "ABC-1234");

        carro.acelerar();
        carro.acelerar();
        carro.frear();

        carro.exibirInformacoes();
    }
}

