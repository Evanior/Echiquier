package fr.imie.huard.echiquier;

import fr.imie.huard.piece.CollectionPieces;
import fr.imie.huard.piece.Piece;

import java.io.*;

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

    public Piece getPiece(Position position){
        return maCollection.stream().filter(x -> x.getPosition().memePosition(position))
                .findAny()
                .orElse(new Piece('o', new Position(0,0)) {
                    @Override
                    public boolean positionPossible(Position p) {
                        return false;
                    }

                    @Override
                    public byte getValeur() {
                        return 0;
                    }

                    @Override
                    public void deplacement(Position p) {

                    }
                });
    }

    public int getPoints(char couleur){
        return 0;
    }

    public void afficher(){
        System.out.println("  | A | B | C | D | E | F | G | H |");
        System.out.println("  ---------------------------------");
        Position[] plateau = new Position[64];
        int index = 0;
        for (int i = 1; i <= 8; i++){
            for (int j = 1; j <= 8; j++){
                plateau[index] = new Position(i,j);
                switch (j){
                    case 1 :
                        System.out.print(i+" | "+getPiece(plateau[index]).getSymbole()+" | ");
                        break;
                    case 8 :
                        System.out.println(getPiece(plateau[index]).getSymbole()+" | ");
                        break;
                    default:
                        System.out.print(getPiece(plateau[index]).getSymbole()+" | ");
                        break;
                }
                index++;
            }
            System.out.println("  ---------------------------------");
        }
    }

    public void sauvgarde(){
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new
                    FileOutputStream(new File("sauvgarde.txt"))));//crée un fichier forme.txt si il n'existe pas
            objectOutputStream.writeObject((CollectionPieces)getMaCollection());//sauvegarder la liste dans le fichier
            objectOutputStream.flush();//par securiter on flush
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            try {
                objectOutputStream.close();
            }catch (Exception e){

            }
        }
    }

    public void chargement(){
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new
                    File("sauvgarde.txt"))));//ouverture du fichier en lecture
            maCollection.addAll((CollectionPieces)objectInputStream.readObject());//ajout du contenu du fichier
            this.afficher();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace ();
        } finally {
            try {
                objectInputStream.close();
            }catch (Exception e){

            }
        }
    }
}
