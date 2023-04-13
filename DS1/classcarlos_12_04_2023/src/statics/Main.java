package statics;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Aloha", LocalDate.of(2001, 06, 15), 4000);
		
		System.out.println(p1.getNome());
		System.out.println(p1.getdataDeNascimento());
		System.out.println(p1.getSalario());
	}
}
