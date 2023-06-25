import java.util.ArrayList;

public class Torre extends Peca{

    public Torre(String cor, Coordenada posicao){
        super(cor, posicao, 5, "torre");
    }
    
    public ArrayList<Coordenada> getPossiveisMovimentos(Tabuleiro tabuleiro){
        ArrayList <Coordenada> movimentosPossiveis = new ArrayList<Coordenada>();
        ArrayList <Coordenada> movimentosLegais = new ArrayList<Coordenada>();
        for(int i = -7; i <= 7; i++) {
            if(!tabuleiro.getCasa(i, 0).estaOcupado() || !tabuleiro.getCasa(i, 0).getCor().equals(getCor())) {
                Coordenada coord = new Coordenada(i, 0);
                movimentosPossiveis.add(coord);
            }
            else {
                break;
            }
        }
        for(int i = -7; i <= 7; i++) {
            if(!tabuleiro.getCasa(0, i).estaOcupado() || !tabuleiro.getCasa(0, i).getCor().equals(getCor())) {
                Coordenada coord = new Coordenada(0, i);
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
