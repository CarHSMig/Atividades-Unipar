package Atividade4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner numero1 = new Scanner(System.in);
        Scanner numero2 = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        int numeros1 = numero1.nextInt();

        System.out.println("Informe o primeiro número:");
        int numeros2 = numero2.nextInt();

        if (numeros1 > numeros2) {
            System.out.printf("O número maior é:%s", numeros1);
        } else {
            System.out.printf("O número maior é:%s", numeros2);
        }
    }
}

