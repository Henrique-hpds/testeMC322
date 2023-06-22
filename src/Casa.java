import javax.swing.JButton;

public class Casa{
    
    private String cor;
    private Peca peca;
    private JButton botao;

    public Casa(){
        
    }

    public void setBotao(JButton botao){
        this.botao = botao;
    }

    public JButton getBotao(){
        return botao;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    public Peca getPeca() {
        return peca;
    }

    public boolean estaOcupado() { //considerando que a peca eh null por padrao
        if(getPeca() != null) {
            return true;
        }
        return false
    }
}
