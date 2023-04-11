package Arquivos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Programa {

	public String salvar(String nome, String extension) {
		return nome + extension;
	}
	
	public String salvar(String nome, LocalDate dataDeHoje, String extension) {
		DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		return nome + "-" + dataDeHoje.format(formatar) + extension;
	}
}
