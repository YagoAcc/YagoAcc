package avaliacao_27_03_2023;

public class Main {
	public static void main(String[] args) {
		
		Engenheiro eng1 = new Engenheiro(1, "1", "Um", 25, Genero.MASCULINO, "111.111.111-11", "11.111.111-11", "111111", "11111111", "um@email.com", Setor.ENGENHARIA, 3400, new Endereco("Rua", "1", "Bloco A", "11.111-111", "Salvador", UnidadeFederativa.BAHIA));
		System.out.println(eng1.toString());
		
		Medico m1 = new Medico(2, "2", "Dois", 50, Genero.FEMININO, "222.222.222-22", "22.222.222-22", "222222", "22222222", "dois@email.com", Setor.SAUDE, 6800, new Endereco("Rua", "2", "Bloco B", "22.222-222", "Sao Paulo", UnidadeFederativa.SAO_PAULO));
		System.out.println(m1.toString());
		
		Advogado a1 = new Advogado(3, "3", "Tres", 33, Genero.MASCULINO, "333.333.333-33", "33.333.333-33", "333333", "33333333", "tres@email.com", Setor.JURIDICO, 8200, new Endereco("Conjunto", "3", "Bloco C", "33.333-333", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO));
		System.out.println(a1.toString());
		
		Juridica j1 = new Juridica(4, "Quatro", "44444444", "quatro@email.com", "444444", "4444444", new Endereco("Rua", "4", "Bloco D", "44.444-444", "Brasilia", UnidadeFederativa.DISTRITO_FEDERAL));
		System.out.println(j1.toString());
		
		Cliente c1 = new Cliente(555, 5, "Cinco", 47, Genero.FEMININO, "55555555", "cinco@email.com", new Endereco("Rua", "5", "Bloco E", "55.555-555", "Recife", UnidadeFederativa.PERNAMBUCO));
		System.out.println(c1.toString());
	}
}
