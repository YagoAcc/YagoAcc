package avaliacao_27_03_2023;

public class Juridica extends Pessoa{
	
	String cnpj, inscricaoEstadual;
	
	public Juridica() {
		
	}

	public Juridica(int id, String nome, String telefone, String email, String cnpj, String inscricaoEstadual, Endereco endereco) {
		super(id, nome, telefone, email, endereco);
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
		return "\n\nJuridica" + "\nCnpj = " + cnpj + "\nInscricao estadual = " + inscricaoEstadual + "\nId = " + id + "\nNome = " + nome
				+ "\nTelefone = " + telefone + "\nEmail = " + email + endereco.toString();
	}

	
	
	
}
