package atividadeClassroom;

import java.time.LocalDate;

public class Engenheiro extends Funcionario{
	private String CREA;
	
	public Engenheiro() {
		
	}

	public Engenheiro(int id, String nome, String telefone, String email, Genero genero, EstadoCivil estadoCivil,
			LocalDate dataNascimento, String cpf, String rg, String matricula, Setor setor, String CREA, double salario,
			Endereco endereco) {
		super(id, nome, telefone, email, genero, estadoCivil, dataNascimento, cpf, rg, matricula, setor, salario, endereco);
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
		return  "\nEngenheiro" + 
				"\nId = " + super.id + 
				"\nNome = " + super.nome +
				"\nCREA = " + this.CREA + 
				"\nCpf = " + super.cpf + 
				"\nRg = " + super.rg + 
				"\nMatricula = " + super.matricula + 
				"\nSetor = " + super.setor.nome + 
				"\nSalario = " + super.getSalario() + 
				"\nGenero = " + super.genero.texto + 
				"\nEstado Civil = " + super.estadoCivil.texto + 
				"\nData de Nascimento = " + super.getDataNascimento() +  
				"\nIdade = " + super.getIdade() +
				"\nTelefone = " + super.telefone + 
				"\nEmail = " + super.email + 
				super.endereco.toString();
	}
	
	
}
