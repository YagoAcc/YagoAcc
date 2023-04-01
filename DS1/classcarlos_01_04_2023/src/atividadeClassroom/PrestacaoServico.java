package atividadeClassroom;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PrestacaoServico extends Juridica{
	private LocalDate contratoInicio, contratoFim;
	
	DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public PrestacaoServico() {
		
	}

	
	public PrestacaoServico(int id, String nome, String telefone, String email, String cnpj, String inscricaoEstadual,
			LocalDate contratoInicio, LocalDate contratoFim, Endereco endereco) {
		super(id, nome, telefone, email, cnpj, inscricaoEstadual, endereco);
		this.contratoInicio = contratoInicio;
		this.contratoFim = contratoFim;
	}


	public String getContratoInicio() {
		return contratoInicio.format(formatar);
	}

	public void setContratoInicio(LocalDate contratoInicio) {
		this.contratoInicio = contratoInicio;
	}

	public String getContratoFim() {
		return contratoFim.format(formatar);
	}

	public void setContratoFim(LocalDate contratoFim) {
		this.contratoFim = contratoFim;
	}


	@Override
	public String toString() {
		return "\n\nPrestação Serviço" + 
				"\nÍnicio do contrato = " + this.contratoInicio + 
				"\nFim do contrato = " + this.contratoFim + 
				"\nCnpj = " + super.cnpj + 
				"\nInscrição Estadual = " + super.inscricaoEstadual + 
				"\nId = " + super.id + 
				"\nNome = " + super.nome + 
				"\nTelefone = " + super.telefone + 
				"\nEmail = " + super.email + 
				super.endereco.toString();
	}

	
}
