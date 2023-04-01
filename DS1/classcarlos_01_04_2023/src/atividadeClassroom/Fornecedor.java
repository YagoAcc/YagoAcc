package atividadeClassroom;

public class Fornecedor extends Juridica{
	private String produto;
	
	public Fornecedor(){
		
	}

	public Fornecedor(int id, String nome, String telefone, String email, String cnpj, String inscricaoEstadual,
			String produto, Endereco endereco) {
		super(id, nome, telefone, email, cnpj, inscricaoEstadual, endereco);
		this.produto = produto;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "\n\nFornecedor" + 
				"\nProduto = " + this.produto + 
				"\nCnpj = " + super.cnpj + 
				"\nInscriçãoo Estadual = " + super.inscricaoEstadual + 
				"\nId = " + super.id + 
				"\nNome = " + super.nome + 
				"\nTelefone = " + super.telefone + 
				"\nEmail = " + super.email + 
				super.endereco.toString();
	}
	
	
}
