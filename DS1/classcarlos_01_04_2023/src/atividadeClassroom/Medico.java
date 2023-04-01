package atividadeClassroom;

import java.time.LocalDate;

public class Medico extends Funcionario{
	private String CRM;
	
	public Medico() {
		
	}

	public Medico(int id, String nome, String telefone, String email, Genero genero, EstadoCivil estadoCivil,
			LocalDate dataNascimento, String cpf, String rg, String matricula, Setor setor, String CRM, double salario,
			Endereco endereco) {
		super(id, nome, telefone, email, genero, estadoCivil, dataNascimento, cpf, rg, matricula, setor, salario, endereco);
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
		return  "\nMedico" + 
				"\nId = " + super.id + 
				"\nNome = " + super.nome +
				"\nCREA = " + this.CRM + 
				"\nCpf = " + super.cpf + 
				"\nRg = " + super.rg + 
				"\nMatricula = " + super.matricula + 
				"\nSetor = " + super.setor.nome + 
				"\nSalario = " + "R$ " + super.salario + 
				"\nGenero = " + super.genero.texto + 
				"\nEstado Civil = " + super.estadoCivil.texto + 
				"\nData de Nascimento = " + super.getDataNascimento() +  
				"\nIdade = " + super.getIdade() +
				"\nTelefone = " + super.telefone + 
				"\nEmail = " + super.email + 
				super.endereco.toString();
	}
	
	
}
