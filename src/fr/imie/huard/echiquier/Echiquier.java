package fr.imie.huard;

import fr.imie.huard.piece.CollectionPieces;
import fr.imie.huard.piece.Piece;

/**
 * Created by huard.cdi04 on 27/01/2017.
 */
public class Echiquier {
    private static Echiquier ourInstance = new Echiquier();
    private CollectionPieces maCollection = new CollectionPieces();

    public static Echiquier getInstance() {
        return ourInstance;
    }

    private Echiquier() {
    }

    public CollectionPieces getMaCollection() {
        return maCollection;
    }

    public void ajouterPiece(Piece p){
        maCollection.add(p);
    }
}
