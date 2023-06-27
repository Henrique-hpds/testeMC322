import java.util.ArrayList;

public class Rei extends Peca{
    private boolean selecionado = false;

    public boolean isSelecionado() {
        return selecionado;
    }

    public void setSelecionado(boolean selecionado) {
        this.selecionado = selecionado;
    }

    public Rei(String cor, Coordenada posicao){
        super(cor, posicao, 10, "rei");
    }
    
    public ArrayList<Coordenada> getPossiveisMovimentos(Tabuleiro tabuleiro){
        ArrayList<Coordenada> movimentosPossiveis = new ArrayList<Coordenada>();

        ArrayList<Coordenada> movimentosInimigos;
        if(getCor().equals("branco"))
        movimentosInimigos = tabuleiro.todoMovimentosJogador("preto");
        else
        movimentosInimigos = tabuleiro.todoMovimentosJogador("branco");
        // System.out.println(movimentosInimigos);

        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                Coordenada coord = new Coordenada(i, j);
                Coordenada soma = coord.soma(getPosicao());
                if(i == 0 && j == 0) continue;
                else if(!naLista(movimentosInimigos, soma) && Validacao.coordenadaValida(soma) && !tabuleiro.getCasa(soma.x(), soma.y()).estaOcupado())
                    movimentosPossiveis.add(soma);            
                else{
                    if(!naLista(movimentosInimigos, soma) && Validacao.coordenadaValida(soma) &&  !getCor().equals(tabuleiro.getCasa(soma.x(), soma.y()).getPeca().getCor()))
                        movimentosPossiveis.add(soma);
                }
            }
        }
        
        return movimentosPossiveis;
    }

    private boolean naLista (ArrayList<Coordenada> lista, Coordenada elemento){
        for(Coordenada coord: lista){
            if(coord.x() == elemento.x() && coord.y() == elemento.y()){
                System.out.print("                                              ");
                System.out.println(coord);
                return true;
            }
        }
        return false;
    }

    public void xequeMate() {

    }
}
