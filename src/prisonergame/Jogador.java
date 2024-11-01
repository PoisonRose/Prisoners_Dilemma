package prisonergame;

import java.util.Stack;
import java.util.ArrayList;

public abstract class Jogador {
	private int pontuacao;
	private Jogador coJogador;
	private Stack<Integer> pilhaDeJogadas;
	private ArrayList<Integer> listaDeJogadas;
	
	public Jogador() {
		pilhaDeJogadas = new Stack<>();
		listaDeJogadas = new ArrayList<>();
	}
	
	public int getPontuacao() {
		return pontuacao;
	}
	
	public void resetPontuacao() {
		pontuacao = 0;
	}
	
	public void adicionarPontuacao(int pontos) {
		pontuacao+=pontos;
	}
	
	public void setCoJogador(Jogador oponente) {
		coJogador = oponente;
	}
	
	public Jogador getCoJogador() {
		return coJogador;
	}
	
	public int getUltimaJogada() {
		return (int) pilhaDeJogadas.peek();
	}
	
	public ArrayList<Integer> getListaDeJogadas() {
		return listaDeJogadas;
	}
	
	public int getJogada(int endereco) {
		return listaDeJogadas.get(endereco);
	}
	
	public void limparJogadas() {
		listaDeJogadas.clear();
		pilhaDeJogadas.clear();
	}
	
	abstract public int tomarDecisao(int i);
	
	public void listarJogada(int jogada, int iteracao) {
		pilhaDeJogadas.push(jogada);
		listaDeJogadas.add(iteracao, jogada);
	}
}
