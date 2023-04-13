package ProgramUml;

import java.time.LocalDate;
import java.time.Period;

public class Funcionario extends Pessoa{
	private String cpf, rg;
	private LocalDate dataNascimento;
	private double salario;
	
	public Funcionario() {
		
	}

	public Funcionario(int id, String nome, String cpf, String rg, Genero genero, LocalDate dataNascimento, double salario, Endereco endereco) {
		super(id, nome, genero, endereco);
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
	}
	
	public int getIdade() {
		Period calcularIdade = Period.between(dataNascimento, LocalDate.now());
		return ;
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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "\nFuncionário" + 
				"\nCpf = " + this.cpf + 
				"\nRg = " + this.rg + 
				"\nData de Nascimento = " + Util2.FormatarData(getDataNascimento()) + 
				"\nSalario = " + Util2.FormatarMoeda(getSalario()) + 
				"\nId = " + this.id + 
				"\nNome = " + this.nome + 
				"\nGênero = " + this.genero.texto + 
				"\n" + this.endereco.toString();
	}
	
	
}
