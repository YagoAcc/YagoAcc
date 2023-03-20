package aula_15_03_2023;

public class Main {
	public static void main(String[] args) {
		
		Engenheiro eng1 = new Engenheiro("156472", Setor.ENGENHARIA, 1, "Jorge", 28, Genero.MASCULINO, "111.111.111-11", "11.111.111-11", "1004", 2800, new Endereco("Rua Manoel Dias", "01", "11", "11111-111", "Salvador", UnidadeFederativa.BAHIA));
		System.out.println(eng1.toString());
		System.out.println(eng1.endereco.toString());
	}
}
