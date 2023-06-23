import javax.swing.*;
import java.awt.event.*;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Main{  
    public static void main(String[] args){  

		Maneger jogo = new Maneger();
		Perfil jBrancas, jPretas;

		try {
			ObjectInputStream input = new ObjectInputStream(new FileInputStream(""));

			// fazer código para pegar nome dos jogadores
			String jBrancasString = "Henrique", jPretasString = "Lima";

			while(true){
				Perfil perfil = (Perfil)input.readObject();
				if(perfil.)
			}

			Perfil jBrancas;
		}catch(EOFException fim){
			return;
		}catch(ClassNotFoundException naoAchouClasse){
			

		}catch(IOException exe){
			exe.printStackTrace();
		}
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