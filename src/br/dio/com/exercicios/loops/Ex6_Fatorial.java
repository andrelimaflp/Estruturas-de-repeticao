package br.dio.com.exercicios.loops;

/*
Faça um programa que calcule o fatorial
de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
*/

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial;

        System.out.println("Fatorial:");
        fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial + "! =");
        for (int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;

        }

        System.out.println(multiplicacao);
    }

}
