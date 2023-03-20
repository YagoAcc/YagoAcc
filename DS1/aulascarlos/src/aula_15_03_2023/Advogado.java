package aula_15_03_2023;

public class Advogado extends Funcionario{
	private String OAB;

	public Advogado() {
	
	}

	public Advogado(String OAB, Setor setor, int id, String nome, int idade, Genero genero, String cpf, String rg, String matricula,
			double salario, Endereco endereco) {
		super(setor, id, nome, idade, genero, cpf, rg, matricula, salario, endereco);
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
		return "Advogado [OAB=" + OAB + ", setor=" + setor + ", id=" + id + ", nome=" + nome + ", idade=" + idade
				+ ", genero=" + genero + ", endereco=" + endereco.uf.sigla + "]";
	}
	
	
}
