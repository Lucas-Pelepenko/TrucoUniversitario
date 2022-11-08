package jun.truco.model;

public class Turno {

	private Jogador[] jogadores;
	private int posicao;
	
	
	public  Turno(Jogador[] j){
		this.jogadores = j;	
		posicao = 0;
	}

	public Jogador vezJogador(){
		Jogador j = jogadores[posicao];
		return (posicao < jogadores.length) ? j : null;
	}

	public boolean hasnext(){
		return (posicao >= jogadores.length) ? true : false;
	}

	public Jogador next(){
		if(posicao >= jogadores.length)return null;
		Jogador j = jogadores[posicao];
		posicao++;
		return j;
	}
	public Jogador[] getJogador(){
		return jogadores;
	}
	public int getPosicao(){
		return posicao;
	}
}
