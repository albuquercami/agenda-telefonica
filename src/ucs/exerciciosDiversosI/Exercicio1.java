package ucs.exerciciosDiversosI;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        float salario = 0, valor_emprestimo = 0, numPrest = 0, valorPrest;
        Scanner scanner = new Scanner(System.in);


        while (salario <= 0) {
            System.out.print("Insira seu salario: ");
            salario = Float.parseFloat(scanner.nextLine());
            if (salario <= 0){
                System.out.println("Erro: o salário deve ser maior que zero.");
            }
        }

        while (valor_emprestimo <= 0) {
            System.out.print("Insira o valor do emprestimo: ");
            valor_emprestimo = Float.parseFloat(scanner.nextLine());
            if (valor_emprestimo <= 0){
                System.out.println("Erro: o valor do empréstimo deve ser maior que zero.");
            }
        }

        while (numPrest <= 0) {
            System.out.print("Insira o número de prestações: ");
            numPrest = Float.parseFloat(scanner.nextLine());
            if (numPrest <= 0){
                System.out.println("Erro: o valor do empréstimo deve ser maior que zero.");
            }
        }

        valorPrest = (valor_emprestimo / numPrest);

        if (valorPrest > ((salario * 30)/100)){
            System.out.println("Valor de prestação deve ser menor que 30% do salário informado.");
        } else if (valorPrest <= ((salario * 30)/100)){
            System.out.println("Empréstimo disponível.");
        }

    }
}
