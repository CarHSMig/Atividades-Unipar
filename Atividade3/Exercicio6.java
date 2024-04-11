package Atividade3;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner geral = new Scanner(System.in);

        System.out.println("Informe o nome do produto:");
        String nomeDoProduto = geral.nextLine();

        System.out.println("Informe o preço do produto:");
        float preco = geral.nextFloat();

        System.out.println("Informe a porcentagem de desconto:");
        float desconto = geral.nextFloat();

        float valorDoDesconto = preco * (desconto / 100);
        float valorTotal = preco - valorDoDesconto;

        System.out.printf("O valor final do %s é: R$%f", nomeDoProduto, valorTotal);
    }
}
