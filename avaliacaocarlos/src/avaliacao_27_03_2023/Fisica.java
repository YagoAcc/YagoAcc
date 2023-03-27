package avaliacao_27_03_2023;

public abstract class Fisica extends Pessoa{
	
	protected int idade;
	Genero genero;
	
	public Fisica() {
		
	}

	public Fisica(int id, String nome, int idade, Genero genero, String telefone, String email, Endereco endereco) {
		super(id, nome, telefone, email, endereco);
		this.idade = idade;
		this.genero = genero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
}
