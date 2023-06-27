import java.util.ArrayList;

abstract public class Peca {
    private final String cor;
    private final int valor;
    private Coordenada posicao;
    private final String tag;

    public Peca(String cor, Coordenada posicao, int valor, String tag) {
        this.cor = cor;
        this.valor = valor;
        this.posicao = posicao;
        this.tag = tag;
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

    public String getTag(){
        return tag;
    }

    public void setPosicao(Coordenada posicao) {
        this.posicao = posicao;
    }

    abstract public ArrayList<Coordenada> getPossiveisMovimentos(Tabuleiro tabuleiro);

    public static Peca comerPeca(Casa casa) {
        Peca peca = casa.getPeca();
        casa.setPeca(null);
        return peca;
    }

}
