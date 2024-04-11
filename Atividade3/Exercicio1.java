package Atividade3;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner geral = new Scanner(System.in);

        System.out.println("Informe o valor 1:");
        float valor1 = geral.nextFloat();

        System.out.println("Informe o valor 2:");
        float valor2 = geral.nextFloat();

        System.out.println("Informe o valor 1:");
        float valor3 = geral.nextFloat();


        float valorTotal = valor1 + valor2 + valor3;
        System.out.printf("O Valor total é:%s", valorTotal);
    }
}
