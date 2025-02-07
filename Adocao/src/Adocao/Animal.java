package Adocao;

public class Animal {
	private String nome;
	private String especie;
	private int idade;
	private String saude;
	private boolean adotado;
	
	public Animal(String nome, String especie, int idade, String saude) {
		this.nome = nome;
		this.especie = especie;
		this.idade = idade;
		this.saude = saude;
		this.adotado = false;
	}
	
	// GETs
	public String getNome() { return nome; }
	public String getEspecie() { return especie; }
	public int getIdade() { return idade; }
	public String getSaude() { return saude; }
	public boolean getAdotado() { return adotado; }
	
	// SETs
	public void setNome(String nome) { this.nome = nome; }
	public void setEspecie(String especie) { this.especie = especie; }
	public void setIdade(int idade) { this.idade = idade; }
	public void setSaude(String saude) { this.saude = saude; }
	public void setAdotado(boolean adotado) { this.adotado = adotado; }
}