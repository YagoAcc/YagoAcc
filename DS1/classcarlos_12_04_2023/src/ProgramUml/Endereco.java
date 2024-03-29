package ProgramUml;

public class Endereco {
	protected String logradouro, numero, complemento, cep, cidade, uf;
	
	public Endereco() {
		
	}

	public Endereco(String logradouro, String numero, String complemento, String cep, String cidade, String uf) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		return "\nEndereco" + 
				"\nLogradouro = " + this.logradouro + 
				"\nN�mero = " + this.numero + 
				"\nComplemento = " + this.complemento + 
				"\nCep = " + this.cep + 
				"\nCidade = " + this.cidade + 
				"\nUf = " + this.uf;
	}
	
	
}
