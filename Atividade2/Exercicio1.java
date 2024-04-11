package Atividade2;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        String nome = "";
        int idade = 0;
        double peso = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seus dados:");

        System.out.println("Nome:");
        nome = scanner.nextLine();

        System.out.println("Idade:");
        idade = scanner.nextInt();

        System.out.println("Peso:");
        peso = scanner.nextDouble();


        scanner.close();

        System.out.println("Nome: "+ nome);
        System.out.println("idade: "+ idade);
        System.out.println("peso: "+ peso);
    }
}
//Os Scananner´s estavam mal definidos no código