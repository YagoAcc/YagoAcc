package avaliacao_27_03_2023;

public class Medico extends Funcionario{
	private String CRM;
	
	protected Medico() {
		
	}

	protected Medico(int id, String CRM, String nome, int idade, Genero genero, String cpf, String rg, String matricula,
			String telefone, String email, Setor setor, double salario, Endereco endereco) {
		super(id, nome, idade, genero, cpf, rg, matricula, telefone, email, setor, salario, endereco);
		this.CRM = CRM;
	}

	protected String getCRM() {
		return CRM;
	}

	protected void setCRM(String cRM) {
		CRM = cRM;
	}

	@Override
	public String toString() {
		return "\n\nMedico"  + "\nCRM = " + CRM + "\nCpf = " + cpf + "\nRg = " + rg + "\nMatricula = " + matricula + "\nSetor = " + setor.nome
				+ "\nSalario = " + "R$ " + salario + "\nIdade = " + idade + "\nGenero = " + genero.nome + "\nId = " + id + "\nNome = " + nome
				+ "\nTelefone = " + telefone + "\nEmail = " + email + endereco.toString();
	}
	
	
}
