package Arquivos;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Programa programa1 = new Programa();
		
		System.out.println(programa1.salvar("aula1", ".txt"));
		System.out.println(programa1.salvar("aula1", LocalDate.now(), ".txt"));
	}
}
