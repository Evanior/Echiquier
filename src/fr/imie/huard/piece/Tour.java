package fr.imie.huard.piece;

import fr.imie.huard.echiquier.Echiquier;
import fr.imie.huard.echiquier.Position;

/**
 * Created by huard.cdi04 on 27/01/2017.
 */
public class Tour extends Piece {
    public Tour(char couleur, Position position) {
        super(couleur, position,'T');
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
        return 'T';
    }

    @Override
    public byte getValeur() {
        return 5;
    }
}
