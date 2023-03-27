package avaliacao_27_03_2023;

public class Engenheiro extends Funcionario{
	private String CREA;
	
	protected Engenheiro() {
		
	}

	protected Engenheiro(int id, String CREA, String nome, int idade, Genero genero, String cpf, String rg, String matricula,
			String telefone, String email, Setor setor, double salario, Endereco endereco) {
		super(id, nome, idade, genero, cpf, rg, matricula, telefone, email, setor, salario, endereco);
		this.CREA = CREA;
	}

	protected String getCREA() {
		return CREA;
	}

	protected void setCREA(String cREA) {
		CREA = cREA;
	}

	@Override
	public String toString() {
		return "\n\nEngenheiro"  + "\nCREA = " + CREA + "\nCpf = " + cpf + "\nRg = " + rg + "\nMatricula = " + matricula + "\nSetor = " + setor.nome
				+ "\nSalario = " + "R$ " + salario + "\nIdade = " + idade + "\nGenero = " + genero.nome + "\nId = " + id + "\nNome = " + nome
				+ "\nTelefone = " + telefone + "\nEmail = " + email + endereco.toString();
	}
	
	
}
