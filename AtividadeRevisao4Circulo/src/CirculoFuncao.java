import java.util.Scanner;

 class CirculoFuncao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o raio do círculo: ");
        double raio = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Insira a cor do círculo: ");
        String cor = scanner.nextLine();


        CaracterCirulo circulo = new CaracterCirulo(raio, cor);

        circulo.exibirCaracteristicas();

        System.out.println("Área do círculo: " + circulo.calcularArea());

        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());

        scanner.close();
    }
}
