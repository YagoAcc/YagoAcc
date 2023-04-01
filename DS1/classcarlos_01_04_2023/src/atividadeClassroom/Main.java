package atividadeClassroom;

import java.time.LocalDate;
import java.time.Month;

public class Main {
	public static void main(String[] args) {
		Advogado a1 = new Advogado(1, "Claudio", "11111111", "um@email.com", Genero.MASCULINO, EstadoCivil.SOLTEIRO, LocalDate.of(1992, Month.JANUARY, 02), "111.111.111-11", "11.111.111-11","111111", Setor.JURIDICO, "1111111", 6000, new Endereco("Rua", "1", "Bloco A", "11.111-111", "Salvador", UnidadeFederativa.BAHIA));
		System.out.println(a1.toString());
	}
}
