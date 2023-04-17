package funcionarioSalarioFinal;

import java.time.LocalDate;

public class Diretor extends CargoDeConfianca{
	private double PARTICIPACAO_LUCRO = 0.1; 
	
	public Diretor() {
		
	}

	public Diretor(String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissao,
			Bonificacao bonificacao) {
		super(nome, cpf, rg, genero, salarioBase, dataAdmissao, bonificacao);
		
	}

	public double getPARTICIPACAO_LUCRO() {
		return PARTICIPACAO_LUCRO;
	}

	public void setPARTICIPACAO_LUCRO(double pARTICIPACAO_LUCRO) {
		PARTICIPACAO_LUCRO = pARTICIPACAO_LUCRO;
	}
	
	public String getSalarioFinal(double salarioBase) {
		double salarioFinal = salarioBase + (salarioBase + Bonificacao.DIRETOR.valor) + (salarioBase + PARTICIPACAO_LUCRO);
		return Util2.formatarBrl(salarioFinal);
	}

	@Override
	public String toString() {
		return "\nDiretor"+ 
				"\nNome = " + this.nome + 
				"\nCpf = " + this.cpf + 
				"\nRg = " + this.rg + 
				"\nGenero = " + this.genero.texto + 
				"\nSalario Base = " + super.getSalarioBase() + 
				"\nData de Admissao = " + super.getDataAdmissao() +
				"\nSalario Final = " + this.getSalarioFinal(salarioBase);
	}
	
	
}
