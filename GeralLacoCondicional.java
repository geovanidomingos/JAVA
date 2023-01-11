package JAVA;

import java.util.Scanner;

public class GeralLacoCondicional {
       public static void main(String[] args) {

           //EXERCICIO 1
            int numero;
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite o número:");
            numero = ler.nextInt();

            if (numero % 2 == 0) {
                if (numero >= 0) {
                    System.out.println("O número" + " " + numero + " " + "é par e positivo.");
                }
            } else {
                System.out.println("O número" + " " + numero + " " + "é par e negativo.");
            }
            if (numero >= 0) {
                System.out.println("O número é" + " " + numero + " " + "é impar e positivo.");
            } else {
                System.out.println("O número é" + " " + numero + " " + "é imapr e negativo");
            }


            //EXERCICIO 2
           int quantidade = 0;
           double valor = 0;
           int opcao;
           //Scanner ler = new Scanner(System.in);
           System.out.println("#### #### #### #### Menu Marketplace #### #### #### ####");

           System.out.println("\n Digite o item 1 para Cachorro-quente 10.00 R$");
           System.out.println("\n Digite o item 2 para X-Salada 15.00 R$");
           System.out.println("\n Digite o item 3 para X-Bacon 18.00 R$ ");
           System.out.println("\n Digite o item 4 para Bauru 12.00 R$ ");
           System.out.println("\n Digite o item 5 para Refrigerante 8.00 R$ ");
           System.out.println("\n Digite o item 6 para suco de laranga 13.00 R$ ");
           System.out.println("\n");
           System.out.println("\n Informe o Item desejado:");
           opcao = ler.nextInt();
           System.out.println("\n");

           switch (opcao) {
               case 1:
                   if (opcao ==1){
                       System.out.println("Digite a quantidade: ");
                       quantidade = ler.nextInt();
                       valor = (10.00*quantidade);
                       System.out.println("\n Valor do produto: " + valor + "R$");
                   } break;

               case 2:
                   if (opcao == 2){
                       System.out.println("Digite a quantidade: ");
                       quantidade = ler.nextInt();
                       valor = (15.00*quantidade);
                       System.out.println("\n Valor do produto: " + valor + "R$");
                   } break;

               case 3:
                   if (opcao == 3){
                       System.out.println("Digite a quantidade: ");
                       quantidade = ler.nextInt();
                       valor = (18.00*quantidade);
                       System.out.println("\n Valor do produto: " + valor + "R$");
                   } break;

               case 4:
                   if (opcao == 4){
                       System.out.println("Digite a quantidade: ");
                       quantidade = ler.nextInt();
                       valor = (12.00*quantidade);
                       System.out.println("\n Valor do produto: " + valor + "R$");
                   } break;

               case 5:
                   if (opcao == 5){
                       System.out.println("Digite a quantidade: ");
                       quantidade = ler.nextInt();
                       valor = (8.00*quantidade);
                       System.out.println("\n Valor do produto: " + valor + "R$");
                   } break;

               case 6:
                   if (opcao == 6){
                       System.out.println("Digite a quantidade: ");
                       quantidade = ler.nextInt();
                       valor = (13.00*quantidade);
                       System.out.println("\n Valor do produto: " + valor + "R$");
                   } break;
           }

           //EXERCICIO 3
           float salariof;
           float impostof;
           //Scanner ler = new Scanner(System.in);
           System.out.println("\nDigite seu salário para a vericação de imposto de renda:");
           salariof = ler.nextFloat();

           // Primeira condição
           if (salariof >=0 && salariof <= 2000.00) {
               System.out.println("\n Insento de imposto de renda");
           }
           // Segunda condição
           if (salariof > 2000.01 && salariof <= 3000.00){
               impostof =  salariof * 8/100 ;
               System.out.printf("\n Imposto de Renda: %.2f ", impostof);
           }
           // Terceceira condição
           if (salariof > 3000.00 && salariof <= 4500.00 ){
               impostof = salariof * 18/10;
               System.out.printf("\n Imposto de Renda: %.2f ", impostof);

           }
           if (salariof > 4500.00){
               impostof = salariof * 28/100;
               System.out.printf("\n Imposto de Renda: %.2f ", impostof);
           }

       }
}
