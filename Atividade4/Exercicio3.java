package Atividade4;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        String usuario_correto = "usuario";
        String senha_correta = "senha123";

        Scanner usuario = new Scanner(System.in);
        Scanner senha = new Scanner(System.in);

        System.out.println("Informe o usuario:");
        String bnq_usuario = usuario.nextLine();

        System.out.println("Informe a senha:");
        String bnq_senha = senha.nextLine();


        if (!bnq_usuario.equals(usuario_correto)) {
            System.out.println("O usuario está incorreto");
        } else if (!bnq_senha.equals(senha_correta)) {
            System.out.println("A senha está incorreta");
        } else {
            System.out.println("O usuario e senha estão corretos");
        }
    }
}
