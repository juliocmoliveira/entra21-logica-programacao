package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcao = 0;

        while(opcao != 5) {
            System.out.println("1. Calcular media de notas.");
            System.out.println("2. Verificar par ou impar.");
            System.out.println("3. Converter temperatura C -> F");
            System.out.println("4. Calculadora simples.");
            System.out.println("5. Sair.");

            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();

            double primeiroNumero;
            double segundoNumero;

            switch (opcao) {
                case 1: {
                    System.out.println("Digite a primeira nota");
                    primeiroNumero = scanner.nextDouble();
                    System.out.println("Digite a segunda nota");
                    segundoNumero = scanner.nextDouble();
                    double media = (primeiroNumero + segundoNumero) / 2;
                    System.out.println("A média das notas é: " + media);
                    break;
                }
                case 2: {
                    System.out.println("Digite o número para verificação: ");
                    int numero = scanner.nextInt();

                    String resultado = (numero%2 == 0) ? "Par" : "Ímpar";
                    System.out.println("Esse número é: " + resultado);
                    break;
                }
                case 3: {
                    System.out.println("Digite a temperatura em Celsius.");
                    double temperaturaEmCelsius = scanner.nextDouble();
                    double temperaturaFahrenheit = temperaturaEmCelsius * 1.8 + 32;
                    System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);
                    break;
                }
                case 4: {
                    System.out.println("Digite o primeiro número a ser calculado: ");
                    primeiroNumero = scanner.nextDouble();
                    System.out.println("Digite o segundo número a ser calculado: ");
                    segundoNumero = scanner.nextDouble();
                    System.out.println("A soma dos números é: " + (primeiroNumero + segundoNumero));
                    System.out.println("A subtração dos números é: " + (primeiroNumero - segundoNumero));
                    System.out.println("A divisão dos números é: " + (primeiroNumero / segundoNumero));
                    System.out.println("A multiplicação dos números é: " + (primeiroNumero * segundoNumero));
                    break;
                }
                case 5: {
                    System.out.println("Saindo do sistema...");
                    opcao = 5;
                    break;
                }
            }
        }
    }
}

