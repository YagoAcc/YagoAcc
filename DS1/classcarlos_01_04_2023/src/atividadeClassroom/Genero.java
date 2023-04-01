package atividadeClassroom;

public enum Genero {
	MASCULINO("Masculino", 'M'),
	FEMININO("Feminino", 'F');
	
	String texto;
	char sexo;
	
	private Genero(String texto, char sexo) {
		this.texto = texto;
		this.sexo = sexo;
	}

	public String getTexto() {
		return texto;
	}

	public char getSexo() {
		return sexo;
	}
	
	
}
