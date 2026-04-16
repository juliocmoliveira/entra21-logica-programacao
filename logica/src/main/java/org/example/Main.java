package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de Alunos: ");
        int quantidadeAlunos = scanner.nextInt();
        scanner.nextLine();

        String[] nomesAlunos = new String[quantidadeAlunos];
        double[] notas1 = new double[quantidadeAlunos];
        double[] notas2 = new double[quantidadeAlunos];

        double mediaGeral = 0;

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Digite o nome do aluno " + (i+1) + ": ");
            nomesAlunos[i] = scanner.nextLine();
            System.out.println("Digite a primeira nota do aluno: " + (i+1) + ": ");
            notas1[i] = scanner.nextDouble();
            System.out.println("Digite a segunda nota do aluno: " + (i+1) + ": ");
            notas2[i] = scanner.nextDouble();
            scanner.nextLine();

            double media = (notas1[i] + notas2[i]) / 2;
            System.out.println("A média do aluno " + nomesAlunos[i] + " é: " +  media);

            if (media >= 7) {
                System.out.println("Aluno aprovado");
            } else {
                System.out.println("Aluno reprovado");
            }

            double maiorNota;
            double menorNota;

            if (notas1[i] > notas2[i]) {
                maiorNota = notas1[i];
                menorNota = notas2[i];
            } else {
                maiorNota = notas2[i];
                menorNota = notas1[i];
            }

            System.out.println("A maior nota do aluno " + nomesAlunos[i] + " é: " + maiorNota);
            System.out.println("A menor nota do aluno " + nomesAlunos[i] + " é: " + menorNota);

            mediaGeral = mediaGeral + media;
        }

        mediaGeral = mediaGeral / quantidadeAlunos;
        System.out.println("A média geral é: " + mediaGeral);
    }
}

