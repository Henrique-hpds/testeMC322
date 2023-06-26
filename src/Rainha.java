import java.util.ArrayList;

public class Rainha extends Peca{
    
    public Rainha(String cor, Coordenada posicao){
        super(cor, posicao, 9, "rainha");
    }

    //private final static Coordenada[] MOVIMENTO_PADRAO = {new Coordenada(-7, -7), new Coordenada(-6, -6), new Coordenada(-5, -5), new Coordenada(-4, -4), new Coordenada(-3, -3), new Coordenada(-2, -2), new Coordenada(-1, -1), new Coordenada(1, 1), new Coordenada(2, 2), new Coordenada(3, 3), new Coordenada(4, 4), new Coordenada(5, 5), new Coordenada(6, 6), new Coordenada(7, 7), new Coordenada(7, -7), new Coordenada(6, -6), new Coordenada(5, -5), new Coordenada(4, -4), new Coordenada(3, -3), new Coordenada(2, -2), new Coordenada(1, -1), new Coordenada(1, -1), new Coordenada(2, -2), new Coordenada(3, -3), new Coordenada(4, -4), new Coordenada(5, -5), new Coordenada(6, -6), new Coordenada(7, -7), new Coordenada(0, -7), new Coordenada(0, -6), new Coordenada(0, -5), new Coordenada(0, -4), new Coordenada(0, -3), new Coordenada(0, -2), new Coordenada(0, -1), new Coordenada(0, 1), new Coordenada(0, 2), new Coordenada(0, 3), new Coordenada(0, 4), new Coordenada(0, 5), new Coordenada(0, 6), new Coordenada(0, 7), new Coordenada(-7, 0), new Coordenada(-6, 0), new Coordenada(-5, 0), new Coordenada(-4, 0), new Coordenada(-3, 0), new Coordenada(-2, 0), new Coordenada(-1, 0), new Coordenada(1, 0), new Coordenada(2, 0), new Coordenada(3, 0), new Coordenada(4, 0), new Coordenada(5, 0), new Coordenada(6, 0), new Coordenada(7, 0)};

    
    public ArrayList<Coordenada> getPossiveisMovimentos(Tabuleiro tabuleiro){
        ArrayList <Coordenada> movimentosPossiveis = new ArrayList<Coordenada>();
        ArrayList <Coordenada> movimentosLegais = new ArrayList<Coordenada>();
        //Movimentação na primeira diagonal
        for(int i = -7; i <= 7; i++) {
            Coordenada coord = new Coordenada(i, i);
            Coordenada soma = getPosicao().soma(coord);
            if(!tabuleiro.getCasa(soma.x(), soma.y()).estaOcupado() || !tabuleiro.getCasa(soma.x(), soma.y()).getCor().equals(getCor())) {
                movimentosPossiveis.add(soma);
            }
            else if(!tabuleiro.getCasa(soma.x(), soma.y()).getCor().equals(getCor())) {
                movimentosPossiveis.add(soma);
                break;
            }
            else {
                break;
            }
        }
        //Movimentação na segunda diagonal
        for(int i = -7; i <= 7; i++) {
            Coordenada coord = new Coordenada(i, i);
            Coordenada soma = getPosicao().soma(coord);
            if(!tabuleiro.getCasa(-soma.x(), soma.y()).estaOcupado()) {
                movimentosPossiveis.add(coord);
            }
            else if(!tabuleiro.getCasa(soma.x(), soma.y()).getPeca().getCor().equals(getCor())) {
                movimentosPossiveis.add(soma);
                break;
            }
            else {
                break;
            }
        }
        //Movimentação em linha na horizontal
        for(int i = -7; i <= 7; i++) {
            Coordenada coord = new Coordenada(i, 0);
            Coordenada soma = getPosicao().soma(coord);
            if(!tabuleiro.getCasa(soma.x(), soma.y()).estaOcupado()) {
                movimentosPossiveis.add(soma);
            }
            else if(!tabuleiro.getCasa(soma.x(), soma.y()).getPeca().getCor().equals(getCor())) {
                movimentosPossiveis.add(soma);
                break;
            }
            else {
                break;
            }
        }
        //Movimentação em linha na vertical
        for(int i = -7; i <= 7; i++) {
            Coordenada coord = new Coordenada(0, i);
            Coordenada soma = getPosicao().soma(coord);
            if(!tabuleiro.getCasa(soma.x(), soma.y()).estaOcupado()) {
                movimentosPossiveis.add(soma);
            }
            else if(!tabuleiro.getCasa(soma.x(), soma.y()).getPeca().getCor().equals(getCor())) {
                movimentosPossiveis.add(soma);
                break;
            }
            else {
                break;
            }
        }
        //Lembrar de conferir se o caso onde a peça é movida para a mesma casa é aceito como jogada legal
        for (Coordenada coord: movimentosPossiveis){
            //Coordenada soma = getPosicao().soma(coord);
            if (Validacao.coordenadaValida(coord))
                movimentosLegais.add(coord);
        }
        return movimentosLegais;
    }
}
