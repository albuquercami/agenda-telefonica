package ucs.exerciciosDiversosI;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        float temperatura, resultado;

        System.out.println("Escolha a opção de conversão:");
        System.out.println("1 – Fahrenheit para Celsius");
        System.out.println("2 – Celsius para Fahrenheit");
        System.out.print("Digite sua opção (1 ou 2): ");
        opcao = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite a temperatura: ");
        temperatura = Float.parseFloat(scanner.nextLine());

        if (opcao == 1) {
            resultado = converterParaCelsius(temperatura);
            System.out.println("Temperatura em Celsius: " + resultado);
        } else if (opcao == 2) {
            resultado = converterParaFahrenheit(temperatura);
            System.out.println("Temperatura em Fahrenheit: " + resultado);
        } else {
            System.out.println("Opção inválida.");
        }
    }

    public static float converterParaCelsius(float f) {
        return 5 * (f - 32) / 9;
    }

    public static float converterParaFahrenheit(float c) {
        return (9 * c / 5) + 32;
    }

}
