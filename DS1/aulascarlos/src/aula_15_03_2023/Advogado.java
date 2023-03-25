package aula_15_03_2023;

import java.time.LocalDate;

public class Advogado extends Funcionario{
	private String OAB;

	public Advogado() {
	
	}

	public Advogado(String OAB, Setor setor, int id, String nome, int idade, Genero genero, LocalDate dataNascimento, String cpf, String rg, String matricula,
			double salario, Endereco endereco) {
		super(setor, id, nome, idade, genero, dataNascimento, cpf, rg, matricula, salario, endereco);
		this.OAB = OAB;
	}

	public String getOAB() {
		return OAB;
	}

	public void setOAB(String oAB) {
		OAB = oAB;
	}

	@Override
	public String toString() {
		return "\nAdvogado" + "OAB = " + OAB + "\nsetor = " + setor + "\nid = " + id + "\nnome = " + nome + "\nidade = " + idade
				+ "\ngenero = " + genero.getGenero() + "\ndata de nascimento = " + super.getdataNascimento() + endereco.toString();
	}
	
	
}
