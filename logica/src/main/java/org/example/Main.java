package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do Aluno:");
        String nomeAluno = scanner.nextLine();

        System.out.println("Digite as duas notas:");
        double primeiraNota = scanner.nextDouble();
        double segundaNota = scanner.nextDouble();

        double media = (primeiraNota + segundaNota) / 2;
        String situacao;

        if (media >= 7) {
            situacao = "APROVADO";
        } else if (media >= 5) {
            situacao = "RECUPERAÇÃO";
        } else {
            situacao = "REPROVADO";
        }

        System.out.println("Nome do aluno: " + nomeAluno + ", Média: " + media + ", Situação: " + situacao);
    }

}
