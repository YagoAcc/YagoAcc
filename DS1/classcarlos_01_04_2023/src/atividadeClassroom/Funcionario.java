package atividadeClassroom;

import java.time.LocalDate;

public abstract class Funcionario extends Fisica{
	protected String cpf, rg, matricula;
	protected Setor setor;
	protected double salario;
	
	public Funcionario() {
		
	}

	public Funcionario(int id, String nome, String telefone, String email, Genero genero, EstadoCivil estadoCivil,
			LocalDate dataNascimento, String cpf, String rg, String matricula, Setor setor, double salario, Endereco endereco) {
		super(id, nome, telefone, email, genero, estadoCivil, dataNascimento, endereco);
		this.cpf = cpf;
		this.rg = rg;
		this.matricula = matricula;
		this.setor = setor;
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
