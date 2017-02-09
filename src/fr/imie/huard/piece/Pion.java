package fr.imie.huard.piece;

import fr.imie.huard.echiquier.Echiquier;
import fr.imie.huard.echiquier.Position;

/**
 * Created by huard.cdi04 on 27/01/2017.
 */
public class Pion extends Piece {
    public Pion(char couleur, Position position) {
        super(couleur, position);
    }

    @Override
    public boolean positionPossible(Position p) {
        if(Echiquier.getInstance().getPiece(p).getValeur() == 0){
            return false;
        }
        return true;
    }

    @Override
    public char getSymbole() {
        return 'P';
    }

    @Override
    public byte getValeur() {
        return 1;
    }
}
