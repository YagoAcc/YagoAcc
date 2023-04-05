package interfaces;

public class PingPong implements Jogo {

	@Override
	public void jogar() {
		System.out.println("Iniciando o jogo de Ping-Pong");
		System.out.println("Mova uma peça");
	}

	@Override
	public void fechar() {
		System.out.println("Fechando o jogo de Ping-Pong");
	}

}
