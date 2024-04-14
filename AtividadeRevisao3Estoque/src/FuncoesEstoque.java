import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncoesEstoque {
    private static List<Produto> produtos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner opcoes = new Scanner(System.in);

        while (true) {
            System.out.println("MENU:");
            System.out.println("1- Adicionar Produto");
            System.out.println("2- Atualizar Produto");
            System.out.println("3- Exibir Detalhes do Produto");
            System.out.println("4- Sair");
            System.out.println("Selecione a opção que deseja realizar:");

            int opcao = opcoes.nextInt();
            opcoes.nextLine(); // Limpar o buffer de entrada

            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    atualizarProduto();
                    break;
                case 3:
                    detalhesProduto();
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public static void adicionarProduto() {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva o nome do produto que deseja adicionar:");
        String nome = input.nextLine();

        System.out.println("Preço do Produto:");
        double preco = input.nextDouble();

        System.out.println("Escreva a quantidade de estoque presente desse produto:");
        int quantidade = input.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);
        produtos.add(produto);

        System.out.println("Produto adicionado com sucesso!");
    }

    public static void atualizarProduto() {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva o nome do produto que deseja atualizar:");
        String nome = input.nextLine();

        Produto produto = procurarProdutoPorNome(nome);

        if (produto != null) {
            System.out.println("Escreva o novo preço do produto:");
            double preco = input.nextDouble();

            System.out.println("Escreva a nova quantidade em estoque do produto:");
            int quantidade = input.nextInt();

            produto.setPreco(preco);
            produto.setQuantidade(quantidade);

            System.out.println("Produto atualizado com sucesso!");
        } else {
            System.out.println("Produto não encontrado");
        }
    }

    public static void detalhesProduto() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva o nome do produto que deseja ver as informações:");
        String nome = input.nextLine();

        Produto produto = procurarProdutoPorNome(nome);

        if (produto != null) {
            produto.exibirInformacoes();
        } else {
            System.out.println("Produto não encontrado");
        }
    }

    public static Produto procurarProdutoPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }
}