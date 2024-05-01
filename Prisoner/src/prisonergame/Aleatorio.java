package prisonergame;

public class Aleatorio extends Jogador{
	@Override
	public int tomarDecisao() {
		return Math.random()<0.5 ? 0:1;
	}

}
