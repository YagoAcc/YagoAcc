package atividadeClassroom;

import java.time.LocalDate;

public class Advogado extends Funcionario{
	private String OAB;
	
	public Advogado() {
		
	}

	public Advogado(int id, String nome, String telefone, String email, Genero genero, EstadoCivil estadoCivil,
			LocalDate dataNascimento, String cpf, String rg, String matricula, Setor setor, String OAB, double salario,
			Endereco endereco) {
		super(id, nome, telefone, email, genero, estadoCivil, dataNascimento, cpf, rg, matricula, setor, salario, endereco);
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
		return  "\nAdvogado" + 
				"\nId = " + super.id + 
				"\nNome = " + super.nome +
				"\nCREA = " + this.OAB + 
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
