package atividadeClassroom;

public abstract class Juridica extends Pessoa{
	protected String cnpj, inscricaoEstadual;
	
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
	

}
