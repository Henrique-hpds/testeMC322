import java.util.ArrayList;

public class Peca {
    private final String cor;
    private final int valor;
    private Coordenada posicao;

    public Peca(String cor, Coordenada posicao, int valor) {
        this.cor = cor;
        this.valor = valor;
        this.posicao = posicao;
    }

    public String getCor() {
        return cor;
    }

    public int getValor(){
        return valor;
    }

    public Coordenada getPosicao() {
        return posicao;
    }

    public void setPosicao(Coordenada posicao) {
        this.posicao = posicao;
    }

    public ArrayList<Coordenada> getPossiveisMovimentos(Coordenada [] MOVIMENTO_PADRAO, Tabuleiro tabuleiro) {
        ArrayList <Coordenada> movimentos = new ArrayList<Coordenada>();
        
        for (Coordenada n: MOVIMENTO_PADRAO){
            Coordenada soma = getPosicao().soma(n);
            if (Validacao.coordenadaValida(soma) && Validacao.casaVazia(tabuleiro, n, this))
                movimentos.add(soma);
        }

        return movimentos;
    }
}
