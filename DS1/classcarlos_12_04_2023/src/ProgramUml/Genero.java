package ProgramUml;

public enum Genero {
	MASCULINO("Masculino"),
	FEMININO("Feminino");
	
	String texto;
	
	private Genero(){
		
	}
	
	private Genero(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}
	
}
