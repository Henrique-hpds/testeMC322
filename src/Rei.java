import java.util.ArrayList;

public class Rei extends Peca{
    public Rei(String cor, Coordenada posicao){
        super(cor, posicao, 0, "rei"); // Ver a questao do valor
    }

    //private final static Coordenada[] MOVIMENTO_PADRAO = {new Coordenada(-1, 0), new Coordenada(-1, -1), new Coordenada(0, -1), new Coordenada(1, -1), new Coordenada(1, 0), new Coordenada(1, 1), new Coordenada(0, 1), new Coordenada(-1, 1)};

    
    public ArrayList<Coordenada> getPossiveisMovimentos(Tabuleiro tabuleiro){
    //     ArrayList <Coordenada> movimentosPossiveis = new ArrayList<Coordenada>();
    //     ArrayList <Coordenada> movimentosLegais = new ArrayList<Coordenada>();
    //     for(int i = -1; i <= 1; i++) {
    //         Coordenada coord = new Coordenada(i, i);
    //         Coordenada soma = getPosicao().soma(coord);
    //         if(!tabuleiro.getCasa(soma.x(), soma.y()).estaOcupado()) {
    //             movimentosPossiveis.add(soma);
    //         }
    //         else if(!tabuleiro.getCasa(soma.x(), soma.y()).getPeca().getCor().equals(getCor())) {
    //             movimentosPossiveis.add(soma);
    //             break;
    //         }
    //         else {
    //             break;
    //         }
    //     }
    //     for(int i = -1; i <= 1; i++) {
    //         Coordenada coord = new Coordenada(i, i);
    //         Coordenada soma = getPosicao().soma(coord);
    //         if(!tabuleiro.getCasa(-soma.x(), soma.y()).estaOcupado()) {
    //             movimentosPossiveis.add(coord);
    //         }
    //         else if(!tabuleiro.getCasa(-soma.x(), soma.y()).getPeca().getCor().equals(getCor())) {
    //             movimentosPossiveis.add(soma);
    //             break;
    //         }
    //         else {
    //             break;
    //         }
    //     }
    //     for(int i = -1; i <= 1; i++) {
    //         Coordenada coord = new Coordenada(i, 0);
    //         Coordenada soma = getPosicao().soma(coord);
    //         if(!tabuleiro.getCasa(soma.x(), soma.y()).estaOcupado()) {
    //             movimentosPossiveis.add(soma);
    //         }
    //         else if(!tabuleiro.getCasa(soma.x(), soma.y()).getPeca().getCor().equals(getCor())) {
    //             movimentosPossiveis.add(soma);
    //             break;
    //         }
    //         else {
    //             break;
    //         }
    //     }
    //     for(int i = -1; i <= 1; i++) {
    //         Coordenada coord = new Coordenada(0, i);
    //         Coordenada soma = getPosicao().soma(coord);
    //         if(!tabuleiro.getCasa(soma.x(), soma.y()).estaOcupado()) {
    //             movimentosPossiveis.add(soma);
    //         }
    //         else if(!tabuleiro.getCasa(soma.x(), soma.y()).getPeca().getCor().equals(getCor())) {
    //             movimentosPossiveis.add(soma);
    //             break;
    //         }
    //         else {
    //             break;
    //         }
    //     }
    //     //Lembrar de conferir se o caso onde a peça é movida para a mesma casa é aceito como jogada legal
    //     for (Coordenada coord: movimentosPossiveis){
    //         //Coordenada soma = getPosicao().soma(coord);
    //         if (Validacao.coordenadaValida(coord))
    //             movimentosLegais.add(coord);
    //     }
    //     if(movimentosLegais.size() == 0) {
    //         xequeMate();
    //     }
        // return movimentosLegais;
        return new ArrayList<Coordenada>();
    }

    public void xequeMate() {

    }
}
