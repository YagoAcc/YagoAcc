package atividadeClassroom;

public enum Setor {
	ENGENHARIA("Engenharia"),
	SAUDE("Saude"),
	JURIDICO("Juridico");
	
	String nome;

	private Setor(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	
}
