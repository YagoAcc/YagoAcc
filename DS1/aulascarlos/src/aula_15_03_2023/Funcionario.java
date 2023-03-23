package aula_15_03_2023;

import java.time.LocalDate;

public abstract class Funcionario extends Pessoa{
	private String cpf;
	private String rg;
	private String matricula;
	private double Salario;
	protected Setor setor;
	
	Funcionario(){
		
	}
	
	Funcionario(Setor setor, int id, String nome, int idade, Genero genero, LocalDate dataNascimento, String cpf, String rg, String matricula, double salario, Endereco endereco){
		super(id, nome, idade, genero, dataNascimento, endereco);
		this.cpf = cpf;
		this.rg = rg;
		this.matricula = matricula;
		this.Salario = salario;
		this.setor = setor;
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
	
	public Setor getSetor(Setor setor) {
		return setor;
	}
	
	public void setSetor(String Setor, Setor setor) {
		this.setor = setor;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}
	
	@Override
	public String toString() {
		return "Funcionario [cpf=" + cpf + ", rg=" + rg + ", matricula=" + matricula + ", Salario=" + Salario + ", id="
				+ id + ", nome=" + nome + ", idade=" + idade + ", genero=" + genero.genero + ", ano de nascimento = " + dataNascimento.getYear() + ", endereco=" + endereco.uf.sigla + "]";
	}
	
	
}
