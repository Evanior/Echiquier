package fr.imie.huard.piece;

import fr.imie.huard.echiquier.Position;

import java.io.Serializable;

/**
 * Created by huard.cdi04 on 27/01/2017.
 */
public abstract class Piece implements Serializable {
    private char couleur;
    private Position position;

    public Piece(char couleur, Position position) {
        this.couleur = couleur;
        this.position = position;
    }

    public char getCouleur() {
        return couleur;
    }

    public void setCouleur(char couleur) {
        this.couleur = couleur;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public abstract boolean positionPossible(Position p);

    public char getSymbole(){
        return ' ';
    }

    public abstract byte getValeur();

    public abstract void deplacement(Position p);

    @Override
    public String toString() {
        return getSymbole()+" - "+getValeur()+" - "+getPosition();
    }
}
