package fr.imie.huard.piece;

import fr.imie.huard.echiquier.Position;
import fr.imie.huard.exception.ExceptionPosition;

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
