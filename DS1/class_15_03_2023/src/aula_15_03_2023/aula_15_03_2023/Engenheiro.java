package aula_15_03_2023;

public class Engenheiro extends Funcionario{
	private String CREA;

	public Engenheiro() {
		
	}

	public Engenheiro(String CREA, Setor setor, int id, String nome, int idade, Genero genero, String cpf, String rg,
			String matricula, double salario, Endereco endereco) {
		super(setor, id, nome, idade, genero, cpf, rg, matricula, salario, endereco);
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
		return "Engenheiro [CREA=" + CREA + ", setor=" + setor + ", id=" + id + ", nome=" + nome + ", idade=" + idade
				+ ", genero=" + genero + ", endereco=" + endereco.uf.sigla + "]";
	}

	
	
	
}
