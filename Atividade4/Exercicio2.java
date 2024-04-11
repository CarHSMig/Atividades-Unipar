package Atividade4;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner numeros = new Scanner(System.in);

        System.out.println("Informe um número inteiro:");
        int numero = numeros.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par !");
        } else {
            System.out.println("O número é impar !");
        }
    }
}
