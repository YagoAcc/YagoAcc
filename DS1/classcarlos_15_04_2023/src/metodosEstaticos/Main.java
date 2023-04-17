package metodosEstaticos;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario(1, "Reginaldo", "111.111.111-11", "11.111.111-11", Genero.MASCULINO, LocalDate.of(2001, 6, 15), 4000, new Endereco("Rua", "55", "Bloco A", "41250-520", "Salvador", "BA"));
		Juridica j1 = new Juridica(1, "Less", "45161", "44600", LocalDate.of(2000, 1, 1), LocalDate.of(2015, 1, 1), 8000, Genero.FEMININO, new Endereco("Conjunto", "52", "Bloco C", "4541231", "Rio de Janeiro", "RJ"));
		
		System.out.println(f1.toString());
		System.out.println(j1.toString());
	}
}
