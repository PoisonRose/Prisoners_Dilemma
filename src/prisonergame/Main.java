package prisonergame;

public class Main {

	public static void main(String[] args) {
		
		Jogador[] linha = new Jogador[5];
		int n = linha.length;
		
		Jogador[] coluna = new Jogador[5];
		
		String[] nomes = new String[5];
		
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
		
		
		Jogo jogo = new Jogo();
		
		linha[0]=traicoeiro1;
		linha[1]=cooperativo1;
		linha[2]=aleatorio1;
		linha[3]=titfortat1;
		linha[4]=OPOsuspeito1;
		
		coluna[0]=traicoeiro2;
		coluna[1]=cooperativo2;
		coluna[2]=aleatorio2;
		coluna[3]=titfortat2;
		coluna[4]=OPOsuspeito2;
		
		nomes[0]="traicoeiro";
		nomes[1]="cooperativo";
		nomes[2]="aleatorio";
		nomes[3]="OlhoPorOlho";
		nomes[4]="Suspeito";
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				System.out.println(nomes[i]+" VS "+nomes[j]);
				jogo.jogarPartida(linha[i], coluna[j], 10);
			}
		}
	}

}
