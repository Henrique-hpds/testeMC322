import javax.swing.*;  
public class ChessGameDemo {  

	static Icon casaBranca = new ImageIcon("imagens/branco.png");
	static Icon casaPreta = new ImageIcon("imagens/preto.png");

	public static JButton butao(Icon img, int x, int y, int largura, int altura){
		JButton b = new JButton(img);  
		b.setBounds(x,y,largura, altura);
		return b;
	}
    public static void main(String[] args) {  

		JFrame f=new JFrame();

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if((i + j) % 2 == 0)
					f.add(butao(casaBranca, 100 * i, 100 * j ,100,100));
				else
					f.add(butao(casaPreta, i, j ,100,100));
			}
		}
		
		
		f.setSize(2000,2000);//400 width and 500 height  
		f.setLayout(null);//using no layout managers 
		f.setVisible(true);//making the frame visible  
	}  
}  