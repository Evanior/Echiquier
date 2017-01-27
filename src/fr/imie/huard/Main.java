package fr.imie.huard;

import fr.imie.huard.echiquier.Echiquier;
import fr.imie.huard.echiquier.Position;
import fr.imie.huard.piece.*;

/**
 * Created by huard.cdi04 on 27/01/2017.
 */
public class Main {

    public static void main(String[] args){
        /*Roi roiNoir = new Roi('N',new Position(8,5));
        Roi roiBlanc = new Roi('B',new Position(1,5));
        Dame dameNoir = new Dame('N',new Position(8,4));
        Dame dameBlanc = new Dame('B',new Position(1,4));
        Echiquier.getInstance().ajouterPiece(roiNoir);
        Echiquier.getInstance().ajouterPiece(roiBlanc);
        Echiquier.getInstance().ajouterPiece(dameNoir);
        Echiquier.getInstance().ajouterPiece(dameBlanc);*/
        Echiquier.getInstance().afficher();
        Echiquier.getInstance().chargement();
        //Echiquier.getInstance().afficher();
        //Echiquier.getInstance().sauvgarde();
    }
}
