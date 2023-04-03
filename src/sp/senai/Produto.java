package sp.senai;

public class Produto {
    private int idproduto; // Variável que armazena o identificador do produto
    private String nome_produto; // Variável que armazena o nome do produto
    private double quantidade_produto; // Variável que armazena a quantidade do produto
    private double preco_produto; // Variável que armazena o preço do produto
    private int fk_idunidade_medida; // Variável que armazena o identificador da unidade de medida

    // Construtor da classe Produto
    public Produto() {
        this.idproduto = idproduto;
        this.nome_produto = nome_produto;
        this.quantidade_produto = quantidade_produto;
        this.preco_produto = preco_produto;
        this.fk_idunidade_medida = fk_idunidade_medida;
    }

    // Método para recuperar o identificador do produto
    public int getIdproduto() {
        return idproduto;
    }

    // Método para alterar o identificador do produto
    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    // Método para recuperar o nome do produto
    public String getNome_produto() {
        return nome_produto;
    }

    // Método para alterar o nome do produto
    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    // Método para recuperar a quantidade de produtos
    public double getQuantidade_produto() {
        return quantidade_produto;
    }

    // Método para alterar a quantidade de produtos
    public void setQuantidade_produto(double quantidade_produto) {
        this.quantidade_produto = quantidade_produto;
    }

    // Método para recuperar o preço do produto
    public double getPreco_produto() {
        return preco_produto;
    }

    // Método para alterar o preço do produto
    public void setPreco_produto(double preco_produto) {
        this.preco_produto = preco_produto;
    }

    // Método para recuperar o identificador da unidade de medida
    public int getFk_idunidade_medida() {
        return fk_idunidade_medida;
    }

    // Método para alterar o identificador da unidade de medida
    public void setFk_idunidade_medida(int fk_idunidade_medida) {
        this.fk_idunidade_medida = fk_idunidade_medida;
    }
}
