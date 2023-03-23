package aula_15_03_2023;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LoginInformatica extends Fornecedor{
	LocalDate contratoInicio;
	LocalDate contratoFim;
	
	public LoginInformatica() {
		
	}

	public LoginInformatica(int id, String nome, int idade, Genero genero, LocalDate dataNascimento, LocalDate contratoInicio, LocalDate contratoFim, String cnpj,
			String inscricaoEstadual, Endereco endereco) {
		super(id, nome, idade, genero, dataNascimento, cnpj, inscricaoEstadual, endereco);
		this.contratoInicio = contratoInicio;
		this.contratoFim = contratoFim;
	}

	public String getContratoInicio() {
		DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		return contratoInicio.format(formatar);
	}

	public void setContratoInicio(LocalDate contratoInicio) {
		this.contratoInicio = contratoInicio;
	}

	public String getContratoFim() {
		DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		return contratoFim.format(formatar);
	}

	public void setContratoFim(LocalDate contratoFim) {
		this.contratoFim = contratoFim;
	}

	@Override
	public String toString() {
		return "\nInicio do contrato = "  + contratoInicio + "\nFim do contrato = "  + contratoFim;
	}
	
	
}
