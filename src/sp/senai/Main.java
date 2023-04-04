package sp.senai;

public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        UnidadeMedida u1 = new UnidadeMedida();

        p1.setIdproduto(3);
        p1.setNome_produto("Macarrão");
        p1.setQuantidade_produto(5.00);
        p1.setPreco_produto(9.55);
        p1.setFk_idunidade_medida(1);

        u1.setIdunidade_medida(4);
        u1.setNome_unidade_medida("Miligrama");

        System.out.println("O produto cadastrado é:");
        System.out.println("Código: " + p1.getIdproduto());
        System.out.println("Produto: " + p1.getNome_produto());
        System.out.println("Quantidade: " + p1.getQuantidade_produto());
        System.out.println("Preço: " + p1.getPreco_produto());
        System.out.println("Unidade medida: " + p1.getFk_idunidade_medida());
        System.out.println("\n");

        //Conexao con = new Conexao();
        //con.consulta();

        Produto p2 = new Produto();
        p2.setIdproduto(6);
        p2.setNome_produto("Leite");
        p2.setQuantidade_produto(8.00);
        p2.setPreco_produto(29.55);
        p2.setFk_idunidade_medida(3);

        //con.insercao(p2);
        //con.consulta();
        DAO_Produto produtosdao = new DAO_Produto();
        produtosdao.consulta();

        DAO_Unidade unidadedao = new DAO_Unidade();
        unidadedao.consulta();

        //Produto p3 = new Produto();
        //p3.setIdproduto(11);
        //p3.setNome_produto("Milho Verde");
        //p3.setQuantidade_produto(2.70);
        //p3.setPreco_produto(4.12);
        //p3.setFk_idunidade_medida(1);

        //con.alteracao(p3);
        //con.consulta();

        //Produto p4 = new Produto();
        //p4.setIdproduto(12);

        //con.exclusao(p4);
        //con.consulta();
    }
}