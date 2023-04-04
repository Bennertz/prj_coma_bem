package sp.senai;

import java.io.StringReader;
import java.sql.*;

/**
 *  Classe que faz a conexão via JDBC com pacote
 *  mysql-connector-j-8.0.32
 */
public class Conexao {
    /**
     * Objeto Connection
     */
    private Connection conexao;

    /**
     * Construtor do objeto Conexao que
     * faz a ligação com o banco de dados
     */
    public Conexao () {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Estabelecer conexão com o banco de dados
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/loja_coma_bem", "root", "root"); // Gerenciar a conexão
        } catch (Exception e) {
            System.out.println("Erro na conexão: " + e);
        }
    }

    /**
     * Método que retorna a conexão criada
     * @return
     */
    public Connection getConexao() {
        return this.conexao;
    }

}
