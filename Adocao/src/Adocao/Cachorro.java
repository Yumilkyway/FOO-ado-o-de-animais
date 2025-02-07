package Adocao;

public class Cachorro extends Animal {
    private String raca;
    private String descricao;

    public Cachorro(String nome, int idade, String saude, String raca, String descricao) {
        super(nome, "Cachorro", idade, saude);
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