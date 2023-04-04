package sp.senai;

import java.io.StringReader;
import java.sql.*;

public class Conexao {

    Connection conexao;
    public Conexao () {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Estabelecer conexão com o banco de dados
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/loja_coma_bem", "root", "root"); // Gerenciar a conexão
        } catch (Exception e) {
            System.out.println("Erro na conexão: " + e);
        }
    }
    public Connection getConexao() {
        return this.conexao;
    }

}
