package prisonergame;

public class OlhoPorOlho extends Jogador {
	@Override
	public int tomarDecisao(int i) {
		if (i==0) {
			return 1;
		}
		else {
			return Jogo.getUltimaJogada(this.getCoJogador());
		}
	}
}
