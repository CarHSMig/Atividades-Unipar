import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class diascalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua data de nascimento (no formato AAAA-MM-DD): ");
        String input = scanner.nextLine();

        LocalDate dataNascimento = LocalDate.parse(input);

        LocalDate dataAtual = LocalDate.now();

        Period diferenca = Period.between(dataNascimento, dataAtual);

        System.out.println("Sua idade é: " + diferenca.getYears() + " anos, " + diferenca.getMonths() + " meses e " + diferenca.getDays() + " dias.");
        long diasvividos = (diferenca.getYears() * 365) + (diferenca.getMonths() * 30) + diferenca.getDays();
        System.out.println("Você tem: " + diasvividos + " dias vividos");
        scanner.close();
    }
}

