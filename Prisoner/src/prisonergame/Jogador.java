package prisonergame;

public class Jogador {
	protected int pontuacao;
	
	public int tomarDecisao() {
		return 0;
	}
	
	public void adicionarPontuacao(int pontos) {
		pontuacao+=pontos;
	}
	
	public int getPontuacao() {
		return pontuacao;
	}
	public void resetarPontuacao() {
		pontuacao = 0;
	}
}
