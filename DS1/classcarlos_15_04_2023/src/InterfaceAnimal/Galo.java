package InterfaceAnimal;

public class Galo implements Animal {

	@Override
	public void emitirSom() {
		System.out.println("Cocorico");
	}

	@Override
	public void comer() {
		System.out.println("Galo comendo");
	}

}
