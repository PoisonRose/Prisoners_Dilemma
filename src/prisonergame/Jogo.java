package prisonergame;

public class Jogo {
	
	public static final int TraicaoUnilateral = 5;
	public static final int CooperacaoMutua = 3;
	public static final int TraicaoMutua = 1;
	public static final int CooperacaoUnilateral =  0;
	
	public Jogo(Jogador jogador1, Jogador jogador2) {
		jogador1.setCoJogador(jogador2);
		jogador2.setCoJogador(jogador1);
	}
	public Jogo() {
	}
	
	public void jogarPartida(Jogador jogador1, Jogador jogador2, int iteracoes) {
		jogador1.setCoJogador(jogador2);
		jogador2.setCoJogador(jogador1);
		for(int i = 0;i<iteracoes;i++) {
			calcularResultado(jogador1, jogador2, i);
		}
		System.out.println("Jogador 1: "+jogador1.getPontuacao());
		System.out.println("Jogador 2: "+jogador2.getPontuacao());
		jogador1.resetPontuacao();
		jogador2.resetPontuacao();
		jogador1.limparJogadas();
		jogador2.limparJogadas();
	}
	public void jogarRodada(Jogador jogador1, Jogador jogador2) {
		
		calcularResultado(jogador1, jogador2, 1);
	}
	
	public void calcularResultado(Jogador jogador1, Jogador jogador2, int iteracao) {
		int decisaoJogador1 = jogador1.tomarDecisao(iteracao);
		int decisaoJogador2 = jogador2.tomarDecisao(iteracao);
		jogador1.listarJogada(decisaoJogador1, iteracao);
		jogador2.listarJogada(decisaoJogador2, iteracao);
		
		if ((decisaoJogador1 == 1) && (decisaoJogador2 == 1)) {
			jogador1.adicionarPontuacao(CooperacaoMutua);
			jogador2.adicionarPontuacao(CooperacaoMutua);
		}
		else if ((decisaoJogador1 == 1) && (decisaoJogador2 == 0)) {
			jogador1.adicionarPontuacao(CooperacaoUnilateral);
			jogador2.adicionarPontuacao(TraicaoUnilateral);
		}
		else if ((decisaoJogador1 == 0) && (decisaoJogador2 == 1)) {
			jogador1.adicionarPontuacao(TraicaoUnilateral);
			jogador2.adicionarPontuacao(CooperacaoUnilateral);
		}
		else {
			jogador1.adicionarPontuacao(TraicaoMutua);
			jogador2.adicionarPontuacao(TraicaoMutua);
		}
	}
	
	public static int getUltimaJogada(Jogador jogador) {
		return jogador.getUltimaJogada();
	}
	
}
