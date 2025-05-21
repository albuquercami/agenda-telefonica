package agenda_de_contatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Contato> agenda = new ArrayList<Contato>();

        while(true){
            mostrarMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1:
                    adicionarContato(agenda, scanner);
                    break;
                case 2:
                    listarContatos(agenda);
                    break;
                case 3:
                    buscarContato(agenda, scanner);
                    break;
                case 4:
                    removerContato(agenda, scanner);
                    break;
                case 5:
                    printLinha();
                    System.out.println("Saindo...");
                    return;
                default:
                    printLinha();
                    System.out.println("Opção inválida. Tente novamente.");
                    printLinha();
                    break;
            }
        }

    }
    public static void mostrarMenu(){
        System.out.println("Menu da agenda de Contatos:");
        System.out.println("[1] Adicionar contato");
        System.out.println("[2] Listar contatos");
        System.out.println("[3] Buscar contato");
        System.out.println("[4] Remover contato");
        System.out.println("[5] Sair");
    }
    public static void adicionarContato(List<Contato> agenda, Scanner scanner){
        System.out.println("Digite o nome do contato:");
        String nome = scanner.nextLine();

        System.out.println("Digite o telefone do contato:");
        String telefone = scanner.nextLine();

        System.out.println("Digite o e-mail do contato:");
        String email = scanner.nextLine();

        Contato novoContato = new Contato(nome, telefone, email);
        agenda.add(novoContato);
        printLinha();
        System.out.println("Contato adicionado com sucesso!");
        printLinha();
    }
    public static void listarContatos(List<Contato> agenda){
        printLinha();
        for (int i = 0; i < agenda.size(); i++) {
            System.out.println("Contato " + (i + 1) + ":");
            System.out.println(agenda.get(i).toString());
            printLinha();
        }
    }
    public static void buscarContato(List<Contato> agenda, Scanner scanner){
        System.out.println("Digite o nome do contato que deseja buscar:");
        String procurar = scanner.nextLine();
        boolean encontrado = false;
        for (Contato contato : agenda) {
            if (procurar.equals(contato.getNome())) {
                printLinha();
                System.out.println("Contato encontrado!");
                System.out.println(contato.toString());
                printLinha();
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            printLinha();
            System.out.println("Contato não encontrado.");
            printLinha();
        }
    }
    public static void removerContato(List<Contato> agenda, Scanner scanner){
        System.out.println("Digite o nome do contato que deseja remover:");
        String procurar = scanner.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < agenda.size(); i++) {
            if (procurar.equals(agenda.get(i).getNome())){
                agenda.remove(i);
                printLinha();
                System.out.println("Contato removido com sucesso!");
                printLinha();
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            printLinha();
            System.out.println("Contato não encontrado.");
            printLinha();
        }
    }

    public static void printLinha(){
        System.out.println("-------------------------------------");
    }



}
