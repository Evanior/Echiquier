package fr.imie.huard.piece;

import fr.imie.huard.echiquier.Position;

/**
 * Created by huard.cdi04 on 27/01/2017.
 */
public class Dame extends Piece {
    public Dame(char couleur, Position position) {
        super(couleur, position);
    }

    @Override
    public boolean positionPossible(Position p) {
        return true;
    }

    @Override
    public char getSymbole() {
        return 'D';
    }

    @Override
    public byte getValeur() {
        return 10;
    }

    @Override
    public void deplacement(Position p) {
        if(positionPossible(p))
            setPosition(p);
    }
}
