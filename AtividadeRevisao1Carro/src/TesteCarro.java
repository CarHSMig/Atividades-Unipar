public class TesteCarro {
    public static void main(String[] args) {
        Carro novoCarro = new Carro("Fiat","Uno", 2011, "Branco");

        novoCarro.exibirInformacoes();

        novoCarro.setModelo("Palio");
        novoCarro.setCor("Prata");

        System.out.println("Após modificações:");
        novoCarro.exibirInformacoes();

        Carro carroDois = new Carro("Volkswagen", "Amarok", 2020, "Azul");

        System.out.println("Carro do amigo:");
        carroDois.exibirInformacoes();
    }
}
