package aula_15_03_2023;

public class Medico extends Funcionario{
	private String CRM;

	public Medico() {
		
	}

	public Medico(String CRM, Setor setor, int id, String nome, int idade, Genero genero, String cpf, String rg, String matricula,
			double salario, Endereco endereco) {
		super(setor, id, nome, idade, genero, cpf, rg, matricula, salario, endereco);
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
		return "Medico [CRM=" + CRM + ", setor=" + setor + ", id=" + id + ", nome=" + nome + ", idade=" + idade
				+ ", genero=" + genero + ", endereco=" + endereco.uf.sigla + "]";
	}
	
	
}
