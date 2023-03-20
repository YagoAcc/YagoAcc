package aula_15_03_2023;

public class Fornecedor extends Pessoa{
	
	String cnpj;
	String inscricaoEstadual;
	
	Fornecedor(){
		
	}

	public Fornecedor(int id, String nome, int idade, Genero genero, String cnpj, String inscricaoEstadual, Endereco endereco) {
		super(id, nome, idade, genero, endereco);
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

	@Override
	public String toString() {
		return "Fornecedor [cnpj=" + cnpj + ", inscricaoEstadual=" + inscricaoEstadual + ", id=" + id + ", nome=" + nome
				+ ", idade=" + idade + ", genero =" + genero.genero + ", endereco =" + endereco.uf.sigla + "]";
	}
	
	
}
