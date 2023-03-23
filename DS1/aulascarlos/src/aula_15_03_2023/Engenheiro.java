package aula_15_03_2023;

import java.time.LocalDate;

public class Engenheiro extends Funcionario{
	private String CREA;

	public Engenheiro() {
		
	}

	public Engenheiro(String CREA, Setor setor, int id, String nome, int idade, Genero genero, LocalDate dataNascimento, String cpf, String rg,
			String matricula, double salario, Endereco endereco) {
		super(setor, id, nome, idade, genero, dataNascimento, cpf, rg, matricula, salario, endereco);
		this.CREA = CREA;
	}

	public String getCREA() {
		return CREA;
	}

	public void setCREA(String cREA) {
		CREA = cREA;
	}

	@Override
	public String toString() {
		return "\nEngenheiro" + "\nCREA =" + CREA + "\nsetor = " + setor + "\nid = " + id + "\nnome = " + nome + "\nidade = " + idade
				+ "\ngenero = " + genero + "\ndata de nascimento = " + dataNascimento + endereco.toString();
	}

	
	
	
}
