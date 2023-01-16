package Metodo03;

import Metodos01.ClassiCliente;
import Metodos02.Funcionario;

import java.util.Scanner;

class Atividade1 {

    public static void main(String[] args) {


        //EXERCICIO 2


        //Long cpf2;
        // cpf2 = 11111111111L;
        Scanner ler = new Scanner(System.in);
        String nome = "", sexo = "", cpf = "";
        String endereco = "", cor = "";

        int idade = 0, celular = 0;



        ClassiCliente cliente = new ClassiCliente(nome,endereco,cor,idade,cpf,sexo,celular);

        System.out.println("\nDigite o nome do cliente: ");
        nome = ler.nextLine();
        cliente.setNome(nome);


        System.out.println("\nDigite a idade do cliente: ");
        idade = ler.nextInt();
        cliente.setIdade(idade);

        System.out.println("\nO nome do cliente é: " +nome);
        System.out.println("\nA idade do cliente é: " +idade);


        //EXERCICIO 2
        Funcionario funcionario = new Funcionario("Tom Sawyer", 30, 123293, "Jose Alfredo", "TI");

        funcionario.Visu();

        //EXERCICIO 3

        Produto game = new Produto("Playstatio 5", "Consoles", 5,4800,600);

        game.Visu();

    }



}
