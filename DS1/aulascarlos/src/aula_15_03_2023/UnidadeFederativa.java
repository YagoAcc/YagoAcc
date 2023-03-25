package aula_15_03_2023;

public enum UnidadeFederativa {

	BAHIA("Bahia", "BA"), SAO_PAULO("Sao Paulo", "SP"), RIO_DE_JANEIRO("Rio de Janeiro", "RJ");

	protected String nome, sigla;

	UnidadeFederativa(String nome, String sigla) {
		this.nome = nome;
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public String getSigla() {
		return sigla;
	}

}
