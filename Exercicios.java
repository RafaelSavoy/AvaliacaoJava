package AvaliacaoJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {

        System.out.println("Insira o primeiro número:");

        double num1 = sc.nextDouble();

        System.out.println("Insira o segundo número:");

        double num2 = sc.nextDouble();

        System.out.println(" ");
        System.out.println("Selecione a operação desejada:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação:");
        System.out.println("4 - Divisão");
        System.out.println("5 - Resto da divisão");
        System.out.println(" ");

        int operation = sc.nextInt();

        if (operation == 4 && num2 == 0) {
            System.out.println("Não é possível dividir por 0");
            return;
        }

        double result = 0;

        switch (operation) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            case 5:
                result = num1 % num2;
                break;
            default:
                System.out.println("A operação informada não é válida");
                return;
        }
        System.out.println("O resultado da operação é: " +
                result);
    }

    public void exercicio2() {
        // Critério: último número da matricula
        System.out.println("Insira o numero da matrícula");
        int numeroDaMatricula = sc.nextInt();

        if (numeroDaMatricula % 4 == 0) {
            System.out.println("Time do Chris");
        } else if (numeroDaMatricula % 4 == 1) {
            System.out.println("Time do Greg");
        } else if (numeroDaMatricula % 4 == 2) {
            System.out.println("Time do Caruso");
        } else if (numeroDaMatricula % 4 == 3) {
            System.out.println("Time do Jerome");
        }
    }

    public void exercicio3() {
        System.out.println("Bem vindo a quitanda do seu madruga!!");
        System.out.println(" ");
        System.out.println("Tabela de preços:");
        System.out.println("Morangos: R$ 2,50 o kilo;");
        System.out.println("Maças: R$ 1,80 o kilo;");
        System.out.println("Bananas: R$ 1,30 o kilo;");
        System.out.println(" ");
        System.out.println("Informe quantos kg de morango você deseja: ");
        double morangosKg = sc.nextDouble();
        System.out.println("Insira quantos kgs de maça você deseja:");
        double macasKg = sc.nextDouble();
        System.out.println("Insira quantos kgs de banana você deseja:");
        double bananaKg = sc.nextDouble();

        double totalMorango = morangosKg * 2.50;
        double totalMaca = macasKg * 1.80;
        double totalBanana = bananaKg * 1.30;

        double totalPreco = totalBanana + totalMaca + totalMorango;
        double totalKg = morangosKg + macasKg + bananaKg;

        System.out.println(" ");
        System.out.println("Sua compra: ");
        System.out.println("Morango: R$" + new DecimalFormat("#,##0.00").format(totalMorango));
        System.out.println("Maça: R$" + new DecimalFormat("#,##0.00").format(totalMaca));
        System.out.println("Banana: R$" + new DecimalFormat("#,##0.00").format(totalBanana));

        if (totalPreco > 25 || totalKg > 8) {
            double novoTotal = totalPreco - (totalPreco / 10);
            System.out.println("Você recebeu um desconto de 10% na sua compra!");
            System.out.println("Valor sem desconto: R$" + new DecimalFormat("#,##0.00").format(totalPreco));
            System.out.println(
                    "Valor com desconto: R$" + new DecimalFormat("#,##0.00").format(novoTotal));
        } else {
            System.out.println("O valor a ser pago é: R$" + new DecimalFormat("#,##0.00").format(totalPreco));
        }
    }
}