import java.util.ArrayList;

public class Torre extends Peca{

    public Torre(String cor, Coordenada posicao){
        super(cor, posicao, 5, "torre");
    }
    
    public ArrayList<Coordenada> getPossiveisMovimentos(Tabuleiro tabuleiro){
        ArrayList <Coordenada> movimentosPossiveis = new ArrayList<Coordenada>();
        ArrayList <Coordenada> movimentosLegais = new ArrayList<Coordenada>();
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
        for (Coordenada coord: movimentosPossiveis){
            //Coordenada soma = getPosicao().soma(coord);
            if (Validacao.coordenadaValida(coord))
                movimentosLegais.add(coord);
        }
        return movimentosLegais;
    }
}
