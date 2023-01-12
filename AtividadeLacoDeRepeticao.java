package JAVA;

import java.util.Scanner;

public class AtividadeLacoDeRepeticao {

     public static void main(String[] args){
            Scanner ler = new Scanner(System.in);

            // EXERCICO 1
            int numero1;
            int numero2, contador;

            System.out.println("Digite o primeiro número: ");
            numero1 = ler.nextInt();

            System.out.println("Digite o Segundo número: ");
            numero2 = ler.nextInt();

            if(numero1 < numero2){

                for (contador = numero1; contador <= numero2; contador++){
                    if ((contador % 3 == 0) && (contador % 5 == 0))
                        System.out.println("\n O número " +  contador + " é múltiplo de 3 e 5.");


                }

            } else {
                System.out.println("Intervalo Invalido.");
            }




         // EXERCICO 2

         //Scanner ler = new Scanner(System.in);
         int idade = 0, idadeMaior = 0, idadeMenor = 0;

         while (idade >= 0){
             System.out.println("Digite uma idade: ");
             idade = ler.nextInt();

             if (idade > 50)
                 idadeMaior++;

             else if(idade <= 21) {
                 idadeMenor++;


             }
         }
         System.out.println("Total de pessoas menores de 21 anos:" + (idadeMenor -1) + "\nTotal de pessoas maiores de 50 anos:" +idadeMaior);


         // EXERCICO 3
         // Scanner ler = new Scanner(System.in);
         int numero, soma =0;

         do {
             System.out.println("\nDigite um número: ");
             numero = ler.nextInt();
             if(numero > 0)
                 soma = soma + numero;


         }while(numero !=0 );
         System.out.println("A soma dos números positivos é: " + soma);


     }


}
