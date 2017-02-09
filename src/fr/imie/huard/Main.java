package fr.imie.huard;

import fr.imie.huard.echiquier.Echiquier;
import fr.imie.huard.echiquier.Position;
import fr.imie.huard.piece.*;

/**
 * Created by huard.cdi04 on 27/01/2017.
 */
public class Main {

    public static void main(String[] args){
        Echiquier monEchiquier =  Echiquier.getInstance();
        Roi roiNoir = new Roi('N',new Position(8,5));
        Roi roiBlanc = new Roi('B',new Position(1,5));
        Dame dameNoir = new Dame('N',new Position(8,4));
        Dame dameBlanc = new Dame('B',new Position(1,4));
        Pion pionBlancA = new Pion('B',new Position(2,1));
        Pion pionBlancB = new Pion('B',new Position(2,2));
        Pion pionBlancC = new Pion('B',new Position(2,3));
        Pion pionBlancD = new Pion('B',new Position(2,4));
        Pion pionBlancE = new Pion('B',new Position(2,5));
        Pion pionBlancF = new Pion('B',new Position(2,6));
        Pion pionBlancG = new Pion('B',new Position(2,7));
        Pion pionBlancH = new Pion('B',new Position(2,8));
        Pion pionNoireA = new Pion('N',new Position(7,1));
        Pion pionNoireB = new Pion('N',new Position(7,2));
        Pion pionNoireC = new Pion('N',new Position(7,3));
        Pion pionNoireD = new Pion('N',new Position(7,4));
        Pion pionNoireE = new Pion('N',new Position(7,5));
        Pion pionNoireF = new Pion('N',new Position(7,6));
        Pion pionNoireG = new Pion('N',new Position(7,7));
        Pion pionNoireH = new Pion('N',new Position(7,8));
        monEchiquier.ajouterPiece(roiNoir);
        monEchiquier.ajouterPiece(roiBlanc);
        monEchiquier.ajouterPiece(dameNoir);
        monEchiquier.ajouterPiece(dameBlanc);
        monEchiquier.ajouterPiece(pionBlancA);
        monEchiquier.ajouterPiece(pionBlancB);
        monEchiquier.ajouterPiece(pionBlancC);
        monEchiquier.ajouterPiece(pionBlancD);
        monEchiquier.ajouterPiece(pionBlancE);
        monEchiquier.ajouterPiece(pionBlancF);
        monEchiquier.ajouterPiece(pionBlancG);
        monEchiquier.ajouterPiece(pionBlancH);
        monEchiquier.ajouterPiece(pionNoireA);
        monEchiquier.ajouterPiece(pionNoireB);
        monEchiquier.ajouterPiece(pionNoireC);
        monEchiquier.ajouterPiece(pionNoireD);
        monEchiquier.ajouterPiece(pionNoireE);
        monEchiquier.ajouterPiece(pionNoireF);
        monEchiquier.ajouterPiece(pionNoireG);
        monEchiquier.ajouterPiece(pionNoireH);
        monEchiquier.afficher();
    }
}
