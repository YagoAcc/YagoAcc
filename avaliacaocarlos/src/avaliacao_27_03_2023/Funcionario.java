package avaliacao_27_03_2023;

abstract class Funcionario extends Fisica{
	
	String cpf, rg, matricula;
	Setor setor;
	double salario;
	
	protected Funcionario() {
		
	}

	protected Funcionario(int id, String nome, int idade, Genero genero, String cpf, String rg, String matricula, String telefone, String email,
			Setor setor, double salario, Endereco endereco) {
		super(id, nome, idade, genero, telefone, email, endereco);
		this.cpf = cpf;
		this.rg = rg;
		this.matricula = matricula;
		this.setor = setor;
		this.salario = salario;
	}

	protected String getCpf() {
		return cpf;
	}

	protected void setCpf(String cpf) {
		this.cpf = cpf;
	}

	protected String getRg() {
		return rg;
	}

	protected void setRg(String rg) {
		this.rg = rg;
	}

	protected String getMatricula() {
		return matricula;
	}

	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	protected Setor getSetor() {
		return setor;
	}

	protected void setSetor(Setor setor) {
		this.setor = setor;
	}

	protected double getSalario() {
		return salario;
	}

	protected void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
