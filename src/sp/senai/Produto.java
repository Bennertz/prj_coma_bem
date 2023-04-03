package sp.senai;

public class Produto {
    private int idproduto; // Variável que armazena o identificador do produto
    private String nome_produto; // Variável que armazena o nome do produto
    private double quantidade_produto; // Variável que armazena a quantidade do produto
    private float preco_produto; // Variável que armazena o preço do produto
    private int fk_idunidade_medida; // Variável que armazena o identificador da unidade de medida
    // Construtor da classe Produto

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public double getQuantidade_produto() {
        return quantidade_produto;
    }

    public void setQuantidade_produto(double quantidade_produto) {
        this.quantidade_produto = quantidade_produto;
    }

    public float getPreco_produto() {
        return preco_produto;
    }

    public void setPreco_produto(float preco_produto) {
        this.preco_produto = preco_produto;
    }

    public int getFk_idunidade_medida() {
        return fk_idunidade_medida;
    }

    public void setFk_idunidade_medida(int fk_idunidade_medida) {
        this.fk_idunidade_medida = fk_idunidade_medida;
    }

    public Produto(int idproduto, String nome_produto, double quantidade_produto, float preco_produto, int fk_idunidade_medida) {
        this.idproduto = idproduto;
        this.nome_produto = nome_produto;
        this.quantidade_produto = quantidade_produto;
        this.preco_produto = preco_produto;
        this.fk_idunidade_medida = fk_idunidade_medida;


    }
}
