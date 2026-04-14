package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());

        Scanner scanner = new Scanner(System.in);
        boolean jogarDnv = true;

        while(jogarDnv) {
            int numeroSecreto = (int) (Math.random() * 100) + 1;
            int input;
            int tentativas = 0;
            int limite = 10;

            System.out.println("====== JOGO DA ADIVINHAÇÃO =======");
            System.out.println("Tentativas disponíveis: " + limite);
            System.out.println("Insira um número de 1 a 100");

            do {
                System.out.println("Tentativa " + (tentativas + 1) + "/" + limite);
                input = scanner.nextInt();
                tentativas++;

                if (input == numeroSecreto) {
                    System.out.println("Parabéns! Acertou em: " + tentativas + " tentativas");
                    break;
                } else if (input < numeroSecreto) {
                    System.out.println("O número está abaixo do correto.");
                } else {
                    System.out.println("O número está a cima do correto.");
                }

                if (tentativas == limite) {
                    System.out.println("O número é: " + numeroSecreto);
                }
            }
            while (tentativas < limite);
            System.out.println("Voce deseja jogar novamente?");
            System.out.println("1 - SIM");
            System.out.println("2 - NAO");
            int opt = scanner.nextInt();
            if(opt == 1){
                System.out.println("COMEÇANDO O JOGO NOVAMENTE");
                jogarDnv = true;
            } else {
                jogarDnv = false;
            }
        }
        System.out.println("FIM DE JOGO");
    }
}