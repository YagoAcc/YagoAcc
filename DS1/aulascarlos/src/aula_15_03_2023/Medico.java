package aula_15_03_2023;

import java.time.LocalDate;

public class Medico extends Funcionario{
	private String CRM;

	public Medico() {
		
	}

	public Medico(String CRM, Setor setor, int id, String nome, int idade, Genero genero, LocalDate dataNascimento, String cpf, String rg, String matricula,
			double salario, Endereco endereco) {
		super(setor, id, nome, idade, genero, dataNascimento, cpf, rg, matricula, salario, endereco);
		this.CRM = CRM;
	}

	public String getCRM() {
		return CRM;
	}

	public void setCRM(String cRM) {
		CRM = cRM;
	}

	@Override
	public String toString() {
		return "\nMedico" + "\nCRM = " + CRM + "\nsetor = " + setor + "\nid = " + id + "\nnome = " + nome + "\nidade = " + idade
				+ "\ngenero = " + genero + "\ndata de nascimento = " + dataNascimento + endereco.toString();
	}
	
	
}
