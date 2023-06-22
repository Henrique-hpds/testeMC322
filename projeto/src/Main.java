import javax.swing.*;

public class Main{  
    public static void main(String[] args){  

		Maneger jogo = new Maneger();		

		jogo.iniciarTabuleiro();
		
		jogo.getTela().setSize(2000,2000);    
		jogo.getTela().setLayout(null);
		jogo.getTela().setVisible(true);
		
		Icon sim = new ImageIcon("imagens/cavaloPretoCasaBranca.png");

		jogo.getTabuleiro().getCasa(0, 0).getBotao().addActionListener();
				// jogo.getTabuleiro().getCasa(0, 0).getBotao().setIcon(sim);
		
	}  
}  