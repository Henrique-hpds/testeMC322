import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Maneger{
    
    // casas vazias
    static Icon casaBege = new ImageIcon("../imagens/bege.png");
	static Icon casaVerde = new ImageIcon("../imagens/verde.png");

    // peças brancas
	static Icon peaoBrancoCasaBranca = new ImageIcon("../imagens/peaoBrancoCasaBranca.png");
	static Icon peaoBrancoCasaPreta = new ImageIcon("../imagens/peaoBrancoCasaPreta.png");
	static Icon torreBrancaCasaPreta = new ImageIcon("../imagens/torreBrancaCasaPreta.png");
	static Icon torreBrancaCasaBranca = new ImageIcon("../imagens/torreBrancaCasaBranca.png");
	static Icon cavaloBrancoCasaBranca = new ImageIcon("../imagens/cavaloBrancoCasaBranca.png");
	static Icon cavaloBrancoCasaPreta = new ImageIcon("../imagens/cavaloBrancoCasaPreta.png");
	static Icon bispoBrancoCasaBranca = new ImageIcon("../imagens/bispoBrancoCasaBranca.png");
	static Icon bispoBrancoCasaPreta = new ImageIcon("../imagens/bispoBrancoCasaPreta.png");
	static Icon rainhaBrancaCasaBranca = new ImageIcon("../imagens/rainhaBrancaCasaBranca.png");
	static Icon rainhaBrancaCasaPreta = new ImageIcon("../imagens/rainhaBrancaCasaPreta.png");
	static Icon reiBrancoCasaPreta = new ImageIcon("../imagens/reiBrancoCasaPreta.png");
	static Icon reiBrancoCasaBranca = new ImageIcon("../imagens/reiBrancoCasaBranca.png");
    
    // peças pretas
    static Icon peaoPretoCasaBranca = new ImageIcon("../imagens/peaoPretoCasaBranca.png");
	static Icon peaoPretoCasaPreta = new ImageIcon("../imagens/peaoPretoCasaPreta.png");
	static Icon torrePretaCasaPreta = new ImageIcon("../imagens/torrePretaCasaPreta.png");
	static Icon torrePretaCasaBranca = new ImageIcon("../imagens/torrePretaCasaBranca.png");
	static Icon cavaloPretoCasaBranca = new ImageIcon("../imagens/cavaloPretoCasaBranca.png");
	static Icon cavaloPretoCasaPreta = new ImageIcon("../imagens/cavaloPretoCasaPreta.png");
	static Icon bispoPretoCasaBranca = new ImageIcon("../imagens/bispoPretoCasaBranca.png");
	static Icon bispoPretoCasaPreta = new ImageIcon("../imagens/bispoPretoCasaPreta.png");
	static Icon rainhaPretaCasaBranca = new ImageIcon("../imagens/rainhaPretaCasaBranca.png");
	static Icon rainhaPretaCasaPreta = new ImageIcon("../imagens/rainhaPretaCasaPreta.png");
	static Icon reiPretoCasaPreta = new ImageIcon("../imagens/reiPretoCasaPreta.png");
	static Icon reiPretoCasaBranca = new ImageIcon("../imagens/reiPretoCasaBranca.png");

    private JFrame tela;
    private Tabuleiro tabuleiro;

	private Perfil jogadorBrancas, jogadorPretas;
    private int pontuacaoBrancas, pontuacaoPretas;
     
    public Maneger(){
        tela = new JFrame();
		Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();
		tela.setSize((int)Math.round(tamanhoTela.getWidth()), (int)Math.round(tamanhoTela.getHeight()));
        tabuleiro = new Tabuleiro();
    }

	private void adicionarBotao(Icon img, int x, int y){
		JButton botao = new JButton(img);  
		botao.setBounds(x * 100, y * 100, 100, 100);

		tela.add(botao);
		tabuleiro.getCasa(x, y).setBotao(botao);
	}

    public boolean iniciarTabuleiro(){
        
        for (int i = 0; i < 8; i++) {
			for (int j = 2; j < 6; j++) {
				if((i + j) % 2 == 0){
                    adicionarBotao(casaBege, i, j);
				}else{
					adicionarBotao(casaVerde, i, j);
				}
			}
		}

		// adicionando peão preto
		for (int i = 0; i < 8; i++) {
			if(i % 2 == 0){
				adicionarBotao(peaoPretoCasaPreta, i, 1);
			}else{
				adicionarBotao(peaoPretoCasaBranca, i, 1);
			}
		}
		for (int i = 0; i < 8; i++) {
			if(i % 2 == 0){
				adicionarBotao(peaoBrancoCasaBranca, i, 6);
			}else{
				adicionarBotao(peaoBrancoCasaPreta, i, 6);

			}

		}

		adicionarBotao(torrePretaCasaBranca, 0, 0);
		adicionarBotao(torrePretaCasaPreta, 7, 0);
		adicionarBotao(torreBrancaCasaPreta, 0, 7);
		adicionarBotao(torreBrancaCasaBranca, 7, 7);

		adicionarBotao(cavaloPretoCasaPreta, 1, 0);
		adicionarBotao(cavaloPretoCasaBranca, 6, 0);
		adicionarBotao(cavaloBrancoCasaBranca, 1, 7);
		adicionarBotao(cavaloBrancoCasaPreta, 6, 7);

		adicionarBotao(bispoPretoCasaBranca, 2, 0);
		adicionarBotao(bispoPretoCasaPreta, 5, 0);
		adicionarBotao(bispoBrancoCasaPreta, 2, 7);
		adicionarBotao(bispoBrancoCasaBranca, 5, 7);
		
		adicionarBotao(rainhaPretaCasaPreta, 3, 0);
		adicionarBotao(rainhaBrancaCasaBranca, 3, 7);

		adicionarBotao(reiPretoCasaBranca, 4, 0);
		adicionarBotao(reiBrancoCasaPreta, 4, 7);

        return true;
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
