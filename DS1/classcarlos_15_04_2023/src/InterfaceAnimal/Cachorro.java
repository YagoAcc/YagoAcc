package InterfaceAnimal;

public class Cachorro implements Animal {

	@Override
	public void emitirSom() {
		System.out.println("Au Au Au");
	}

	@Override
	public void comer() {
		System.out.println("Cachorro comendo");
	}

}
