import java.util.ArrayList;

public class Bispo extends Peca{
     
    public Bispo(String cor, Coordenada posicao){
        super(cor, posicao, 3, "bispo");
    }

    private final static Coordenada[] MOVIMENTO_PADRAO = {new Coordenada(-7, -7), new Coordenada(-6, -6), new Coordenada(-5, -5), new Coordenada(-4, -4), new Coordenada(-3, -3), new Coordenada(-2, -2), new Coordenada(-1, -1), new Coordenada(1, 1), new Coordenada(2, 2), new Coordenada(3, 3), new Coordenada(4, 4), new Coordenada(5, 5), new Coordenada(6, 6), new Coordenada(7, 7), new Coordenada(7, -7), new Coordenada(6, -6), new Coordenada(5, -5), new Coordenada(4, -4), new Coordenada(3, -3), new Coordenada(2, -2), new Coordenada(1, -1), new Coordenada(1, -1), new Coordenada(2, -2), new Coordenada(3, -3), new Coordenada(4, -4), new Coordenada(5, -5), new Coordenada(6, -6), new Coordenada(7, -7)};

    public ArrayList<Coordenada> getPossiveisMovimentos(Tabuleiro tabuleiro){
        ArrayList <Coordenada> movimentosPossiveis = new ArrayList<Coordenada>();
        ArrayList <Coordenada> movimentosLegais = new ArrayList<Coordenada>();
        for(int i = -7; i <= 7; i++) {
            if(!tabuleiro.getCasa(i, i).estaOcupado() || !tabuleiro.getCasa(i, i).getCor().equals(getCor())) {
                Coordenada coord = new Coordenada(i, i);
                movimentosPossiveis.add(coord);
            }
            else {
                break;
            }
        }
        for(int i = -7; i <= 7; i++) {
            if(!tabuleiro.getCasa(-i, i).estaOcupado() || !tabuleiro.getCasa(-i, i).getCor().equals(getCor())) {
                Coordenada coord = new Coordenada(-i, i);
                movimentosPossiveis.add(coord);
            }
            else {
                break;
            }
        }
        for (Coordenada coord: movimentosPossiveis){
            Coordenada soma = getPosicao().soma(coord);
            if (Validacao.coordenadaValida(soma))
                movimentosLegais.add(soma);
        }
        return movimentosLegais;
    }
}
