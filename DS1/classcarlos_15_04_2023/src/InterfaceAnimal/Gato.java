package InterfaceAnimal;

public class Gato implements Animal {

	@Override
	public void emitirSom() {
		System.out.println("Miau Miau Miau");
	}

	@Override
	public void comer() {
		System.out.println("Gato comendo");
	}

}
