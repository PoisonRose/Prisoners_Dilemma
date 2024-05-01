package prisonergame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jogador traicoeiro = new Traicoeiro();
		Jogador cooperativo = new Cooperativo();
		Jogador aleatorio = new Aleatorio();
		
		
		Jogo jogo = new Jogo();
		System.out.println("Traicoeiro VS Traicoeiro");
		jogo.jogarPartida(traicoeiro, traicoeiro);
		System.out.println("Traicoeiro VS Cooperativo");
		jogo.jogarPartida(traicoeiro, cooperativo);
		System.out.println("Traicoeiro VS Aleatorio");
		jogo.jogarPartida(traicoeiro, aleatorio);
		System.out.println("Cooperativo VS Cooperativo");
		jogo.jogarPartida(cooperativo, cooperativo);
		System.out.println("Cooperativo VS Aleatorio");
		jogo.jogarPartida(cooperativo, aleatorio);
		System.out.println("Aleatorio VS Aleatorio");
		jogo.jogarPartida(aleatorio, aleatorio);
	}

}
