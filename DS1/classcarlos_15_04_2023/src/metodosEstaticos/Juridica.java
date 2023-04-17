package metodosEstaticos;

import java.time.LocalDate;

public class Juridica extends Pessoa{
	private String cnpj, inscricaoEstadual;
	private LocalDate dataInicio, dataTermino;
	private double valorContrato;
	
	public Juridica() {
		
	}

	public Juridica(int id, String nome, String cnpj, String inscricaoEstadual, LocalDate dataInicio, LocalDate dataTermino, double valorContrato, Genero genero, Endereco endereco) {
		super(id, nome, genero, endereco);
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.valorContrato = valorContrato;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(LocalDate dataTermino) {
		this.dataTermino = dataTermino;
	}

	public double getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(double valorContrato) {
		this.valorContrato = valorContrato;
	}

	@Override
	public String toString() {
		return "\nJuridica" + 
				"\nCnpj = " + this.cnpj + 
				"\nInscricaoo Estadual = " + this.inscricaoEstadual + 
				"\nData de Inicio = " + Util2.FormatarData(getDataInicio()) + 
				"\nData de Termino = " + Util2.FormatarData(getDataTermino()) + 
				"\nValor do Contrato = " + Util2.FormatarMoeda(getValorContrato()) + 
				"\nId = " + this.id + 
				"\nNome = " + this.nome + 
				"\nGenero = " + this.genero.texto + 
				"\n" + this.endereco.toString();
	}
	
	
}
