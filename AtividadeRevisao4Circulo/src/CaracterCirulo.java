
public class CaracterCirulo {
    private double raio;
    private String cor;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public CaracterCirulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public void exibirCaracteristicas() {
        System.out.println("Círculo de raio " + raio + " e cor " + cor);
    }
}
