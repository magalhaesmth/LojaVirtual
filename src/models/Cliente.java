package models;

public class Cliente {
	
	private String nome;
	private Double cpf;
	private Double telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getCpf() {
		return cpf;
	}
	public void setCpf(Double cpf) {
		this.cpf = cpf;
	}
	public Double getTelefone() {
		return telefone;
	}
	public void setTelefone(Double telefone) {
		this.telefone = telefone;
	}
	
}
