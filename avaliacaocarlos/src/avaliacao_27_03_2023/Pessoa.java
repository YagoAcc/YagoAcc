package avaliacao_27_03_2023;

abstract class Pessoa {
	protected int id;
	protected String nome, telefone, email;
	protected Endereco endereco;
	
	protected Pessoa() {
		
	}
	
	protected Pessoa(int id, String nome, String telefone, String email, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected String getTelefone() {
		return telefone;
	}

	protected void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected Endereco getEndereco() {
		return endereco;
	}

	protected void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
