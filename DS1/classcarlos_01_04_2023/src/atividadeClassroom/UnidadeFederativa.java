package atividadeClassroom;

public enum UnidadeFederativa {
	ACRE("Acre", "AC"),
	ALAGOAS("Alagoas", "AL"),
	AMAPA("Amapa", "AP"),
	AMAZONAS("Amazonas", "AM"),
	BAHIA("Bahia", "BA"),
	CEARA("Ceara", "CE"),
	ESPIRITO_SANTO("Espirito Santo", "ES"),
	GOIAS("Goias", "GO"),
	MARANHAO("Maranhao", "MA"),
	MATO_GROSSO("Mato Grosso", "MT"),
	MATO_GROSSO_DO_SUL("Mato Grosso do Sul", "MS"),
	MINAS_GERAIS("Minas Gerais", "MG"),
	PARA("Para", "PA"),
	PARAIBA("Paraiba", "PB"),
	PARANA("Parana", "PR"),
	PERNAMBUCO("Pernambuco", "PE"),
	PIAUI("Piaui", "PI"),
	RIO_DE_JANEIRO("Rio de Janeiro", "RJ"),
	RIO_GRANDE_DO_NORTE("Rio Grande do Norte", "RN"),
	RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS"),
	RONDONIA("Rondonia", "RO"),
	RORAIMA("Roraima", "RR"),
	SANTA_CATARINA("Santa Catarina", "SC"),
	SAO_PAULO("Sao Paulo", "SP"),
	SERGIPE("Sergipe", "SE"),
	TOCANTINS("Tocantins", "TO"),
	DISTRITO_FEDERAL("Distrito Federal", "DF");
	
	String nome, sigla;

	private UnidadeFederativa(String nome, String sigla) {
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
