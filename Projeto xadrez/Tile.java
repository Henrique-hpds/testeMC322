//ira compor o tabuleiro podemos enxergar como uma matriz com 64 tiles

import java.security.PublicKey;

public abstract class Tile {
    int tileCoordinate;
    //podemos fazer algo envolvendo polimorfismo para termos uma classe mae tile e ter suas classes filhas em que teremos uma para representar um vazio e outro cheio
    public Tile(int tileCoordinate) {
        this.tileCoordinate = tileCoordinate;
    }

    //saber se ele esta ocupado ou n, sera definido em uma subclasse
    public abstract boolean isTileOccupied();

    public abstract Piece getPiece();

    public static final class EmptyTile extends Tile {
        public EmptyTile(int tileCoordinate) {
            super(tileCoordinate);
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

        public OccupiedTile(int tileCoordinate, Piece pieceOnTile) {
            super(tileCoordinate);
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