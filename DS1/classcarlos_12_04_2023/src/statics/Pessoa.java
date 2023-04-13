package statics;

import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private LocalDate dataDeNascimento;
	private double salario;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, LocalDate dataDeNascimento, double salario) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getdataDeNascimento() {
		return Util.FormatarData(dataDeNascimento);
	}

	public void setIdade(LocalDate idade) {
		this.dataDeNascimento = idade;
	}

	public String getSalario() {
		return Util.FormatarBrl(salario);
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
