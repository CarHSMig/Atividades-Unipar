package Atividade3;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner geral = new Scanner(System.in);

        System.out.println("Informe o valor 1:");
        float valor1 = geral.nextFloat();

        System.out.println("Informe o valor 2:");
        float valor2 = geral.nextFloat();


        float valorSoma = valor1 + valor2;
        float valorFinal = valorSoma / 2;

        System.out.printf("O Valor total é:%s", valorFinal);
    }
}
