package sp.senai;

public class UnidadeMedida {
    private int idunidade_medida; // Variável que armazena o identificador da unidade de medida
    private  String nome_unidade_medida; // Variável que armazena o nome da unidade de medida

    // Construtor da classe UnidadeMedida
    public UnidadeMedida() {
        this.idunidade_medida = idunidade_medida;
        this.nome_unidade_medida = nome_unidade_medida;
    }

    // Método para recuperar o identificador da unidade de medida
    public int getIdunidade_medida() {
        return idunidade_medida;
    }

    // Método para alterar o identificador da unidade de medida
    public void setIdunidade_medida(int idunidade_medida) {
        this.idunidade_medida = idunidade_medida;
    }

    // Método para recuperar o nome da unidade de medida
    public String getNome_unidade_medida() {
        return nome_unidade_medida;
    }

    // Método para alterar o nome da unidade de medida
    public void setNome_unidade_medida(String nome_unidade_medida) {
        this.nome_unidade_medida = nome_unidade_medida;
    }
}
