import javax.swing.*;
import java.awt.event.*;


public class Main{  
    public static void main(String[] args){  

		Maneger jogo = new Maneger();		

		jogo.iniciarTabuleiro();
		
		jogo.getTela().setSize(2000,2000);    
		jogo.getTela().setLayout(null);
		jogo.getTela().setVisible(true);
		
		Icon sim = new ImageIcon("imagens/cavaloPretoCasaBranca.png");
		jogo.getTabuleiro().getCasa(0, 0).getBotao().setPressedIcon(sim);

		// jogo.getTabuleiro().getCasa(0, 0).getBotao().setAction(null);
		// 		// jogo.getTabuleiro().getCasa(0, 0).getBotao().setIcon(sim);
		
	}  
}  