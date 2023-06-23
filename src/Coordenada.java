public class Coordenada{
    private int x, y;

    public Coordenada(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int x(){
        return this.x;
    }

    public int y(){
        return this.y;
    }

    public Coordenada soma(Coordenada coord){
        return new Coordenada(x + coord.x, y + coord.y);
    }
}