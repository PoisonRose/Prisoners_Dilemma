package prisonergame;

public class Jogo {
	
	public static final int TraicaoUnilateral = 5;
	public static final int CooperacaoMutua = 3;
	public static final int TraicaoMutua = 1;
	public static final int CooperacaoUnilateral =  0;
	public int iteracoes = 10; //O número de iterações será aleatório, 10 é um placeholder.
	
	public Jogo(Jogador jogador1, Jogador jogador2) {
		
	}
	public Jogo() {
	}
	public void jogarPartida(Jogador jogador1, Jogador jogador2) {
		for(int i = 0;i<iteracoes;i++) {
			calcularResultado(jogador1, jogador2);
		}
		System.out.println("Jogador 1: "+jogador1.getPontuacao());
		System.out.println("Jogador 2: "+jogador2.getPontuacao());
		jogador1.resetarPontuacao();
		jogador2.resetarPontuacao();
	}
	public void jogarRodada(Jogador jogador1, Jogador jogador2) {
		calcularResultado(jogador1, jogador2);
	}
	
	public void calcularResultado(Jogador jogador1, Jogador jogador2) {
		int decisaoJogador1 = jogador1.tomarDecisao();
		int decisaoJogador2 = jogador2.tomarDecisao();
		
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
}
