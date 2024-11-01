package prisonergame;

public class Main {

	public static void main(String[] args) {
		
		
		
		Jogador traicoeiro1 = new Traicoeiro();
		Jogador traicoeiro2 = new Traicoeiro();
		Jogador cooperativo1 = new Cooperativo();
		Jogador cooperativo2 = new Cooperativo();
		Jogador aleatorio1 = new Aleatorio();
		Jogador aleatorio2 = new Aleatorio();
		Jogador titfortat1 = new OlhoPorOlho();
		Jogador titfortat2 = new OlhoPorOlho();
		Jogador OPOsuspeito1 = new OPOSuspeito();
		Jogador OPOsuspeito2 = new OPOSuspeito();
		
		Jogador[] linha = new Jogador[] {traicoeiro1,cooperativo1,aleatorio1,titfortat1,OPOsuspeito1};
		int n = linha.length;
		
		Jogador[] coluna = new Jogador[] {traicoeiro2,cooperativo2,aleatorio2,titfortat2,OPOsuspeito2};
		
		String[] nomes = new String[] {"traicoeiro","cooperativo","aleatorio","OlhoPorOlho","Suspeito"};
		
		Jogo jogo = new Jogo();
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				System.out.println(nomes[i]+" VS "+nomes[j]);
				jogo.jogarPartida(linha[i], coluna[j], 10);
			}
		}
	}

}
