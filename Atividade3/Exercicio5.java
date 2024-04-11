package Atividade3;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner geral = new Scanner(System.in);

        System.out.println("Informe o valor 1:");
        float valor1 = geral.nextFloat();

        System.out.println("Informe o valor 2:");
        float valor2 = geral.nextFloat();

        float valorSoma = valor1 + valor2;
        float valorSubtracao = valor1 - valor2;
        float valordivisao = valor1 / valor2;
        float valormultiplicacao = valor1 * valor2;

        System.out.printf("O Valor da soma é:%s", valorSoma);
        System.out.printf("O Valor da subtração é:%s", valorSubtracao);
        System.out.printf("O Valor da divisão é é:%s", valordivisao);
        System.out.printf("O Valor de multiplicação é:%s", valormultiplicacao);
    }
}
