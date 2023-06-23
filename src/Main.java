import javax.swing.*;
import java.awt.event.*;


public class Main{  
    public static void main(String[] args){  

		Manager jogo = new Manager();		

		jogo.iniciarTabuleiro();
		
		jogo.getTela().setSize(2000,2000);    
		jogo.getTela().setLayout(null);
		jogo.getTela().setVisible(true);
		
		Icon sim = new ImageIcon("../imagens/cavaloPretoCasaBranca.png");
		jogo.getTabuleiro().getCasa(1, 0).getBotao().setPressedIcon(sim);

		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				jogo.getTabuleiro().getCasa(i, j).getBotao().addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
							System.out.println("Teste Teste");
					}
				});
			}
		}

		// jogo.getTabuleiro().getCasa(0, 0).getBotao().setAction(null);
		// 		// jogo.getTabuleiro().getCasa(0, 0).getBotao().setIcon(sim);
		
	}  
}  