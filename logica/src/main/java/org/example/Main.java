package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int senhaCorreta = 1234;
        int senhaLida;
        int tentativas = 0;


        do {
            System.out.println("Digite a senhaCorreta: ");
            senhaLida = scanner.nextInt();
        } while (senhaCorreta != senhaLida);

        //feature 1
        while (tentativas < 5) {
            System.out.println("Digite a senha Correta: ");
            senhaLida = scanner.nextInt();

            if (senhaCorreta == senhaLida) {
                System.out.println("Cofre aberto");
                System.out.println("Cofre fechado");
                System.out.println("Cofre fechado");
                break;
            }

            tentativas++;
        }
    }
}

