package ucs.exerciciosDiversosII;

import java.util.Scanner;

public class numInteiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float num, resultado;

        while (true) {
            System.out.print("Digite um número inteiro: ");
            num = Integer.parseInt(scanner.nextLine());

            if (num <= 0){
                System.out.println("Erro: o número deve ser maior que zero. Tente novamente.");
            } else {
                break; // Sai do loop se o número for válido
            }
        }
        if (num % 2 == 0){
            resultado = num * 2;
            System.out.println("O número é par e foi multiplicado por 2: " + resultado);
        } else {
            resultado = num / 2;
            System.out.println("O número é impar e foi dividido por 2: " + resultado);
        }
    }
}
