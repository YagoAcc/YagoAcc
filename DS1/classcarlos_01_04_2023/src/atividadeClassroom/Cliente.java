package atividadeClassroom;

import java.time.LocalDate;

public class Cliente extends Fisica{
	private int protocoloAtendimento;
	
	public Cliente() {
		
	}

	public Cliente(int id, String nome, String telefone, String email, Genero genero, EstadoCivil estadoCivil,
			LocalDate dataNascimento, int protocoloAtendimento, Endereco endereco) {
		super(id, nome, telefone, email, genero, estadoCivil, dataNascimento, endereco);
		this.protocoloAtendimento = protocoloAtendimento;
	}

	public int getProtocoloAtendimento() {
		return protocoloAtendimento;
	}

	public void setProtocoloAtendimento(int protocoloAtendimento) {
		this.protocoloAtendimento = protocoloAtendimento;
	}
	
	
}
