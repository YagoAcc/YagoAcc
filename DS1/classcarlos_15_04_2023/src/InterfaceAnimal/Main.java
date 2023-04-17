package InterfaceAnimal;

public class Main {
	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro();
		Gato gato1 = new Gato();
		Galo galo1 = new Galo();
		Pato pato1 = new Pato();
		
		cachorro1.emitirSom();
		cachorro1.comer();
		
		System.out.println("\n");
		gato1.emitirSom();
		gato1.comer();
		
		System.out.println("\n");
		galo1.emitirSom();
		galo1.comer();
		
		System.out.println("\n");
		pato1.emitirSom();
		pato1.comer();
	}
}
