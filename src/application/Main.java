package application;
import entities.Pessoa;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();

        System.out.println("Quantas pessoas querem alugar?");
        int N = sc.nextInt();
         sc.nextLine();

        int conseguiram =0;
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            System.out.println("Qual seu nome?");
            String nome = sc.nextLine();
            System.out.println("Qual sua idade?");
            int idade = sc.nextInt();
            System.out.println("Qual sua renda?");
            double renda = sc.nextDouble();
            System.out.println("Qual valor do aluguel?");
            double aluguel = sc.nextDouble();
            sc.nextLine();


            Pessoa pessoa = new Pessoa(nome, idade, renda);
            pessoas.add(pessoa);



            if(pessoa.podeAlugar(aluguel)){
            System.out.println("Fechadao irmao ,alugado pra ti!!");
            conseguiram +=1;

            }else {
                System.out.println("Irmão ta sem grana ....");
            }


        }
        System.out.println(conseguiram + " Conseguiram");
        sc.close();
    }
}

