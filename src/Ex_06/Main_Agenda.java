package Main;

import Ex_06.Agenda;
import Ex_06.Contato;

public class Main_Agenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Contato contato1 = new Contato("Ligia", "99999-1234");
        Contato contato2 = new Contato("Maria", "98888-5678");

        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);

        System.out.println("📒 Todos os contatos:");
        agenda.listarTodos();

        System.out.println("\n🔍 Buscando 'Ligia':");
        agenda.buscarContatoPorNome("Ligia");

        System.out.println("\n🔍 Buscando 'João':");
        agenda.buscarContatoPorNome("João");
    }
}

