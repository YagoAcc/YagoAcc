package funcionarioSalarioFinal;

import java.time.LocalDate;

public class Gerente extends CargoDeConfianca{
	public Gerente() {
		
	}

	public Gerente(String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissao,
			Bonificacao bonificacao) {
		super(nome, cpf, rg, genero, salarioBase, dataAdmissao, bonificacao);
	}
	
	public String getSalarioFinal(double salarioBase) {
		double salarioFinal = salarioBase + (salarioBase + Bonificacao.GERENTE.valor);
		return Util2.formatarBrl(salarioFinal);
	}

	@Override
	public String toString() {
		return  "\nGerente" + 
				"\nNome = " + this.nome + 
				"\nCpf = " + this.cpf + 
				"\nRg = " + this.rg + 
				"\nGenero = " + this.genero.texto + 
				"\nSalario Base = " + super.getSalarioBase() + 
				"\nData de Admissao = " + super.getDataAdmissao() +
				"\nSalario Final = " + this.getSalarioFinal(salarioBase);
	}
	
	
}
