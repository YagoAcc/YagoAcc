package InterfaceOperacaoMatematica;

public class Main {
	public static void main(String[] args) {
		Soma soma1 = new Soma();
		Subtracao subtracao1 = new Subtracao();
		Multiplicacao multiplicacao1 = new Multiplicacao();
		Divisao divisao1 = new Divisao();
		
		System.out.println(soma1.calcular(5, 5));
		System.out.println("\n" + subtracao1.calcular(5, 5));
		System.out.println("\n" + multiplicacao1.calcular(5, 5));
		System.out.println("\n" + divisao1.calcular(5, 5));
	}
}
