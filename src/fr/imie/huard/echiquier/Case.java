package fr.imie.huard.echiquier;

import fr.imie.huard.piece.Piece;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

/**
 * Created by huard.cdi04 on 16/02/2017.
 */
public class Case extends JButton implements Serializable {

    private Piece piece;
    private Position position;
    private static int nbCase;

    public Case(Piece piece) {
        super(""+piece.getSymbole());
        this.piece = piece;
        this.position = piece.getPosition();
        if(piece.getCouleur() == 'N'){
            super.setForeground(new Color(0x0000C5));
        }else if(piece.getCouleur() == 'B'){
            super.setForeground(new Color(0xB1CB0F));
        }
        nbCase++;
    }

    public Case(Position position) {
        this.position = position;
        this.piece = new Piece('o',position,' ') {
            @Override
            public boolean positionPossible(Position p) {
                return false;
            }

            @Override
            public byte getValeur() {
                return 0;
            }
        };
    }

    public Piece getPiece() {
        return piece;
    }

    public Position getPosition() {
        return position;
    }
}
