import javax.swing.*;  

public class Main {  

	static Icon casaBege = new ImageIcon("imagens/bege.png");
	static Icon casaVerde = new ImageIcon("imagens/verde.png");
	static Icon peaoBrancoCasaBranca = new ImageIcon("imagens/peaoBrancoCasaBranca.png");
	static Icon peaoBrancoCasaPreta = new ImageIcon("imagens/peaoBrancoCasaPreta.png");
	static Icon torreBrancaCasaPreta = new ImageIcon("imagens/torreBrancaCasaPreta.png");
	static Icon torreBrancaCasaBranca = new ImageIcon("imagens/torreBrancaCasaBranca.png");
	static Icon cavaloBrancoCasaBranca = new ImageIcon("imagens/cavaloBrancoCasaBranca");
	static Icon cavaloBrancoCasaPreta = new ImageIcon("imagens/cavaloBrancoCasaPreta");
	static Icon bispoBrancoCasaBranca = new ImageIcon("imagens/bispoBrancoCasaBranca");
	static Icon bispoBrancoCasaPreta = new ImageIcon("imagens/bispoBrancoCasaPreta");
	static Icon rainhaBrancaCasaBranca = new ImageIcon("imagens/rainhaBrancaCasaBranca");
	static Icon rainhaBrancaCasaPreta = new ImageIcon("imagens/rainhaBrancaCasaPreta");
	static Icon reiBrancoCasaPreta = new ImageIcon("imagens/reiBrancoCasaPreta");
	static Icon reiBrancoCasaBranca = new ImageIcon("imagens/reiBrancoCasaBranca");

	public static JButton botao(Icon img, int x, int y, int largura, int altura){
		JButton b = new JButton(img);  
		b.setBounds(x,y,largura, altura);
		return b;
	}

    public static void main(String[] args) {  

		JFrame tela = new JFrame();

		// inicia o tabuleiro vazio
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if((i + j) % 2 == 0)
					tela.add(botao(casaBege, 100 * i, 100 * j ,100,100));
				else
					tela.add(botao(casaVerde, 100 * i, 100 * j ,100,100));
			}
		}
		
		tela.setSize(2000,2000);  
		tela.setLayout(null);
		tela.setVisible(true);  
	}  
}  