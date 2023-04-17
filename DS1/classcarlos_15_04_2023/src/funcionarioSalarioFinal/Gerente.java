package funcionarioSalarioFinal;

import java.time.LocalDate;

public class Gerente extends CargoDeConfianca{
	public Gerente() {
		
	}

	public Gerente(String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissao) {
		super(nome, cpf, rg, genero, salarioBase, dataAdmissao, Bonificacao.GERENTE);
	}
	
	@Override
	public String getSalarioFinal(double salarioBase) {
		double salarioFinal = salarioBase + (salarioBase * Bonificacao.GERENTE.valor);
		return Util2.formatarBrl(salarioFinal);
	}

	@Override
	public String toString() {
		return  "\nGerente" + 
				"\nNome = " + super.nome + 
				"\nCpf = " + super.cpf + 
				"\nRg = " + super.rg + 
				"\nGenero = " + super.genero.texto + 
				"\nSalario Base = " + super.getSalarioBase() + 
				"\nData de Admissao = " + super.getDataAdmissao() +
				"\nSalario Final = " + this.getSalarioFinal(salarioBase);
	}
	
	
}
