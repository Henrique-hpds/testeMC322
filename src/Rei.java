import java.util.ArrayList;

public class Rei extends Peca{
    public Rei(String cor, Coordenada posicao){
        super(cor, posicao, 10, "rei");
    }
    
    public ArrayList<Coordenada> getPossiveisMovimentos(Tabuleiro tabuleiro){
        ArrayList<Coordenada> movimentosPossiveis = new ArrayList<Coordenada>();

        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                Coordenada coord = new Coordenada(i, j);
                Coordenada soma = coord.soma(getPosicao());
                if(i == 0 && j == 0) continue;
                else if(Validacao.coordenadaValida(soma) && !tabuleiro.getCasa(soma.x(), soma.y()).estaOcupado())
                    movimentosPossiveis.add(soma);            
                else{
                    if(Validacao.coordenadaValida(soma) &&  !getCor().equals(tabuleiro.getCasa(soma.x(), soma.y()).getPeca().getCor()))
                        movimentosPossiveis.add(soma);
                }
            }
        }
        
        return movimentosPossiveis;
    }

    public void xequeMate() {

    }
}
