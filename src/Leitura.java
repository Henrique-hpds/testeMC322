import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Leitura {
    public static ArrayList<Perfil> lerPossiveisJogadores(){
        
        ArrayList<Perfil> listaJogadoresPossiveis = new ArrayList<Perfil>();
		
        try {
			try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("../dadosJogadores/jogadores.ser"))) {
                while(true){
                	Perfil perfil = (Perfil)input.readObject();
                	listaJogadoresPossiveis.add(perfil);
                }
            }
		}catch(EOFException fim){}
        catch(ClassNotFoundException naoAchouClasse){
			System.exit(1);
		}catch(IOException exe){
			exe.printStackTrace();
        }

        return listaJogadoresPossiveis;
    }
	
	public static boolean gravarPerfil(Perfil perfil){

        ArrayList<Perfil> listaPerfils = lerPossiveisJogadores();
        listaPerfils.add(perfil);

        try{
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("../dadosJogadores/jogadores.ser"));
            for (Perfil atual : listaPerfils) {
                output.writeObject(atual);
            }
            output.flush();
            output.close();
        }catch(IOException excecao){
            excecao.printStackTrace();
            return false;
        }

        return true;
    }
}
