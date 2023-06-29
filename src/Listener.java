import java.awt.event.*;
import java.util.ArrayList;

public class Listener implements ActionListener{
    private Casa casa;
    private Tabuleiro tabuleiro;
    private static ArrayList<Coordenada> listaMovimentos = null;
    private static Casa casaOrigem = null;

    public Listener (Casa casa, Tabuleiro tabuleiro){
        this.casa = casa;
        this.tabuleiro = tabuleiro;
    }

    public static void setListaMovimentos(ArrayList<Coordenada> listaMovimentos) {
        Listener.listaMovimentos = listaMovimentos;
    }

    public static void setCasaOrigem(Casa casaOrigem) {
        Listener.casaOrigem = casaOrigem;
    }

    public void actionPerformed(ActionEvent ev){
        if (casaOrigem == null){
            tabuleiro.movimentosValidos(casa);
            for(Coordenada coord: listaMovimentos)
                System.out.println(coord);  
        }
        else{
            tabuleiro.moverPeca(casaOrigem, casa, listaMovimentos);
            casaOrigem = null;
        }
        // tabuleiro.gameOver();

    }

    public ArrayList<Coordenada> getListaMovimentos() {

        return listaMovimentos;
    }

}
