package Adocao;

import java.util.ArrayList;
import java.util.List;

public class Tutor {
	private String nome;
	private String cpf;
	private String telefone;
	private List<Animal> animaisAdotados;
	
	public Tutor(String nome, String cpf, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.animaisAdotados = new ArrayList<>();
	}
	
	// GETs
	public String getNome() { return nome; }
	public String getCpf() { return cpf; }
	public String getTelefone() { return telefone; }
	public List<Animal> getAnimaisAdotados() { return animaisAdotados; }
	
	// SETs
	public void setNome(String nome) { this.nome = nome; }

	// public void setCpf(String cpf) { this.cpf = cpf; } // COMENTÁRIO PORQUE NÃO SEI SE A GENTE DEVERIA MOSTRAR O CPF KKKKKKK

	public void setTelefone(String telefone) { this.telefone = telefone; }

	// public void setAnimaisAdotados(List<Animal> animaisAdotados) { this.animaisAdotados = animaisAdotados; }

	public void adotar(Animal animal) {
		if (!animal.getAdotado()) {
			animaisAdotados.add(animal);
			animal.setAdotado(true);
		}
	}
}
