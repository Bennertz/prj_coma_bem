package sp.senai;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class DAO_Unidade {
    Connection conexao;

    public void insercao(UnidadeMedida unidadeMedida) {
        try {
            conexao = new Conexao().getConexao();
            String sql = "insert into unidade_medida values (default, ?)";
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setString(1, unidadeMedida.getNome_unidade_medida());
            pst.execute();
            this.conexao.close();
        } catch (Exception e) {
            System.out.println("Erro ao inserir unidade: " + e);
        }
    }

    public void alteracao(UnidadeMedida unidadeMedida) {
        try {
            conexao = new Conexao().getConexao();
            String sql = "update unidade_medida set nome_medida = ? where idunidade_medida = ?";
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setString(1, unidadeMedida.getNome_unidade_medida());
            pst.execute();
            this.conexao.close();
        } catch (Exception e) {
            System.out.println("Erro ao alterar unidade: " + e);
        }
    }

    public void exclusao(UnidadeMedida unidadeMedida) {
        try {
            conexao = new Conexao().getConexao();
            String sql = "delete from unidade_medida where idunidade_medida = ?";
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setInt(1,unidadeMedida.getIdunidade_medida());
            pst.execute();
            this.conexao.close();
        } catch (Exception e) {
            System.out.println("Erro ao excluir unidade: " + e);
        }
    }

    public void consulta() {
        try {
            conexao = new Conexao().getConexao();
            String sql = "select * from unidade_medida";
            Statement stm = conexao.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            System.out.println("\nDados cadastrados em Unidade Medida\n");
            while (rs.next()) {
                System.out.println("------------------------");
                System.out.println("Código: " + rs.getString(1));
                System.out.println("Unidade Medida: " + rs.getString(2));
            }
            this.conexao.close();
        } catch (Exception e) {
            System.out.println("Erro ao consultar: " + e);
        }
    }
}
