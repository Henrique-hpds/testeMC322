import java.util.ArrayList;

abstract public class Peca {
    public final String cor;
    public int posicao;

    public Peca(String cor, int posicao) {
        this.cor = cor;
        this.posicao = posicao;
    }

    public String getCor() {
        return cor;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    abstract public ArrayList<Integer> getMovimento();
}
