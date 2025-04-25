package Ex_05;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int velocidadeAtual;

    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0;
    }

    public void acelerar() {
        velocidadeAtual += 10;
    }

    public void frear() {
        velocidadeAtual -= 10;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }
}

