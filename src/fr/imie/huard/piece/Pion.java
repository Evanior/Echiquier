package fr.imie.huard.piece;

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

    @Override
    public void deplacement(Position p) {
        if(positionPossible(p))
            setPosition(p);
    }
}
