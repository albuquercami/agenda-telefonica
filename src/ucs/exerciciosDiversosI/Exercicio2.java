package ucs.exerciciosDiversosI;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float mesada, valor_produto;


        System.out.print("Insira o valor da mesada: ");
        mesada = Float.parseFloat(scanner.nextLine());

        System.out.print("Deseja  comprar algum produto (S/N)? ");
        char escolha = scanner.nextLine().charAt(0);

        if (escolha == 'S'){
            System.out.print("Qual o valor do produto? ");
            valor_produto = Float.parseFloat(scanner.nextLine());
                if (valor_produto > mesada){
                    System.out.println("Erro: o valor do produto é maior que sua mesada.");
                } else {
                    System.out.println("Saldo restante: " + (mesada - valor_produto));
                }
        } else if (escolha == 'N'){
            System.out.println("Valor da mesada: " + mesada);
        }

    }
}
