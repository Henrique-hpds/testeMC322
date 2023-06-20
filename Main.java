import javax.swing.*;  

public class Main {  

    static Icon casaBege = new ImageIcon("imagens/bege.png");
	static Icon casaVerde = new ImageIcon("imagens/verde.png");

	public static JButton botao(Icon img, int x, int y, int largura, int altura){
		JButton b = new JButton(img);  
		b.setBounds(x,y,largura, altura);
		return b;
	}

    public static void main(String[] args) {  

		Maneger jogo = new Maneger();		
		JFrame tela = new JFrame();

		jogo.iniciarTabuleiro();

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