package Adocao;

public class Gato extends Animal {
    private String raca;
    private String descricao;

    public Gato(String nome, int idade, String saude, String raca, String descricao) {
        super(nome, "Gato", idade, saude);
        this.raca = raca;
        this.descricao = descricao;
    }

    // GETs
    public String getRaca() { return raca; }
    public String getDescricao() { return descricao; }

    // SETs
    public void setRaca(String raca) { this.raca = raca; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}