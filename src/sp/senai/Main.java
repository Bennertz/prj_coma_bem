package sp.senai;

import java.sql.*;

public class Main {
    // URL do banco de dados
    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/loja_coma_bem";

    public static void main(String[] args) {
        Connection connection = null; // Gerenciar a conexão
        Statement stm = null; // Instrução de consulta
        ResultSet rs = null; // Gerenciar o resultado

        try {
            // Estabelecer conexão com o banco de dados
            connection = DriverManager.getConnection(DATABASE_URL, "root", "root");
            // Criar o statement para manupulação dos dados no banco de dados
            stm = connection.createStatement();
            // Consulta no banco de dados
            rs = stm.executeQuery("select idproduto, nome_produto, quantidade_produto, preco_produto, fk_idunidade_medida, nome_unidade_medida from produto, unidade_medida where produto.fk_idunidade_medida = unidade_medida.idunidade_medida");
            while (rs.next()) { // Enquanto houver linhas na tabela
                // Imprime a linha encontrada
                System.out.println(rs.getInt(1) +
                        " - "+ rs.getString(2) +
                        " - "+ rs.getFloat(3) +
                        " - "+ rs.getBigDecimal(4) +
                        " - "+ rs.getInt(5) +
                        " - "+ rs.getString(6));
            }
            System.out.println("\n");

            // Insere um produto no banco de dados
            stm.execute("insert into produto (idproduto, nome_produto, quantidade_produto, preco_produto, fk_idunidade_medida) values (5, 'Brócolis', 5, 6.90, 2)");
            // Consulta no banco de dados
            rs = stm.executeQuery("select idproduto, nome_produto, quantidade_produto, preco_produto, fk_idunidade_medida, nome_unidade_medida from produto, unidade_medida where produto.fk_idunidade_medida = unidade_medida.idunidade_medida");
            while (rs.next()) { // Enquanto houver linhas na tabela
                // Imprime a linha encontrada
                System.out.println(rs.getInt(1) +
                        " - "+ rs.getString(2) +
                        " - "+ rs.getFloat(3) +
                        " - "+ rs.getBigDecimal(4) +
                        " - "+ rs.getInt(5) +
                        " - "+ rs.getString(6));
            }
            System.out.println("\n");

            // Faz uma alteração na tabela produto
            stm.execute("update produto set preco_produto = '6.94' where nome_produto = 'Leite'");
            // Consulta no banco de dados
            rs = stm.executeQuery("select idproduto, nome_produto, quantidade_produto, preco_produto, fk_idunidade_medida, nome_unidade_medida from produto, unidade_medida where produto.fk_idunidade_medida = unidade_medida.idunidade_medida");
            while (rs.next()) { // Enquanto houver linhas na tabela
                // Imprime a linha encontrada
                System.out.println(rs.getInt(1) +
                        " - "+ rs.getString(2) +
                        " - "+ rs.getFloat(3) +
                        " - "+ rs.getBigDecimal(4) +
                        " - "+ rs.getInt(5) +
                        " - "+ rs.getString(6));
            }
            System.out.println("\n");

            // Exclui um produto no banco de dados
            stm.execute("delete from produto where nome_produto = 'Leite'");
            // Consulta no banco de dados
            rs = stm.executeQuery("select idproduto, nome_produto, quantidade_produto, preco_produto, fk_idunidade_medida, nome_unidade_medida from produto, unidade_medida where produto.fk_idunidade_medida = unidade_medida.idunidade_medida");
            while (rs.next()) { // Enquanto houver linhas na tabela
                // Imprime a linha encontrada
                System.out.println(rs.getInt(1) +
                        " - "+ rs.getString(2) +
                        " - "+ rs.getFloat(3) +
                        " - "+ rs.getBigDecimal(4) +
                        " - "+ rs.getInt(5) +
                        " - "+ rs.getString(6));
            }
            System.out.println("\n");

            connection.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
}