package InterfaceAnimal;

public class Pato implements Animal {

	@Override
	public void emitirSom() {
		System.out.println("Quack Quack Quack");
	}

	@Override
	public void comer() {
		System.out.println("Pato comendo");
	}

}
