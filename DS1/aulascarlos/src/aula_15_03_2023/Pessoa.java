package aula_15_03_2023;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Pessoa {
	int id;
	String nome;
	int idade;
	Genero genero;
	Endereco endereco;
	protected LocalDate dataNascimento;
	
	Pessoa(){
		
	}
	
	Pessoa(int id, String nome, int idade, Genero genero, LocalDate dataNascimento, Endereco endereco){
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.genero =  genero;
		this.endereco =  endereco;
		this.dataNascimento = dataNascimento;
	}
	
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	public String getdataNascimento() {
		DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return dataNascimento.format(formatar);
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
