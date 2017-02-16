package fr.imie.huard.piece;

import fr.imie.huard.echiquier.Position;
import fr.imie.huard.exception.ExceptionPosition;

import java.awt.*;
import java.io.Serializable;

/**
 * Created by huard.cdi04 on 27/01/2017.
 */
public abstract class Piece implements Serializable {
    private char couleur;
    private Position position;
    private char symbole;

    public Piece(char couleur, Position position, char symbole) {
        this.couleur = couleur;
        this.position = position;
        this.symbole = symbole;
    }

    public char getCouleur() {
        return couleur;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public abstract boolean positionPossible(Position p);

    public char getSymbole(){
        return this.symbole;
    }

    public abstract byte getValeur();

    public void deplacement(Position p) throws ExceptionPosition{
        if(!positionPossible(p)) {
            throw new ExceptionPosition("Déplacement non autoriser");
        }else {
            setPosition(p);
        }
    }

    @Override
    public String toString() {
        return getSymbole()+" - "+getValeur()+" - "+getPosition();
    }
}
