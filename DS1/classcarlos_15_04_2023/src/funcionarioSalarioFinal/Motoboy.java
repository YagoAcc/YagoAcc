package funcionarioSalarioFinal;

import java.time.LocalDate;

public class Motoboy extends Funcionario{
	private String placaDaMoto;
	
	public Motoboy() {
		
	}

	public Motoboy(String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissao, String placaDaMoto) {
		super(nome, cpf, rg, genero, salarioBase, dataAdmissao);
		this.placaDaMoto = placaDaMoto;
	}

	public String getPlacaDaMoto() {
		return placaDaMoto;
	}

	public void setPlacaDaMoto(String placaDaMoto) {
		this.placaDaMoto = placaDaMoto;
	}
	
	@Override
	public String getSalarioFinal(double salarioBase) {
		return Util2.formatarBrl(salarioBase);
	}
	
	@Override
	public String toString() {
		return "\nMotoboy" + 
				"\nPlaca Da Moto = " + this.placaDaMoto + 
				"\nNome = " + this.nome + 
				"\nCpf = " + this.cpf + 
				"\nRg = " + this.rg + 
				"\nGenero = " + this.genero.texto + 
				"\nSalario Base = " + super.getSalarioBase() + 
				"\nData de Admissao = " + super.getDataAdmissao() +
				"\nSalario Final = " + this.getSalarioFinal(salarioBase);
	}
	
	
}
