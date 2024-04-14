public class TesteCarro {
    public static void main(String[] args) {
        Carro novoCarro = new Carro("Fiat","Uno", 2011, "Branco");

        novoCarro.exibirInformacoes();

        novoCarro.setModelo("Palio");
        novoCarro.setCor("Prata");

        // Exibindo as informações do carro novamente
        System.out.println("Após modificações:");
        novoCarro.exibirInformacoes();

        // Criando outro carro
        Carro carroDois = new Carro("Volkswagen", "Amarok", 2020, "Azul");

        // Exibindo as informações do carro do amigo
        System.out.println("Carro do amigo:");
        carroDois.exibirInformacoes();
    }
}
