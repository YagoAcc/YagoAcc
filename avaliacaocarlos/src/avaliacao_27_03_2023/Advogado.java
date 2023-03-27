package avaliacao_27_03_2023;

public class Advogado extends Funcionario{
	private String OAB;
	
	protected Advogado() {
		
	}

	protected Advogado(int id, String OAB, String nome, int idade, Genero genero, String cpf, String rg, String matricula,
			String telefone, String email, Setor setor, double salario, Endereco endereco) {
		super(id, nome, idade, genero, cpf, rg, matricula, telefone, email, setor, salario, endereco);
		this.OAB = OAB;
	}

	protected String getOAB() {
		return OAB;
	}

	protected void setOAB(String oAB) {
		OAB = oAB;
	}

	@Override
	public String toString() {
		return "\n\nAdvogado"  + "\nOAB = " + OAB + "\nCpf = " + cpf + "\nRg = " + rg + "\nMatricula = " + matricula + "\nSetor = " + setor.nome
				+ "\nSalario = " + "R$ " + salario + "\nIdade = " + idade + "\nGenero = " + genero.nome + "\nId = " + id + "\nNome = " + nome
				+ "\nTelefone = " + telefone + "\nEmail = " + email + endereco.toString();
	}
	
	
}
