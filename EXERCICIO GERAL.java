package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*Exercicio 1*/
        Scanner sc = new Scanner(System.in);
        float salarioIf;
        float abonoSf;
        float novoSalariof;

        System.out.println("Escreva o salario: ");
        salarioIf = sc.nextFloat();
        System.out.println("Escreva o abono: ");
        abonoSf = sc.nextFloat();
        novoSalariof = salarioIf + abonoSf;
         System.out.println("Seu salario novo e : " +novoSalariof );



        /* Exercicio 2*/
        Scanner sc = new Scanner(System.in);
        float Nota1f;
        float Nota2f;
        float Nota3f;
        float Nota4f;
        float mediaf;

        System.out.println("Digite a sua primeira nota: ");
        Nota1f = sc.nextFloat();

        System.out.println("Digite a sua segunda nota: ");
        Nota2f = sc.nextFloat();

        System.out.println("Digite a sua terceira nota: ");
        Nota3f = sc.nextFloat();

        System.out.println("Digite a sua quarta nota: ");
        Nota4f = sc.nextFloat();

        mediaf = (Nota1f+Nota2f+Nota3f+Nota4f)/4;
        System.out.printf("A sua média final é: %.1f ", mediaf);


        /* Exercicio 3 */
        Scanner sc = new Scanner(System.in);
        float salarioBrutof;
        float adicionalNoturnof;
        float horasExtrasf;
        float descontosf;
        float salarioLiquidof;

        System.out.println("################# MENU PARA CALCULO DE SALARIO #################");
        System.out.println("\n ")
        System.out.println("Digite o seu salario bruto: ");
        salarioBrutof = sc.nextFloat();
        System.out.println("Digite o seu adicional Noturno: ");
        adicionalNoturnof = sc.nextFloat();
        System.out.println("Digite as horas extras: ");
        horasExtrasf = sc.nextFloat();
        System.out.println("Digite os descontos: ");
        descontosf = sc.nextFloat();
        salarioLiquidof = salarioBrutof+adicionalNoturnof+(horasExtrasf*5)-descontosf;

        System.out.printf("O seu salario liquido é: %.2f ", salarioLiquidof);

         /* Exercicio 4 */
        Scanner sc = new Scanner(System.in);
        float num1, num2, num3, num4, diferenca;

        System.out.println("Digite o primeiro numero: ");
        num1 = sc.nextFloat();
        System.out.println("Digite o segundo numero: ");
        num2 = sc.nextFloat();
        System.out.println("Digite o terceiro numero: ");
        num3 = sc.nextFloat();
        System.out.println("Digite o quarto numero: ");
        num4 = sc.nextFloat();
        diferenca = ((num1*num2)-(num3*num4));
        System.out.println("A sua diferença é: "+diferenca);














        sc.close();


    }
}
