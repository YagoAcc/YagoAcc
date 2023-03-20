package aula_15_03_2023;

public abstract class Pessoa {
	int id;
	String nome;
	int idade;
	Genero genero;
	Endereco endereco;
	
	Pessoa(){
		
	}
	
	Pessoa(int id, String nome, int idade, Genero genero, Endereco endereco){
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.genero =  genero;
		this.endereco =  endereco;
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
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
