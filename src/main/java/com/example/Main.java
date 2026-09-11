package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEMA DE CONSULTA DE BENEFÍCIOS ===");

        System.out.print("Nome do colaborador: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("Salário: ");
        double salario = sc.nextDouble();

        System.out.print("Tempo de empresa em anos: ");
        int tempoEmpresa = sc.nextInt();

        System.out.print("Quantidade de filhos: ");
        int quantidadeFilhos = sc.nextInt();

        sc.nextLine();

        System.out.print("Modalidade de trabalho (presencial ou home office): ");
        String modalidade = sc.nextLine();

        System.out.print("Utiliza veículo próprio (sim ou não): ");
        String veiculoProprio = sc.nextLine();

        System.out.println();
        System.out.println("=== BENEFÍCIOS DE " + nome + " ===");

        if (salario <= 5000) {
            System.out.println("Vale-alimentação: Tem direito.");
        } else {
            System.out.println("Vale-alimentação: Não tem direito.");
        }

        if (quantidadeFilhos > 0) {
            System.out.println("Auxílio-creche: Tem direito.");
        } else {
            System.out.println("Auxílio-creche: Não tem direito.");
        }

        if (idade >= 18 && tempoEmpresa >= 1) {
            System.out.println("Plano de saúde: Elegível.");
        } else {
            System.out.println("Plano de saúde: Não elegível.");
        }

        if (modalidade.equalsIgnoreCase("home office")) {
            System.out.println("Auxílio home office: Tem direito.");
        } else {
            System.out.println("Auxílio home office: Não tem direito.");
        }

        if (modalidade.equalsIgnoreCase("presencial")
                && veiculoProprio.equalsIgnoreCase("sim")) {
            System.out.println("Auxílio combustível: Tem direito.");
        } else {
            System.out.println("Auxílio combustível: Não tem direito.");
        }

        if (tempoEmpresa >= 2) {
            System.out.println("PLR: Pode participar.");
        } else {
            System.out.println("PLR: Não pode participar.");
        }

        if (idade >= 18 && salario <= 5000 && tempoEmpresa >= 1) {
            System.out.println("Bolsa de estudos: Elegível.");
        } else {
            System.out.println("Bolsa de estudos: Não elegível.");
        }

        sc.close();
    }
}