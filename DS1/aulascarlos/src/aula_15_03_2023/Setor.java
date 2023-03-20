package aula_15_03_2023;

public enum Setor {
	
	ENGENHARIA("engenharia"),
	SAUDE("saude"),
	JURIDICO("juridico");
	
	protected String setor;
	
	Setor(String setor){
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}

}
