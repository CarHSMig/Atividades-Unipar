
import java.util.Scanner;

        public class menosemais {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                int[] valores = new int[20];
                int menorvalor = 0;
                int mediovalor =0;
                int maiorvalor = 0;

                System.out.println("Digite 20 valores diferentes:");
                for (int i = 0; i < 20; i++) {
                    System.out.print("Valor " + (i + 1) + ": ");
                    int valor = scanner.nextInt();

                    valores[i] = valor;

                    if (valores[i] < 100) {
                        menorvalor++;
                    } else if (valores[i] > 100 && valores[i] <= 200) {
                        mediovalor++;
                    } else if (valores[i] > 200){
                        maiorvalor++;
                    }
                }

                System.out.println("Dos valores digitados:");
                System.out.println(menorvalor + " são menores que 100");
                System.out.println(mediovalor + " são maiores que 100 e menores que 200");
                System.out.println(maiorvalor + " são maiores que 200");

                scanner.close();
            }
        }
