package fr.imie.huard.echiquier;

import fr.imie.huard.piece.Piece;

import java.awt.*;
import java.io.Serializable;

/**
 * Created by huard.cdi04 on 16/02/2017.
 */
public class Case extends Button implements Serializable {

    private Piece piece;
    private static int nbCase;

    public Case(Piece piece) {
        super(""+piece.getSymbole());
        this.piece = piece;
        if(piece.getCouleur() == 'N'){
            super.setForeground(new Color(0x0000C5));
        }else if(piece.getCouleur() == 'B'){
            super.setForeground(new Color(0xB1CB0F));
        }
        nbCase++;
    }

    public Piece getPiece() {
        return piece;
    }
}
