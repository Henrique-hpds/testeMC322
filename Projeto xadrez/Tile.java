//ira compor o tabuleiro podemos enxergar como uma matriz com 64 tiles

import java.security.PublicKey;

public abstract class Tile {
    int coordenada_x, coordenada_y;
    //podemos fazer algo envolvendo polimorfismo para termos uma classe mae tile e ter suas classes filhas em que teremos uma para representar um vazio e outro cheio
    public Tile(int coordenada_x, int coordenada_y) {
        this.coordenada_x = coordenada_x;
        this.coordenada_y = coordenada_y;
    }

    public int getCoordenada_x() {
        return coordenada_x;
    }
    //saber se ele esta ocupado ou n, sera definido em uma subclasse
    public abstract boolean isTileOccupied();

    public abstract Piece getPiece();

    public static final class EmptyTile extends Tile {
        public EmptyTile(int coordenada_x, int coordenada_y) {
            super(coordenada_x, coordenada_y);
        }

        @Override
        public boolean isTileOccupied() {
            return false;
        }

        @Override
        public Piece getPiece() {
            return null;
        }
 
    }

    public static final class OccupiedTile extends Tile {

        Piece pieceOnTile;

        public OccupiedTile(int coordenada_x, int coordenada_y, Piece pieceOnTile) {
            super(coordenada_x, coordenada_y);
            this.pieceOnTile = pieceOnTile;
        }

        @Override
        public boolean isTileOccupied() {
            return true;
        }

        @Override
        public Piece getPiece() {
            return pieceOnTile;
        }

    }
}