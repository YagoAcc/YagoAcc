package avaliacao_27_03_2023;

public class Cliente extends Fisica{
	int protocoloAtendimento;
	
	public Cliente() {
		
	}

	public Cliente(int protocoloAtendimento, int id, String nome, int idade, Genero genero, String telefone, String email, Endereco endereco) {
		super(id, nome, idade, genero, telefone, email, endereco);
		this.protocoloAtendimento = protocoloAtendimento;
	}

	public int getProtocoloAtendimento() {
		return protocoloAtendimento;
	}

	public void setProtocoloAtendimento(int protocoloAtendimento) {
		this.protocoloAtendimento = protocoloAtendimento;
	}

	@Override
	public String toString() {
		return "\n\nCliente" + "\nProtocolo de Atendimento = " + protocoloAtendimento + "\nIdade = " + idade + "\nGenero = " + genero.nome
				+ "\nId = " + id + "\nNome = " + nome + "\nTelefone = " + telefone + "\nEmail = " + email + endereco.toString();
	}
	
	
}
