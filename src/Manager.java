import javax.swing.JButton;   
import javax.swing.JFrame;
import java.awt.event.*;
import java.util.ArrayList;


public class Manager{

    private JFrame tela;
    private Tabuleiro tabuleiro;

	private Perfil jogadorBrancas, jogadorPretas;
    private int pontuacaoBrancas, pontuacaoPretas;

    public Manager(){
        tela = new JFrame();
		tela.setSize(800, 800);
        tabuleiro = new Tabuleiro();
		tabuleiro.posicaoInicialTabuleiro();
		

		for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++){
				Casa casa = tabuleiro.getCasa(i, j);
				JButton botao = casa.getBotao();

				TestListener teste = new TestListener(casa, tabuleiro);
				casa.getBotao().addActionListener(teste);

				tela.add(botao);
			}
    }

    public JFrame getTela(){
        return tela;
    }

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

}