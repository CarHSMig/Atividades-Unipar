
import java.util.Scanner;

public class Patinho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o número inicial de patinhos
        System.out.print("Digite o número inicial de patinhos: ");
        int numeroPatinhos = scanner.nextInt();

        // Loop que repete a parte da música enquanto ainda houver patinhos
        while (numeroPatinhos > 0) {
            // Imprime a primeira parte da estrofe com o número atual de patinhos
            System.out.println(numeroPatinhos + " patinhos foram passear");
            System.out.println("Além das montanhas");
            System.out.println("Para brincar");
            System.out.println("A mamãe gritou: Quá, quá, quá, quá");

            // Verifica se é a última estrofe
            if (numeroPatinhos == 1) {
                System.out.println("A mamãe patinha foi procurar");
                System.out.println("Além das montanhas");
                System.out.println("Na beira do mar");
                System.out.println("A mamãe gritou: Quá, quá, quá, quá");
                System.out.println("E os " + numeroPatinhos + " patinhos voltaram de lá.");
            } else {
                // Imprime a parte da música em que os patinhos voltam sem o último patinho
                System.out.println("Mas só " + (numeroPatinhos - 1) + " patinhos voltaram de lá.\n");
            }

            // Decrementa o número de patinhos para a próxima iteração
            numeroPatinhos--;
        }

        // Fecha o scanner
        scanner.close();
    }
}


