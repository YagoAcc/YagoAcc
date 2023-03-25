package aula_15_03_2023;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		
		Medico m1 = new Medico("1", Setor.SAUDE, 1, "Raul", 36, Genero.MASCULINO, LocalDate.of(2001, 6, 15), "1", "1", "1", 8000, new Endereco("Rua", "1", "bloco A", "1", "Salvador", UnidadeFederativa.BAHIA));
		System.out.println(m1.toString());
		
		
		LoginInformatica l1 = new LoginInformatica(1, "oi", 21, Genero.MASCULINO, LocalDate.of(2023, 3, 22), LocalDate.of(2015, 6, 1), LocalDate.of(2023, 12, 31), "1", "1", new Endereco("Rua", "1", "bloco A", "1", "Salvador", UnidadeFederativa.BAHIA));
		System.out.println(l1.toString());
	}
}
