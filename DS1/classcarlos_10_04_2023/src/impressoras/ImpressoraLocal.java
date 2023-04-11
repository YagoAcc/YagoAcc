package impressoras;

public class ImpressoraLocal{
	
	private Imprimir imprimirAgora;
	
	public void imprimir(Imprimir imprimirAgora) {
		this.imprimirAgora = imprimirAgora;
		this.imprimirAgora.Impress();
	}
	
}
