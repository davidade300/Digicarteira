package model;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class ClientePF {
	
	private String nome;
	private String dataDeNascimento;
	private String profissão;
	private int idade;
	
	
	
	public ClientePF(String nome, String dataDeNascimento, String profissão, int idade) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.profissão = profissão;
		this.idade =  Year.now().getValue() - DataDeNascimento().getYear();
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getProfissão() {
		return profissão;
	}
	
	public void setProfissão(String profissão) {
		this.profissão = profissão;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public LocalDate DataDeNascimento() {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataDeNascimento = LocalDate.parse(this.dataDeNascimento, fmt1);
		return dataDeNascimento;
		}
	
}
