import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;   
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Manager{

    private JFrame tela;
    private Tabuleiro tabuleiro;

	private static Perfil jogadorBrancas, jogadorPretas;
	private List<Peca> pecasPretasCapturadas, pecasBrancasCapturadas;

    public Manager(Perfil jogadorBranco, Perfil jogadorPreto){
        this.jogadorBrancas = jogadorBranco;
		this.jogadorPretas = jogadorPreto;

		pecasPretasCapturadas = new ArrayList<Peca>();
		pecasBrancasCapturadas = new ArrayList<Peca>();

		tela = new JFrame();
		tela.setSize(1300, 837);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

		JLabel nomeBrancas = new JLabel(jogadorBranco.getUsername());
		JLabel nomePretas = new JLabel(jogadorPreto.getUsername());
	    
		nomeBrancas.setBounds(880, 30, 110, 30);
		nomePretas.setBounds(1080, 30, 110, 30);

		tela.add(nomeBrancas);
		tela.add(nomePretas);


		tela.setLayout(null);
		tela.setVisible(true);
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

	public static void gameOver(String cor){
		// if(cor.equals("preto")){
		// 	jogadorBrancas.adicionarDerrota();
		// 	jogadorPretas.adicionarVitoria();
		// } else if(cor.equals("branco")){
		// 	jogadorBrancas.adicionarVitoria();
		// 	jogadorPretas.adicionarDerrota();
		// }

		// ArrayList 

		
	}
}