package aula_15_03_2023;

public abstract class Funcionario extends Pessoa{
	String cpf;
	String rg;
	String matricula;
	double Salario;
	
	
	Funcionario(){
		
	}
	
	Funcionario(int id, String nome, int idade, Genero genero,String cpf, String rg, String matricula, double salario, Endereco endereco){
		super.id = id;
		super.nome = nome;
		super.idade = idade;
		super.genero =  genero;
		super.endereco =  endereco;
		this.cpf = cpf;
		this.rg = rg;
		this.matricula = matricula;
		this.Salario = salario;
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

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [cpf=" + cpf + ", rg=" + rg + ", matricula=" + matricula + ", Salario=" + Salario + ", id="
				+ id + ", nome=" + nome + ", idade=" + idade + ", genero=" + genero.genero + ", endereco=" + endereco.uf.sigla + "]";
	}
	
	
}
