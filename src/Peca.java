import java.util.ArrayList;

abstract public class Peca {
    public final String cor;
    public int posicaoX, posicaoY;

    public Peca(String cor, int posicaoX, int posicaoY) {
        this.cor = cor;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }

    public String getCor() {
        return cor;
    }

    public int getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY() {
        this.posicaoY = posicaoX;
    }

    abstract public ArrayList<ArrayList<Integer>> getMovimento(int posicaoX, int posicaoY);
}
