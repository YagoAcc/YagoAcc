package avaliacao_27_03_2023;

public enum Genero {
	MASCULINO("Masculino", 'M'),
	FEMININO("Feminino", 'F');
	
	String nome;
	char sigla;
	
	private Genero(String nome, char sigla) {
		this.nome = nome;
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public char getSigla() {
		return sigla;
	}
	
	
}
