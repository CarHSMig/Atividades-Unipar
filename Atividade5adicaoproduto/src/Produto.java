public class Produto {
    private int codigo;
    private String descricao;
    private double preco;
    private int quantidadeEmEstoque;

    // Construtor
    public Produto(int codigo, String descricao, double preco, int quantidadeEmEstoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Getters
    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    // Método para adicionar estoque
    public void adicionarEstoque(int quantidade) {
        quantidadeEmEstoque += quantidade;
    }

    // Método para remover estoque
    public void removerEstoque(int quantidade) {
        if (quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
        } else {
            System.out.println("Erro: Estoque insuficiente.");
        }
    }
}