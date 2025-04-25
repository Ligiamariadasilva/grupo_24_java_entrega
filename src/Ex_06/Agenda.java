package Ex_06;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void buscarContatoPorNome(String nome) {
        boolean encontrado = false;
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.exibirContato();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Contato não encontrado.");
        }
    }

    public void listarTodos() {
        for (Contato contato : contatos) {
            contato.exibirContato();
        }
    }
}

