import java.io.Serializable;
import java.util.Dictionary;
import java.util.Hashtable;

public class Perfil implements Entidade, Serializable {
    private static final long serialVersionUID = 100L;
    private String username;
    private int vitorias, derrotas;
    private Dictionary<Perfil, Integer> placares; // Adversário: João -> Vitórias: 2

    public Perfil(String username){
        this.username = username;
        this.placares = new Hashtable<>();
        // vitorias = derrotas = empates = 0;
    }
    
    public boolean criar(){
        return true;
    }

    public boolean destruir(){
        return true;
    }

    public double getTaxaVitoria(){
        if (vitorias + derrotas == 0)
            return 1;
        return (vitorias) / (vitorias + derrotas);
    }

    public String getUsername(){
        return username;
    }

    public int getVitorias(){
        return vitorias;
    }

    public int getDerrotas(){
        return derrotas;
    }

    public Dictionary<Perfil,Integer> getPlacares(){
        return placares;
    }

    public void adicionarVitoria(){
        vitorias++;
    }

    public void adicionarDerrota(){
        derrotas++;
    }

    // adiciona uma vitória ao placar relativo a outro player
    public void adicionarPlacar(Perfil oponente){
        placares.put(oponente, placares.get(oponente) + 1);
    }


}
