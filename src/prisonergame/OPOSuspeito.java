package prisonergame;

public class OPOSuspeito extends Jogador {
	@Override
	public int tomarDecisao(int i) {
		if (i==0) {
			return 0;
		}
		else {
			return Jogo.getUltimaJogada(this.getCoJogador());
		}
	}
}
