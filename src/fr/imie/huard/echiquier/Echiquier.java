package fr.imie.huard.echiquier;

import fr.imie.huard.piece.CollectionPieces;
import fr.imie.huard.piece.Piece;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.*;
import java.io.*;
import java.util.stream.Stream;

/**
 * Created by huard.cdi04 on 27/01/2017.
 */
public class Echiquier extends JFrame {
    private static Echiquier ourInstance = new Echiquier();
    private CollectionPieces maCollection = new CollectionPieces();
    GridLayout plateau;

    public static Echiquier getInstance() {
        return ourInstance;
    }

    private Echiquier() {
        this.setSize(new DimensionUIResource(500,500));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        plateau = new GridLayout(8,8);
        this.setLayout(plateau);

        this.setVisible(true);
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
                .orElse(new Piece('o', new Position(0,0),' ') {
                    @Override
                    public boolean positionPossible(Position p) {
                        return false;
                    }

                    @Override
                    public byte getValeur() {
                        return 0;
                    }
                });
    }

    public int getPoints(char couleur){
        int val = 0;
        Stream<Piece> p = maCollection.stream().filter(x -> x.getCouleur() == couleur)
                .distinct();
        Piece tab[] = (Piece[])p.toArray();
        for (Piece piece: tab) {
            val += piece.getValeur();
        }
        return val;
    }

    public void afficher(){
        System.out.println("  | A | B | C | D | E | F | G | H |");
        System.out.println("  ---------------------------------");
        Position[] tabPlateau = new Position[64];
        int index = 0;
        for (int i = 1; i <= 8; i++){
            for (int j = 1; j <= 8; j++){
                tabPlateau[index] = new Position(i,j);
                Case c = new Case(getPiece(tabPlateau[index]));
                if(index % 2 == 0){
                    c.setBackground(Color.BLACK);
                    if(i % 2 == 0) {
                        c.setBackground(Color.WHITE);
                    }
                }else {
                    c.setBackground(Color.WHITE);
                    if(i % 2 == 0) {
                        c.setBackground(Color.BLACK);
                    }
                }
                this.getContentPane().add(c);
                switch (j){
                    case 1 :
                        System.out.print(i+" | "+getPiece(tabPlateau[index]).getSymbole()+" | ");
                        break;
                    case 8 :
                        System.out.println(getPiece(tabPlateau[index]).getSymbole()+" | ");
                        break;
                    default:
                        System.out.print(getPiece(tabPlateau[index]).getSymbole()+" | ");
                        break;
                }
                index++;
            }
            System.out.println("  ---------------------------------");
        }
        this.setVisible(true);
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
