package aula_15_03_2023;

public enum Genero {
	
	MASCULINO('M'),
	FEMININO('F');
	
	protected char genero;
	
	Genero(char genero){
		this.genero = genero;
	}
	
	public char getGenero() {
		return genero;
	}
}
