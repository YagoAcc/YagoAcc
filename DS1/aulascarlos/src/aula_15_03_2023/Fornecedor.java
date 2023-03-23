package aula_15_03_2023;

import java.time.LocalDate;

public abstract class Fornecedor extends Pessoa{
	
	String cnpj;
	String inscricaoEstadual;
	
	Fornecedor(){
		
	}

	public Fornecedor(int id, String nome, int idade, Genero genero, LocalDate dataNascimento, String cnpj, String inscricaoEstadual, Endereco endereco) {
		super(id, nome, idade, genero, dataNascimento, endereco);
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	
}
