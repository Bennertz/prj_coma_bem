package sp.senai;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO_Produto {
    Connection conexao;
    public void consulta() {
        try {
            conexao = new Conexao().getConexao();
            // Criar o statement para manupulação dos dados no banco de dados
            Statement stmt = conexao.createStatement();
            // Instrução de consulta
            ResultSet rs = stmt.executeQuery("select idproduto, nome_produto, quantidade_produto, preco_produto, fk_idunidade_medida, nome_unidade_medida from produto, unidade_medida where produto.fk_idunidade_medida = unidade_medida.idunidade_medida order by idproduto"); // Gerenciar o resultado

            while (rs.next()) { // Enquanto houver linhas na tabela
                // Imprime a linha encontrada
                System.out.println("Código: " + rs.getString(1) +" - Produto: "+ rs.getString(2) +" - Quantidade: "+ rs.getString(3) +" - Preço: "+ rs.getString(4) +" - ID Un. Medida: "+ rs.getString(5) +" - Un. Medida: "+ rs.getString(6));
            }
            this.conexao.close();
        } catch (Exception e) {
            System.out.println("Erro na consulta: " + e);
        }
        System.out.println("\n");
    }
    public boolean insercao(Produto produto) {
        try {
            conexao = new Conexao().getConexao();
            // Insere um produto no banco de dados
            String sql = "insert into produto values (default, ?, ?, ?, ?)";
            PreparedStatement pst = conexao.prepareStatement(sql);

            pst.setString(1, produto.getNome_produto());
            pst.setDouble(2, produto.getQuantidade_produto());
            pst.setDouble(3, produto.getPreco_produto());
            pst.setInt(4, produto.getFk_idunidade_medida());

            pst.execute();
            this.conexao.close();
            return true;
        } catch (Exception e) {
            System.out.println("Erro na consulta: " + e);
            return false;
        }
    }
    public void alteracao(Produto produto) {
        try {
            conexao = new Conexao().getConexao();
            String sql = "update produto set nome_produto = ?, quantidade_produto = ?, preco_produto = ?, fk_idunidade_medida = ? where idproduto = ?";
            // Faz uma alteração na tabela produto
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setString(1, produto.getNome_produto());
            pst.setDouble(2, produto.getQuantidade_produto());
            pst.setDouble(3, produto.getPreco_produto());
            pst.setInt(4, produto.getFk_idunidade_medida());
            pst.setInt(5, produto.getIdproduto());
            pst.execute();
            this.conexao.close();
        } catch (Exception e) {
            System.out.println("Erro na alteração: " + e);
        }
    }
    public void exclusao(Produto produto) {
        try {
            conexao = new Conexao().getConexao();
            String sql = "delete from produto where idproduto = ?";
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setInt(1, produto.getIdproduto());
            pst.execute();
            this.conexao.close();
        } catch (Exception e) {
            System.out.println("Erro na consulta: " + e);
        }
    }
}
